package Utilities;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class DriverUtilities {
    public static Properties prop;
    WebDriver driver;

    public void navigatToUrl() {
        prop = new Properties();
        try {
            FileInputStream fs = new FileInputStream("src/test/resources/data.properties");
            prop.load(fs);


        } catch (Exception e) {
            e.printStackTrace();

        }
        System.out.println("url---" + prop.getProperty("url"));
        DriverFactory.driver.navigate().to(prop.getProperty("url"));

    }
    public void getPageTitle(){
      String str= DriverFactory.driver.getTitle();
        System.out.println(str);

    }
    public void pageRefresh(){
       DriverFactory.driver.navigate().refresh();
    }

    }




