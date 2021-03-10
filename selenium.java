package Maven_Project.Cirus;
import java.awt.Dimension;
import java.awt.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
public class Cirus_Login {
	
	public static WebDriver driver;
	
	@Test
      public  void Cirus_ForgetPassword() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 driver =  new ChromeDriver();
		 driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;

	       
	          
	 //Forgot Password Page
		 driver.get("https://lpp.cirrusresponse.com/");  
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Forgot Your Password?")).click();
		 driver.findElement(By.id("email")).sendKeys("dhamalatara2052@gmail.com");
		 Thread.sleep(3000);
		 driver.findElement(By.className("btn-success")).click();
		 System.out.println("Email Send Successfully");
		 driver.findElement(By.className("btn-success")).click(); 
		 Thread.sleep(2000); 
		 
	
		 //LoginPage
	     driver.get("https://lpp.cirrusresponse.com/");  
		 driver.findElement(By.id("email")).sendKeys("r.roy.r911@gmail.com");
	     driver.findElement(By.id("password")).sendKeys("C$rruS@8)0");
	     driver.findElement(By.className("btn-success")).click();
	     System.out.println("Login Done with Click");	
	     Thread.sleep(2000);
	
	
	 	
         //DashboardRefresh
		 driver.get("https://lpp.cirrusresponse.com/admin/dashboard");
	     driver.findElement(By.className("updateDashboard")).click();
	     System.out.println("Dashboard Refresh successfully");
	     Thread.sleep(2000);
	
	

	 //GLOBAL SETTINGS//
	        //1. General
	       driver.get("https://lpp.cirrusresponse.com/admin/setting");
	       driver.findElement(By.className("btn-primary")).click();
	       System.out.println("General Settings update successfully");	
	       Thread.sleep(2000);
	       
	       //2. SMS
	       
	       driver.findElement(By.linkText("SMS")).click();
	       driver.findElement(By.className("btn-primary")).click();
	       System.out.println("SMS Settings update successfully"); 
	       Thread.sleep(2000);
	       
	       //3. Email Settings
	       driver.findElement(By.linkText("Email Settings")).click();
	       driver.findElement(By.className("btn-primary")).click();
	       System.out.println("Email Settings update successfully"); 
	       Thread.sleep(2000);
	       
	    
 //Currency 
	       
