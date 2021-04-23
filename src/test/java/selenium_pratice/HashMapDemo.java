package selenium_pratice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class HashMapDemo {

    public static void main (String args []) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/login");

        String credentials = getCredentials().get("customer");

        driver.findElement(By.id("userName")).sendKeys(getUserName(credentials));
        driver.findElement(By.id("password")).sendKeys(getPassowrd(credentials));
        driver.findElement(By.xpath("//button[@id='login']")).click();
        Thread.sleep(2000);
        driver.quit();

    }
    public static HashMap<String ,String> getCredentials(){
        HashMap<String,String> hashMap = new HashMap<String, String>();
        hashMap.put("admin", "binny:Admin@123");
        hashMap.put("customer", "adam:user@123");
        hashMap.put("manager", "jack:manager@123");

        return hashMap;
    }

    public static String getUserName(String cred){
        return cred.split(":")[0];
    }

    public static String getPassowrd(String cred){
        return cred.split(":")[1];
    }
}
