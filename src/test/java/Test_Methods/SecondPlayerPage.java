package Test_Methods;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SecondPlayerPage {
	
AppiumDriver driver;
	
	public SecondPlayerPage(AppiumDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	public void secondPlayer() throws Exception
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
		emailAddresss.sendKeys("az@yopmail.com");
		
		WebElement password = driver.findElement(AppiumBy.xpath("//*[@text=\"Password\"]"));
		System.out.println(password.getText());
		password.sendKeys("12345678");
		
		WebElement loginButton = driver.findElement(AppiumBy.xpath("//*[@text=\"Login\"]"));
		System.out.println(loginButton.getText());
		loginButton.click();
		Thread.sleep(5000);
		
		WebElement allowPopup = driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"));
		System.out.println(allowPopup.getText());
		allowPopup.click();
		Thread.sleep(7000);
		
		WebElement moreButton = driver.findElement(AppiumBy.id("com.app.tussly:id/ivMore"));
		System.out.println(moreButton.getText());
		moreButton.click();
		Thread.sleep(5000);
		
		
		WebElement search = driver.findElement(AppiumBy.xpath("//*[@text=\"Search Tournaments\"]"));
		System.out.println(search.getText());
		search.click();
		Thread.sleep(5000);
		
		WebElement searchField = driver.findElement(AppiumBy.xpath("//*[@text=\"Search Tournaments\"]"));
		System.out.println(searchField.getText());
		searchField.click();
		Thread.sleep(10000);
		
		WebElement field = driver.findElement(AppiumBy.xpath("//*[@text=\"Search Tournaments\"]"));
		System.out.println(field.getText());
		field.sendKeys("Character Limit Validation");
		Thread.sleep(5000);
		
		WebElement viewfield = driver.findElement(AppiumBy.xpath("//*[@text=\"View\"]"));
		System.out.println(viewfield.getText());
		viewfield.click();
		Thread.sleep(3000);
		
//		WebElement enterArena = driver.findElement(AppiumBy.xpath("//*[@resource-id='com.app.tussly:id/ivTabIcon'][1]"));
//		WebElement enterArena = driver.findElement(AppiumBy.id("com.app.tussly:id/ivTabIcon"));
		WebElement enterArena = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));
		System.out.println(enterArena.getText());
		enterArena.click();
		Thread.sleep(5000);
		
		WebElement proceed = driver.findElement(AppiumBy.xpath("//*[@text=\"Proceed\"]"));
		System.out.println(proceed.getText());
		proceed.click();
		Thread.sleep(5000);
		
		WebElement proceed1 = driver.findElement(AppiumBy.xpath("//*[@text=\"Proceed\"]"));
		System.out.println(proceed1.getText());
		proceed1.click();
		
		
	}

}
