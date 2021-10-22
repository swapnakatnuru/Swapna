package Base;

import PageObject.StudentMemberShipPage;
import PageObject.SucessPage;
import Utilities.DriverFactory;
import Utilities.DriverUtilities;

public class BasePage {
   public static StudentMemberShipPage studentMemberShipPage;
    public static SucessPage sucessPage;
    public static DriverUtilities driverUtilities;

    public static  void initPages(){
        studentMemberShipPage= new StudentMemberShipPage(DriverFactory.driver);
        sucessPage=new SucessPage(DriverFactory.driver);
        driverUtilities = new DriverUtilities();
    }
}

