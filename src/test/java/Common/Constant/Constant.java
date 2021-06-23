package Common.Constant;

import org.openqa.selenium.WebDriver;

public class Constant {
    public static WebDriver WEBDRIVER;
    public static final String URL = "";
    public static final String USERNAME = System.getenv("username");
    public static final String PASSWORD = System.getenv("password");
    public static final String NEW_PASSWORD = System.getenv("new_password");
}
