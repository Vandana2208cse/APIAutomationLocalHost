package Pachage1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Class1 {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		//File classpathRoot = new File(System.getProperty("user.dir"));
//		File appDir = new File("C:\\Users\\Ahishek Singh\\OneDrive\\Desktop\\Apps\\1mg.apk");
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Device1_26Nov");
//        // cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        cap.setCapability("app", appDir.getAbsolutePath());
//        //cap.setCapability("appPackage", "com.android.vending");
//        //cap.setCapability("appActivity", "com.aranoah.healthkart.plus.doctors.doctorratingactivity");
//        
//        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//    }	
		// we can launch server from cmd using command appium �a  127.0.0.1  -p 4723 which we hv used below in url

		File appDir = new File("C:\\Users\\Ahishek Singh\\OneDrive\\Desktop\\Apps\\BookMyShow.apk");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Device1_26Nov");
        // caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability("app",appDir.getAbsolutePath());
        //caps.setCapability("appPackage", "com.android.vending");
        //caps.setCapability("appActivity", "com.aranoah.healthkart.plus.doctors.doctorratingactivity");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       // Thread.sleep(2000);
        driver.findElement(By.id("com.bt.bms:id/launcher_tv_for_skip")).click();
        driver.findElement(By.id("com.bt.bms:id/btn_negative")).click();
        //driver.findElement(By.xpath("//android.widget.TextView[text()='National Capital Region (NCR)']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Pune']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text='Allow']")).click();
       // driver.findElement(By.xpath(android.widget.LirearLayout[@index='2' and @resource-id='com.bt.bms:id/menu_item_container_header_main']/android.view.ViewGroup[1]));
       
       // driver.findElement(By.xpath("//android.widget.TextView[@text = 'Drishyam 2']")).click();
        driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id='com.bt.bms:id/layoutFabs']")).click();
       // driver.findElement(By.xpath("//android.widget.TextView[@text='Book tickets']")).click();
        
      // driver.findElement(By.xpath("//com.bt.bms/android.widget.TextView[@text = 'Book tickets']")).click();
        //driver.findElement(By.xpath("android.widget.LinearLayout[@resource-id='com.bt.bms:id/menu_item_container_header_main']//android.widget.ImageView[1]")).click();
	}
		
		
}
