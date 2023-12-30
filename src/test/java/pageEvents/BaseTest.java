package pageEvents;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
	
	public void setDriver(AppiumDriver driver)
	{
		this.driver.set(driver);
	}
	
	public AppiumDriver getDriver() 
	{
		return this.driver.get();
	}
	
	
	@BeforeMethod
//	@Parameters({"deviceName", "platformVersion", "portNumber"})
//	public void initiateDriver(String deviceName, String platformVersion, String portNumber) throws MalformedURLException
	public void initiateDriver() throws MalformedURLException
	
	{
//		startAppiumService(portNumber);
//		startAppiumService("4723");
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 6");
//		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,  "Android");
		desiredCapabilities.setCapability("appPackage", "com.app.tussly");
		desiredCapabilities.setCapability("appActivity", "com.app.tussly.activity.MainActivity");
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		
//		URL url = new URL("http://127.0.0.1:"+portNumber);
//		URL url = new URL("http://127.0.0.1:4723");
		URL url = new URL("http://127.0.0.1:7777");
//		URL url = new URL("http://127.0.0.1:6666");
		String appUrl = System.getProperty("user.dir") + File.separator + "src" +File.separator + "main" + File.separator +"java" +
				File.separator +"Tussly_07_Nov_2023.apk";
		
		desiredCapabilities.setCapability(MobileCapabilityType.APP, appUrl);
		
		setDriver(new AndroidDriver(url , desiredCapabilities));
//		setDriver(new AndroidDriver(new URL (spec: "http://127.0.0.1:"+portNumber+"/wd/hub"), desiredCapabilities));
		
//		AppiumDriver driver = new AndroidDriver(url , desiredCapabilities);
//		return;
	}
	
	@AfterMethod
	public void closeDriver() 
	{
		getDriver().quit();
	}
	
//	public void startAppiumService(String portNumber)
	/*
	 * public void startAppiumService() { AppiumDriverLocalService service;
	 * AppiumServiceBuilder builder = new AppiumServiceBuilder();
	 * builder.withIPAddress("127.0.0.1"); //
	 * builder.usingPort(Integer.parseInt(portNumber)); builder.usingPort(4723);
	 * service = AppiumDriverLocalService.buildService(builder); service.start();
	 * System.out.println("service has been started with port number:    " + 4723);
	 * 
	 * }
	 */

}


