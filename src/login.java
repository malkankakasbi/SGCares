import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class login {

    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"c4678541");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "org.nvpc.sgcares");
        dc.setCapability("appActivity", "com.media2359.sgcares.activity.SplashActivity");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);

        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement el1 = (MobileElement) ad.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
        el1.click();
        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement el2 = (MobileElement) ad.findElementById("org.nvpc.sgcares:id/act_on_boarding_tv_skip");
        el2.click();
        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement el3 = (MobileElement) ad.findElementById("org.nvpc.sgcares:id/btn_log_in_gmail");
        el3.click();
        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement el4 = (MobileElement) ad.findElementById("org.nvpc.sgcares:id/et_email");
        el4.sendKeys("test@gmail.com");
        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement el5 = (MobileElement) ad.findElementById("org.nvpc.sgcares:id/et_password");
        el5.sendKeys("test");
        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement el6 = (MobileElement) ad.findElementById("org.nvpc.sgcares:id/act_cancel_toolbar");
        el6.click();
        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement el7 = (MobileElement) ad.findElementById("org.nvpc.sgcares:id/btn_log_in_facebook");
        el7.click();
        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement el9 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.EditText");
        el9.sendKeys("testfacebook");
        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement el10 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText");
        el10.sendKeys("testfacebook");
        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement el11 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
        el11.click();
        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement el12 = (MobileElement) ad.findElementById("org.nvpc.sgcares:id/btn_explore_guest");
        el12.click();
        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement el13 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[15]/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View");
        el13.click();
        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement el14 = (MobileElement) ad.findElementById("org.nvpc.sgcares:id/bt_next");
        el14.click();

    }
}
