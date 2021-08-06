// This section Tackels the first three objectives of the assignment.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UITesting {

    WebDriver driver;
    
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","C:/Users/Joe/Selenium/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.hostelworld.com/");
    }

    public void searchCity() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Thread.sleep(5000);
        driver.findElement(By.id("search-button")).click();
        Thread.sleep(4000);
        System.out.println("The title of the page is: \n" + driver.getTitle());
//        select.selectByIndex(0);
//        driver.findElement(By.id("search-button")).click();
//        driver.findElement(By.xpath("//input[@id='location-text-input-field']")).click();
//        driver.findElement(By.id("location-text-input-field")).sendKeys("Dublin, Ireland");
//        driver.findElement(By.id("location-text-input-field")).clear();
//        driver.findElement(By.id("location-text-input-field")).click();
//        driver.findElement(By.id("location-text-input-field")).sendKeys("");
    }
    public void cityCheck(){
        if (driver.getTitle().contains("Dublin")){
            System.out.println("\n ** Property list belongs to the correct city ** ");
        }
        else {
            System.out.println("\nProperty list belongs to the wrong city");
            driver.quit();
        }
    }

    public void closeBrowser(){driver.quit();}


    public static void main(String[] args) throws InterruptedException {
        UITesting obj = new UITesting();
        obj.launchBrowser();
        obj.searchCity();
        obj.cityCheck();
        obj.closeBrowser();
    }
}