	       //Add
	       driver.get("https://lpp.cirrusresponse.com/admin/currency");
	       driver.findElement(By.id("create_record")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.id("name")).sendKeys("Currency1");
	       driver.findElement(By.id("code")).sendKeys("12345");
	       Thread.sleep(3000);
	       driver.findElement(By.id("action_button")).click();
	       System.out.println("Currency Added successfully");
	       Thread.sleep(5000);
	       
	       
	    //Delete
	       driver.get("https://lpp.cirrusresponse.com/admin/currency");
	       driver.findElement(By.xpath("//table[@id='currency']/tbody/tr/td[6]/button[2]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.id("ok_button")).click();
	       System.out.println("Currency Deleted successfully");
	       Thread.sleep(5000); 
	       
	     //Search
	       driver.get("https://lpp.cirrusresponse.com/admin/currency");
	       driver.findElement(By.cssSelector("#currency_filter .form-control")).click();
	       driver.findElement(By.cssSelector("#currency_filter .form-control")).sendKeys("tara_test");
	       System.out.println("Search Done Successfully");
	       Thread.sleep(5000);
	       
	  //Edit
	       driver.get("https://lpp.cirrusresponse.com/admin/currency");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//table[@id='currency']/tbody/tr/td[6]/button")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.id("action_button")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.id("cancel_button")).click();
	       System.out.println("Currency Edited successfully");  
	       Thread.sleep(5000); 
	       

	    //UserRole
	          //Add        
	       driver.get("https://lpp.cirrusresponse.com/admin/userrole");
	       Thread.sleep(3000);
	       driver.findElement(By.id("create_record")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.id("name")).sendKeys("UserRole");
	       Thread.sleep(3000);
	       driver.findElement(By.id("action_button")).click();
	       Thread.sleep(3000);
	       System.out.println("UserRole Added successfully");
	       Thread.sleep(5000);
	       
	       //Search
	       driver.get("https://lpp.cirrusresponse.com/admin/userrole");
	       driver.findElement(By.cssSelector("#userRole_filter .form-control")).click();
	       driver.findElement(By.cssSelector("#userRole_filter .form-control")).sendKeys("tara_test");
	       System.out.println("Search Done Successfully");
	       Thread.sleep(5000);
	       
	       
	     //Delete
	       driver.get("https://lpp.cirrusresponse.com/admin/userrole");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//table[@id='userRole']/tbody/tr/td[6]/button[3]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.id("ok_button")).click();
	       System.out.println("UserRole Deleted successfully");
	       Thread.sleep(5000);
	       
	  //Edit
	     
	       driver.get("https://lpp.cirrusresponse.com/admin/userrole");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//table[@id='userRole']/tbody/tr/td[6]/button[2]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.id("action_button")).click();
	       Thread.sleep(3000);
	       System.out.println("UserRole Edited successfully");
	       Thread.sleep(5000); 
	       
	       
	//Users
	       //Add 
	      driver.get("https://lpp.cirrusresponse.com/admin/users");
	       driver.findElement(By.id("create_record")).click();
	       Thread.sleep(5000);
	       driver.findElement(By.id("name")).sendKeys("User3");
	       driver.findElement(By.id("last_name")).sendKeys("User2");
	       driver.findElement(By.id("email")).sendKeys("dhamalatara10205255@gmail.com");
	       
	       Select userType = new Select(driver.findElement(By.id("userType")));
	       userType.selectByVisibleText("Cirrus Administrator");
	       userType.selectByIndex(1);
	       Thread.sleep(5000);
	      
	     
                
	          driver.findElement(By.cssSelector(".select2-selection__rendered")).click();
              Thread.sleep(5000);
              driver.findElement(By.cssSelector(".select2-search__field")).sendKeys(Keys.DOWN);
              Thread.sleep(5000);
              driver.findElement(By.cssSelector(".select2-search__field")).sendKeys(Keys.ENTER); 
              Thread.sleep(5000);
	     
              js.executeScript("window.scrollBy(0,5000)");
         
	       /*WebElement uploadElement = driver.findElement(By.xpath("//form[@id='sample_form']/div[6]/div/input")); */
	       
	       WebElement uploadElement = driver.findElement(By.className("form-control"));   
	       uploadElement.sendKeys("C:\\Users\\Tank\\Desktop\\Image\\sukutebeach\\test.jpg");
	       Thread.sleep(3000); 
              
	       driver.findElement(By.id("action_button")).click();
	       System.out.println("User Added successfully");
	       
	        
	       
	       
	       //Search
	       driver.get("https://lpp.cirrusresponse.com/admin/users");
	       Thread.sleep(5000);
	       Select userType1 = new Select(driver.findElement(By.id("searchUserType")));
	       userType1.selectByVisibleText("Cirrus Administrator");
	       
	       Select userRole2=new Select(driver.findElement(By.id("searchUserRole")));
	       userRole2.selectByVisibleText("Cirrus Administrator");
	       driver.findElement(By.id("searchBtn")).click();
	       System.out.println("Users Search Done Successfully");
	       Thread.sleep(5000);
	       
	       //SendPasswordResetLink
	       driver.get("https://lpp.cirrusresponse.com/admin/users");
	       Thread.sleep(5000);
	       driver.findElement(By.xpath("//table[@id='users']/tbody/tr/td[7]/button")).click();
	       Thread.sleep(5000);
	       driver.findElement(By.id("sent_button")).click();
	       System.out.println("Password Reset Link Sent");
	       Thread.sleep(5000); 
	       
	       //NormalSearch
	       driver.get("https://lpp.cirrusresponse.com/admin/users");
	       Thread.sleep(5000);
	       driver.findElement(By.cssSelector("#users_filter .form-control")).click();
	       driver.findElement(By.cssSelector("#users_filter .form-control")).sendKeys("tara_test");
	       System.out.println("Normal Search Done Successfully");
	       Thread.sleep(5000);
	       
	       
	       
	       //Delete
	       driver.get("https://lpp.cirrusresponse.com/admin/users");
	       Thread.sleep(5000);
	       driver.findElement(By.xpath("//table[@id='users']/tbody/tr/td[7]/button[3]")).click();
	       Thread.sleep(5000);
	       driver.findElement(By.id("ok_button")).click();
	       System.out.println("User Deleted successfully");
	       Thread.sleep(5000);
	       
	      //Edit
	       driver.get("https://lpp.cirrusresponse.com/admin/users");
	       Thread.sleep(5000);
	       driver.findElement(By.xpath("//table[@id='users']/tbody/tr/td[7]/button[2]")).click();
	       Thread.sleep(5000);
	      driver.findElement(By.id("action_button")).click();
	       System.out.println("Users Edited successfully");
	       Thread.sleep(5000); 
	       
	      
	 //Customers
	       
	       //Details
	       driver.get("https://lpp.cirrusresponse.com/admin/customers");
	       driver.findElement(By.id("create_record")).click();
	       Thread.sleep(3000);
	
           driver.findElement(By.id("partner_id")).sendKeys(Keys.DOWN);
           Thread.sleep(1000);
           driver.findElement(By.id("partner_id")).sendKeys(Keys.ENTER); 
           Thread.sleep(5000);
	       
	       
	       Thread.sleep(3000);
	       driver.findElement(By.id("name")).sendKeys("CustomerName1");
	       driver.findElement(By.id("email")).sendKeys("tara.dhamala1@gmail.com");
	       driver.findElement(By.id("phone_number")).sendKeys("123456789");
	       driver.findElement(By.id("address1")).sendKeys("123456789");
	       driver.findElement(By.id("city")).sendKeys("city1");
	       driver.findElement(By.id("postcode")).sendKeys("123456");
	       
	       WebElement uploadElement1 = driver.findElement(By.xpath("//form[@id='sample_form']/div/div/div[10]/div/input"));
	       uploadElement1.sendKeys("C:\\Users\\Tank\\Desktop\\Image\\sukutebeach\\test1.jpg");
	     
	       driver.findElement(By.id("client_id")).sendKeys("123456");
	       driver.findElement(By.id("client_secret")).sendKeys("123456");
	       driver.findElement(By.id("username")).sendKeys("User1");
	       driver.findElement(By.id("passwordMerchant")).sendKeys("User12345");
	       driver.findElement(By.id("support_email")).sendKeys("support.email@gmail.com");
	       driver.findElement(By.id("billing_email")).sendKeys("billing.email@gmail.com");
	       driver.findElement(By.id("action_button")).click();
	       System.out.println("Customers Added successfully");
	       Thread.sleep(5000);
	       
	       
	     //Search
	       driver.get("https://lpp.cirrusresponse.com/admin/users");
	       driver.findElement(By.cssSelector("#users_filter .form-control")).click();
	       driver.findElement(By.cssSelector("#users_filter .form-control")).sendKeys("tara_test");
	       System.out.println("Customers Search Done Successfully");
	       Thread.sleep(5000);
	       
	    
	        //Edit
	       //Delete
	       //Search
	       
	     //Users
	       driver.findElement(By.linkText("Users")).click();
	       
	       
	       
	   /*  //Consumers
	       driver.findElement(By.linkText("Consumers")).click();
	       
	    //Links
	       driver.findElement(By.linkText("Links")).click();
	   //PSPs
	       driver.findElement(By.linkText("PSPs")).click();
	  //Settings
	       driver.findElement(By.linkText("Settings")).click(); */
	       
 //partners
	       
	       //Details
	       driver.get("https://lpp.cirrusresponse.com/admin/customers");
	       driver.findElement(By.id("create_record")).click();
	       Thread.sleep(5000);
	       
	       driver.findElement(By.id("partner_id")).sendKeys(Keys.DOWN);
           Thread.sleep(1000);
           driver.findElement(By.id("partner_id")).sendKeys(Keys.ENTER); 
           Thread.sleep(5000);
           
	      /* Select PartnerId1 = new Select(driver.findElement(By.id("partner_id")));
	       PartnerId1.selectByVisibleText("Test Partner"); */
	       
	       driver.findElement(By.id("name")).sendKeys("CustomerName1");
	       driver.findElement(By.id("email")).sendKeys("tara.dhamala14@gmail.com");
	       driver.findElement(By.id("phone_number")).sendKeys("123456789");
	       driver.findElement(By.id("address1")).sendKeys("123456789");
	       driver.findElement(By.id("city")).sendKeys("city1");
	       driver.findElement(By.id("postcode")).sendKeys("123456");
	       
	       WebElement uploadElement2 = driver.findElement(By.xpath("//form[@id='sample_form']/div/div/div[10]/div/input"));
	       uploadElement2.sendKeys("C:\\Users\\Tank\\Desktop\\Image\\sukutebeach\\test1.jpg");
	     
	       driver.findElement(By.id("client_id")).sendKeys("123456");
	       driver.findElement(By.id("client_secret")).sendKeys("123456");
	       driver.findElement(By.id("username")).sendKeys("User1");
	       driver.findElement(By.id("passwordMerchant")).sendKeys("User12345");
	       driver.findElement(By.id("support_email")).sendKeys("support.email@gmail.com");
	       driver.findElement(By.id("billing_email")).sendKeys("billing.email@gmail.com");
	       driver.findElement(By.id("action_button")).click();
	       System.out.println("Partners Added successfully");
	       Thread.sleep(5000);
	       
	       
	     //Search
	       driver.get("https://lpp.cirrusresponse.com/admin/partners");
	       driver.findElement(By.cssSelector("#users_filter .form-control")).click();
	       driver.findElement(By.cssSelector("#users_filter .form-control")).sendKeys("tara_test");
	       System.out.println("Partners Search Done Successfully");
	       Thread.sleep(5000);
	    
	   //PaymentLink
	       
	       driver.get("https://lpp.cirrusresponse.com/admin/paymentlink"); 
	       
	       
	       
	       
	 //Log
	       //SMS 
	       driver.get("https://lpp.cirrusresponse.com/admin/sms/log"); 
	       Thread.sleep(3000);
	       driver.findElement(By.className("sidebar-mini")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("btn-default")).click();
	       System.out.println("Details viewed Successfully");
	       Thread.sleep(3000);
	       
	       driver.get("https://lpp.cirrusresponse.com/admin/users");
	       driver.findElement(By.cssSelector("#smslog_filter .form-control")).click();
	       driver.findElement(By.cssSelector("#smslog_filter .form-control")).sendKeys("sms");
	       System.out.println("SMS Search Done Successfully");
	       Thread.sleep(5000);
	       
	       //Email
	       driver.get("https://lpp.cirrusresponse.com/admin/email/log"); 
	       
	       //Test Email Log 
	       driver.get("https://lpp.cirrusresponse.com/admin/testemail/log"); 
	       
	       // User Log 
	       driver.get("https://lpp.cirrusresponse.com/admin/user/log"); 
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//table[@id='userlog']/tbody/tr/td[5]/button")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//form[@id='sample_formConsumer']/div[4]/button")).click();
	       System.out.println("User Log Details viewed Successfully");
	       Thread.sleep(3000);
	       
	       driver.get("https://lpp.cirrusresponse.com/admin/users");
	       Thread.sleep(3000);
	       driver.findElement(By.cssSelector("#smslog_filter .form-control")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.cssSelector("#smslog_filter .form-control")).sendKeys("sms");
	       Thread.sleep(3000);
	       System.out.println("SMS Search Done Successfully");
	       Thread.sleep(5000);
	     
	       //Payment Link Log
	       driver.get("https://lpp.cirrusresponse.com/admin/paymentlink/log");
	       Thread.sleep(3000);
	       driver.findElement(By.className("sidebar-mini")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("btn-default")).click();
	       System.out.println("SMS Search Done Successfully");
	       Thread.sleep(5000);
	       
-----------------------------------------------------------------------------------------------------------------------------------------




import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.collect.Table.Cell;

public class ExcelReadWrite {
	
      public  void tc() throws IOException, InterruptedException{
		System.setProperty("webdriver.gecko.driver","D:\\Driver\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		 driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 driver.get("http://lpp.cirrusresponse.com:81/");  
		 ArrayList<String> userName=readExcelData(0);
		 ArrayList<String> password=readExcelData(1);
		 
		 for(int i=0; i<userName.size();i++) {
			 
			 driver.findElement(By.id("email")).sendKeys(userName.get(i));
		     driver.findElement(By.id("password")).sendKeys(password.get(i));
		     driver.findElement(By.className("btn-success")).click();
		     
		     Thread.sleep(6000);
		     
      }
      }
	public ArrayList<String> readExcelData(int colNo) throws IOException{
       
        
            File src = new File("D:\\eclipse\\tc.xlsx");
            
            FileInputStream fis = new FileInputStream(src);
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook wb = new XSSFWorkbook(fis);
 
            //Get first/desired sheet from the workbook
            XSSFSheet s = wb.getSheet("Login");
 
            //Iterate through each rows one by one
            
            java.util.Iterator<Row> rowIt=s.iterator();
            rowIt.next();
            
            ArrayList<String> list= new ArrayList<String>();
            
         /*   DataFormatter formatter = new DataFormatter();
            String formattedCellValue = formatter.formatCellValue(colNo); */
            
            while(rowIt.hasNext()) {
            	
            list.add(rowIt.next().getCell(colNo).getStringCellValue());
            	
            }
            
            System.out.println("List:::"+list);
            return list;
	}
            public static void main (String[] args) throws Exception{
            	ExcelReadWrite data= new ExcelReadWrite();
            	data.tc();
            	
            	
            }
        }





	       
	      
	       
	}

	
	}

	       
	       
	       
	       
	       
	       

	

	      

	       
	     
         
         
         
  
      
         
	
	
	 
	

	





