package firstseleniumprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.ui.Window;
import com.sun.java.swing.plaf.windows.resources.windows;

public class Day1 {

	WebDriver driver;

	public void invokeBrowser(){
	    try {
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Neon_Workspace\\Browser Driver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.get("http://www.todaywalkins.com/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	public static void main(String[] args) {
		
		Day1 myobj=new Day1();
		myobj.invokeBrowser();
		

	}

}
