import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestNgUploadFile {
    
    @Test

    public void SeleniumTestNgUploadFile() throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try{
            driver.get("https://insurance-manager.sb-testenv2104.sisu.sh/login");
            driver.findElement(By.id("login_username")).sendKeys("testsellingpartner3@simplesurance.de");
            driver.findElement(By.id("login_password")).sendKeys("TestSellingPartner3Pass");
            driver.findElement(By.className("MuiButton-label")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div/a[3]/button/span[1]/span")).click();
    
            // driver.findElement(By.cssSelector("input[type='file']")).click();
            
            WebElement uploadElement = driver.findElement(By.cssSelector("input[type='file']"));
    
            // enter the file path onto the file-selection input field
            uploadElement.sendKeys("C:\\testdata.csv");
            Thread.sleep(5000);
    
            driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div[2]/button/span[1]/span")).click();
        }
        catch(Exception e){  
            throw new Exception(e.getMessage());
        }

        driver.quit();
        
    }
}
