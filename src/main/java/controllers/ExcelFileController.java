package controllers;

import ParsingClass.Data;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import ParsingClass.Parser;
 
@Controller
public class ExcelFileController {	
	ModelAndView modelandview = new ModelAndView("results");
	ModelAndView errorModel = new ModelAndView("error");
	
    private static final Logger logger = LoggerFactory.getLogger(ExcelFileController.class);
 
    @RequestMapping(value = "/results", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView uploadFileHandler(
            @RequestParam("file") MultipartFile file) {
 
    	Parser parser = new Parser();
    	
        if (!file.isEmpty()) {
            try {
            	            	
                byte[] bytes = file.getBytes();
 
                // Creating the directory to store file
                String rootPath = System.getProperty("catalina.home");
                File dir = new File(rootPath + File.separator + "tmpFiles");
                if (!dir.exists())
                    dir.mkdirs();
 
                // Create the file on server
                File serverFile = new File(dir.getAbsolutePath()
                        + File.separator + "excelFile");
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();
                
                Data data = parser.getValues(new FileInputStream(serverFile));
                modelandview.addObject("data", data);
                
                logger.info("Server File Location="
                        + serverFile.getAbsolutePath());

                return modelandview;
       
            } catch (Exception e) {
            	
                return errorModel;
            }
        } else {
            return errorModel;
        }
    }
}