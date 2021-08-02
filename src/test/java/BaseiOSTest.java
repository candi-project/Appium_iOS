import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseiOSTest {

	public static IOSDriver DesiredCapabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
	
		
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Candi's iphone");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.6");
		 capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		 capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 50000);
		 capabilities.setCapability("commandTimeouts", "12000");
		 
		 capabilities.setCapability(MobileCapabilityType.APP, "/Users/candichiu/Desktop/Test/real_device/UICatalog.app");
		 //capabilities.setCapability(MobileCapabilityType.APP, "/Users/candichiu/Desktop/Test/longtap.app");
		 
		 //4 desired capabilities for real device.
		 capabilities.setCapability("xcodeOrgId","Y94XA69Q3D");
		 capabilities.setCapability("xcodeSigningId","iPhone Developer");
		 capabilities.setCapability("udid","00008020-001044C20233002E");
		 capabilities.setCapability("updateWDABundleId","WebDriverAgentRunner");

		 
		 
		 IOSDriver driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		 
		 return driver;
		
		
		

	}

}
