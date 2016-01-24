package ParsingClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;


public class Parser {
	public Data getValues(FileInputStream stream) throws FileNotFoundException, IOException {
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		XSSFSheet sheet = workbook.getSheetAt(0);
// These diamond operators "<>" are breaking the web app online on OpenShift. Fill them up ya dingus!
		Map<String, Integer> skuMap = new HashMap<>();
		Map<String, Double> revenueMap = new HashMap<>();
		
		ArrayList<Integer> missingList = new ArrayList<>();
		ArrayList<Integer> unfulfilledList = new ArrayList<>();
		Data data = new Data();
		
		for(int j = 1; j < sheet.getLastRowNum() + 1; j++){
			Row rowString = sheet.getRow(j);
			Row fulfillmentString = sheet.getRow(j);
			String sku = "";
			int numOfSku = 0;
			double revenue = 0;
			
			try{
				// This gets the STRING value
				sku = rowString.getCell(20).getStringCellValue();
				
				// This gets the numeric value, or QUANTITY
				numOfSku = (int) rowString.getCell(16).getNumericCellValue();
				
				revenue = rowString.getCell(11).getNumericCellValue();
				
				if(skuMap.containsKey(sku)){
					// Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
					int previousNumOfSkus = skuMap.get(sku);
					int updatedNumOfSkus = previousNumOfSkus + numOfSku;
					skuMap.put(sku,updatedNumOfSkus);
				}else{
					skuMap.put(sku, numOfSku);
				}
				
				if(revenueMap.containsKey(sku)){
					double previousRev = revenueMap.get(sku);
					double updateRev = previousRev + revenue;
					revenueMap.put(sku, updateRev);
				}else{
					revenueMap.put(sku, revenue);
				}
				
				if(!fulfillmentString.getCell(23).getStringCellValue().equals("fulfilled")){
				    unfulfilledList.add(j+1);
				}
			}catch(NullPointerException e){
					missingList.add(j + 1);				
			}catch(IllegalStateException e){
				System.out.println("Conversion Issue with Row Number: "+ (j + 1));
			}					
		}
		
		ArrayList<String> keyList = new ArrayList<>();
		ArrayList<Integer> valueList = new ArrayList<>();
		ArrayList<String> revenueList = new ArrayList<>();
		DecimalFormat format = new DecimalFormat("#0.00");
		
		for(String key : skuMap.keySet()){
		    System.out.println(key + " = " + skuMap.get(key) +  "\t\tRevenue: $" + format.format(revenueMap.get(key)));
		    keyList.add(key);
		    valueList.add(skuMap.get(key));
		    revenueList.add(format.format(revenueMap.get(key)));
		}
		
		double totalRevenue = 0;
		for(String x: revenueList) {
			totalRevenue += Double.parseDouble(x);
		}
			
		data.setTotalRevenue(format.format(totalRevenue));
		data.setUnfulfilledList(unfulfilledList);
		data.setMissingList(missingList);
		data.setKeyList(keyList);
		data.setValueList(valueList);
		data.setRevenueList(revenueList);
		
			workbook.close();
			return data;
	}
}