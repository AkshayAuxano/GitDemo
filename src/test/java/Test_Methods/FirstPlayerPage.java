package Test_Methods;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class FirstPlayerPage {
	
	/*
	 * AppiumDriver driver;
	 * 
	 * public FirstPlayerPage(AppiumDriver driver) { this.driver = driver; }
	 */
	
    AndroidDriver driver;
	
	public FirstPlayerPage(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	public void firstPlayer() throws Exception
	{
		Thread.sleep(5000);
		WebElement closeButton = driver.findElement(AppiumBy.xpath("//*[@text=\"Close\"]"));
//		WebElement closeButton = driver.findElement(AppiumBy.id("com.app.tussly:id/tvBtnTextWelcome"));
		System.out.println(closeButton.getText());
		closeButton.click();
		
//		Thread.sleep(5000);
		WebElement login = driver.findElement(AppiumBy.xpath("//*[@text=\"Login\"]"));
		System.out.println(login.getText());
		login.click();
		
		WebElement emailAddresss = driver.findElement(AppiumBy.xpath("//*[@text=\"Email Address\"]"));
		System.out.println(emailAddresss.getText());
		emailAddresss.sendKeys("ad@yopmail.com");
		
		WebElement password = driver.findElement(AppiumBy.xpath("//*[@text=\"Password\"]"));
		System.out.println(password.getText());
		password.sendKeys("12345678");
		
		
		  WebElement loginButton =
		  driver.findElement(AppiumBy.xpath("//*[@text=\"Login\"]"));
		  System.out.println(loginButton.getText()); loginButton.click();
		  Thread.sleep(5000);
		 
		
			
			  WebElement allowPopup = driver.findElement(AppiumBy.id(
			  "com.android.permissioncontroller:id/permission_allow_button"));
			  System.out.println(allowPopup.getText()); allowPopup.click();
			  Thread.sleep(7000);
			 
		
		WebElement moreButton = driver.findElement(AppiumBy.id("com.app.tussly:id/ivMore"));
		System.out.println(moreButton.getText());
		moreButton.click();
		Thread.sleep(5000);
		
		
		WebElement search = driver.findElement(AppiumBy.xpath("//*[@text=\"Search Tournaments\"]"));
		System.out.println(search.getText());
		search.click();
		Thread.sleep(3000);
		
		WebElement searchField = driver.findElement(AppiumBy.xpath("//*[@text=\"Search Tournaments\"]"));
		System.out.println(searchField.getText());
		searchField.click();
		Thread.sleep(3000);
		
		WebElement field = driver.findElement(AppiumBy.xpath("//*[@text=\"Search Tournaments\"]"));
		System.out.println(field.getText());
		field.sendKeys("Character Limit Validation");
		Thread.sleep(3000);
		
		WebElement viewfield = driver.findElement(AppiumBy.xpath("//*[@text=\"View\"]"));
		System.out.println(viewfield.getText());
		viewfield.click();
		Thread.sleep(3000);
		
//		WebElement enterArena = driver.findElement(AppiumBy.xpath("//*[@resource-id='com.app.tussly:id/ivTabIcon'][1]"));
//		WebElement enterArena = driver.findElement(AppiumBy.id("com.app.tussly:id/ivTabIcon"));
		WebElement enterArena = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));
		
		System.out.println(enterArena.getText());
		enterArena.click();
		Thread.sleep(3000);
		
		
		
		  //adb shell dumpsys window | grep -E 'mCurrentFocus' for MAC // adb shell
//		  dumpsys window | find "mCurrentFocus" for Windows
		  
		  //App Package & App Activity 
			/*
			 * Activity activity = new Activity("com.app.tussly",
			 * "com.app.tussly.activity.MainActivity"); driver.startActivity(activity);
			 * driver.findElement(AppiumBy.xpath("//*[@text=\"Report Round Score\"]")).click
			 * ();
			 */
		 
		
		
		
		
		
		
			/*
			 * WebElement proceed1 =
			 * driver.findElement(AppiumBy.xpath("//*[@text=\"Proceed\"]"));
			 * System.out.println(proceed1.getText()); proceed1.click(); Thread.sleep(5000);
			 * 
			 * WebElement arenaId = driver.findElement(AppiumBy.
			 * xpath("//*[@text=\"Enter the ID and Password here\"]"));
			 * System.out.println(arenaId.getText()); arenaId.sendKeys("22");
			 * Thread.sleep(3000);
			 * 
			 * WebElement submitbtn =
			 * driver.findElement(AppiumBy.xpath("//*[@text=\"Submit\"]"));
			 * System.out.println(submitbtn.getText()); submitbtn.click();
			 * Thread.sleep(3000);
			 * 
			 * WebElement proceed2 =
			 * driver.findElement(AppiumBy.xpath("//*[@text=\"Proceed\"]"));
			 * System.out.println(proceed2.getText()); proceed2.click(); Thread.sleep(3000);
			 * 
			 * WebElement stage1 =
			 * driver.findElement(AppiumBy.xpath("//*[@text=\"Town & City\"]"));
			 * System.out.println(stage1.getText()); stage1.click(); Thread.sleep(3000);
			 * 
			 * WebElement stage2 =
			 * driver.findElement(AppiumBy.xpath("//*[@text=\"Smashville\"]"));
			 * System.out.println(stage2.getText()); stage2.click(); Thread.sleep(3000);
			 */
		
		
	}

}
