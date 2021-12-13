package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.ui.NavigationUI;
import lib.ui.android.AndroidNavigationUI;
import lib.ui.ios.iOSNavigationUI;
import org.openqa.selenium.Platform;


public class NavigationUIFactory
{
    public static NavigationUI get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
    return new AndroidNavigationUI(driver);
        }else{
        return new iOSNavigationUI(driver);
        }
    }
}
