package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    WebDriver driver;

    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/burak/development/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver(); // Use the class-level variable instead of declaring a new one

        driver.manage().window().maximize();

        driver.get("https://www.automationtesting.co.uk/buttons.html");

        driver.findElement(By.id("btn_one")).click();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.launchBrowser();
    }
}
