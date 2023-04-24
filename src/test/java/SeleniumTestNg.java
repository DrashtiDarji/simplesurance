
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestNg {
    @Test
    public void sampleTestMethod() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://insurance-manager.sb-testenv2104.sisu.sh/login");
        driver.findElement(By.id("login_username")).sendKeys("testsellingpartner3@simplesurance.de");
        driver.findElement(By.id("login_password")).sendKeys("TestSellingPartner3Pass");
        driver.findElement(By.className("MuiButton-label")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div/a[2]/button")).click();
        driver.findElement(By.id("country-select")).click();
        Thread.sleep(3000);
		driver.findElement(By.cssSelector("li[data-value='BG']")).click();

        driver.findElement(By.id("product-name-select")).click();
        Thread.sleep(3000);
		driver.findElement(By.cssSelector("li[data-value='Nokia_v2Allianz_global']")).click();

        driver.findElement(By.id("tariff-name-select")).click();
        Thread.sleep(3000);
		driver.findElement(By.cssSelector("li[data-value='1-34-Nokia_v2Allianz_global-D-EUR-v1-Accidental_damage']")).click();

        driver.findElement(By.id("category-name-select")).click();
        Thread.sleep(3000);
		driver.findElement(By.cssSelector("li[data-value='CATEGORY_SMARTPHONE']")).click();

        driver.findElement(By.id("duration-select")).click();
        Thread.sleep(3000);
		driver.findElement(By.cssSelector("li[data-value='24 month(s)']")).click();


        driver.findElement(By.id("frequency-select")).click();
        Thread.sleep(3000);
		driver.findElement(By.cssSelector("li[data-value='24 month(s)']")).click();

        driver.findElement(By.id("class-name-select")).click();
        Thread.sleep(3000);
		driver.findElement(By.cssSelector("li[data-value='PDCODE617842']")).click();

        driver.findElement(By.id("input-createCertificate_serialNumber")).sendKeys("12344");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[2]/form/div[5]/div/div[3]/button/span[1]/span")).click();


        driver.findElement(By.id("input-createCertificate_firstName")).sendKeys("Drashti");
        driver.findElement(By.id("input-createCertificate_lastName")).sendKeys("Darji");
        driver.findElement(By.id("input-createCertificate_email")).sendKeys("drashtidarji95@gmail.com");
        driver.findElement(By.id("input-createCertificate_streetName")).sendKeys("LM");
        driver.findElement(By.id("input-createCertificate_streetNumber")).sendKeys("707");
        driver.findElement(By.id("input-createCertificate_zip")).sendKeys("400068");
        driver.findElement(By.id("input-createCertificate_city")).sendKeys("Amsterdam");
        driver.findElement(By.id("input-createCertificate_country")).sendKeys("NE");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[2]/form/div[11]/div/div[3]/button/span[1]/span")).click();


        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        // driver.quit();
        for(int i=0; i<checkboxes.size(); i++){
            checkboxes.get(i).click();
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[2]/form/div[2]/div/div[3]/button/span[1]/span")).click();

        Thread.sleep(8000);
        driver.findElement(By.cssSelector("input[type='radio'][value='STRIPE.CARD']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[2]/div[2]/div/div[2]/button/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[placeholder='Card number']")).sendKeys("4242424242424242");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[2]/div[2]/div/div[2]/button[1]/span")).click();
        

        driver.quit();
    
    }
}
