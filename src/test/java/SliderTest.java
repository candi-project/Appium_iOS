import java.net.MalformedURLException;
import java.util.HashMap;

import org.testng.Assert;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class SliderTest extends BaseiOSTest{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		IOSDriver driver = DesiredCapabilities();
		
		driver.findElementByAccessibilityId("Sliders").click();
		IOSElement slider = (IOSElement)driver.findElementsByXPath("//XCUIElementTypeSlider").get(1);
		slider.setValue("0%");
		slider.setValue("0.7%"); //0 0.42 0.9 1
		slider.getAttribute("value");
		
	    Assert.assertEquals((slider.getAttribute("value")), "70%");
		
		
		

	}

}
