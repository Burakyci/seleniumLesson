package section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationById {
    private final WebDriver driver;

    public LocationById() {
        System.setProperty("webdriver.chrome.driver", "/Users/burak/development/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
    }

    public void launchBrowser() {
        driver.get("https://www.automationtesting.co.uk/buttons.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("btn_one")).click();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbrun\\OneDrive - Learn Automation\\Desktop\\Resources\\driver_v1\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.automationtesting.co.uk/buttons.html");

        //driver.findElement(By.cssSelector("#btn_one")).click();
        driver.findElement(By.cssSelector("button#btn_one")).click();

    }

}

