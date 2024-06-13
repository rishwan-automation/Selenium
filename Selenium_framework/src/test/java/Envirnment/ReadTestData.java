package Envirnment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadTestData {
	public static String fileName = "C:/Users/rishwank/Desktop/Selenium/Lokavant_Maven/src/test/java/Envirnment/TestData.properties";
//	Properties prop = readPropertiesFile("C:/Users/rishwank/Desktop/Selenium/Lokavant_Maven/src/test/java/Envirnment/TestData.properties");
//    System.out.println("prop==>"+prop);
    public static String url =  ReadTestData.getTheValue(fileName,"url");
  
//	public static void main(String args[]) throws IOException {
////		static String fileName = "TestData.properties";
//	      
////	      System.out.println("username: "+ prop.getProperty("username"));
////	      System.out.println("password: "+ prop.getProperty("password"));
////	      System.out.println("URL: "+prop.getProperty("url"));
//	 }

	 
	 public static String getTheValue(String fileName,String strKey) {
	      FileInputStream fis = null;
	      Properties prop = null;
	      String strValue = null;
	      try {
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         strValue = prop.getProperty(strKey);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } finally {
	         try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
	      return strValue;
	   }

}
