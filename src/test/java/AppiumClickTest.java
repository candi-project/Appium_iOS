import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;

public class AppiumClickTest extends BaseiOSTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		IOSDriver driver = DesiredCapabilities();
		
		driver.findElementByAccessibilityId("Alert Views").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Text Entry\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Secure Text Entry\"]").sendKeys("Hello");
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"OK\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"UICatalog\"]").click();
		driver.findElementByAccessibilityId("Action Sheets").click();
		driver.findElementByAccessibilityId("Okay / Cancel").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"OK\"]").click();
		
		
		
 
	}

}
