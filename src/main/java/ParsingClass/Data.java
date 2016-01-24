package ParsingClass;

import java.util.ArrayList;

public class Data {
	ArrayList<String> keyList;
	ArrayList<Integer> valueList;
	ArrayList<String> revenueList;
	ArrayList<Integer> missingList;
	ArrayList<Integer> unfulfilledList;
	String totalRevenue;
	 
	public void setKeyList(ArrayList<String> keyList) {
		this.keyList = keyList; 
	}

	public void setValueList(ArrayList<Integer> valueList) {
		this.valueList = valueList;
	}
	
	public void setRevenueList(ArrayList<String> revenueList) {
		this.revenueList = revenueList;
	}
	
	public void setMissingList(ArrayList<Integer> missingList) {
		this.missingList = missingList;
	}
	
	public void setUnfulfilledList(ArrayList<Integer> unfulfilledList) {
		this.unfulfilledList = unfulfilledList; 
	}
	
	public void setTotalRevenue(String totalRevenue){
		this.totalRevenue = totalRevenue;
	}

	public ArrayList<String> getKeyList() {
		return keyList;	
	}

	public ArrayList<Integer> getValueList() {
		return valueList;
	}
	
	public ArrayList<String> getRevenueList() {
		return revenueList;
	}
	
	public ArrayList<Integer> getMissingList() {
		return missingList;
	}
	
	public ArrayList<Integer> getUnfulfilledList() {
		return unfulfilledList;	
	}
	
	public String getTotalRevenue() {
		return totalRevenue;
	}
}