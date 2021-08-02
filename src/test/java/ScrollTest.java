import java.net.MalformedURLException;
import java.util.HashMap;


import io.appium.java_client.ios.IOSDriver;

public class ScrollTest extends BaseiOSTest{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		IOSDriver driver = DesiredCapabilities();
		
		//Scroll
		HashMap<String, Object> scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("accessibility id", "Web View");
		
		driver.executeScript("mobile:scroll", scrollObject);
		driver.findElementByAccessibilityId("Web View").click();
		
		Thread.sleep(2000);
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"UICatalog\"]").click();
		
		//DropDowns
		driver.findElementByAccessibilityId("Picker View").click();
		driver.findElementByAccessibilityId("Red color component value").sendKeys("90");
		driver.findElementByAccessibilityId("Green color component value").sendKeys("240");
		driver.findElementByAccessibilityId("Blue color component value").sendKeys("255");
		
		System.out.println(driver.findElementByAccessibilityId("Blue color component value").getText());
		
		

	}

}
