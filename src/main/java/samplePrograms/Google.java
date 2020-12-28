package samplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class Google {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\VANDR\\Desktop\\complementos selenium\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.setCapability("InPrivate", true);
        WebDriver driver = new EdgeDriver();
        String URL = "https://es.wikipedia.org/wiki/Wikipedia:Portada";
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);

        // driver.close();
    }
}

