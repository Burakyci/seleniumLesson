package section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocationByLinkText {
    private final WebDriver driver;


    public LocationByLinkText() {
        System.setProperty("webdriver.chrome.driver", "/Users/burak/development/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
    }

    public void launchBrowser() {
        driver.get("https://www.automationtesting.co.uk");
        driver.manage().window().maximize();
        WebElement actionsLink = driver.findElement(By.linkText("ACTIONS"));
        // INPECT NASIL YAZILDIGINI DEGILDE GORUNUSTE NASIL YAZILDIGINIA BAKMALISIN
        actionsLink.click();

    }

    public static void main(String[] args) {
        LocationByLinkText locationById = new LocationByLinkText();

        locationById.launchBrowser();

//        locationByIdById.driver.quit(); // closede winwow
    }
}
