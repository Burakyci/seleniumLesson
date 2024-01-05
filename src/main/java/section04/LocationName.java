package section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class LocationName {
    private final WebDriver driver;


    public LocationName() {
        System.setProperty("webdriver.chrome.driver", "/Users/burak/development/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
    }

    public void launchBrowser() {
        driver.get("https://www.automationtesting.co.uk/contactForm.html");
        driver.manage().window().maximize();
        WebElement nameField = driver.findElement(By.name("first_name"));
        WebElement lastField = driver.findElement(By.name("last_name"));
        nameField.sendKeys("Burak ");
        lastField.sendKeys(" KALAYCI");
    }

    public static void main(String[] args) {
        LocationName locationById = new LocationName();

        locationById.launchBrowser();

//        locationByIdById.driver.quit(); // closede winwow
    }
}
