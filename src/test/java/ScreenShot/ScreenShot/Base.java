package ScreenShot.ScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class Base {

	public static WebDriver driver;
	
	public static void Intialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
	}
	
	public void failed(String methodName) 
	{
		File srcfile=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("C:\\Users\\rajol\\eclipse-workspace\\ScreenShot\\screenshots\\"+methodName+"-"+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
