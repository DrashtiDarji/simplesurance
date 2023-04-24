import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestngFilter {
    @Test
    public void SeleniumTestngFilter() throws InterruptedException, ParseException{
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://insurance-manager.sb-testenv2104.sisu.sh/login");
        driver.findElement(By.id("login_username")).sendKeys("testsellingpartner3@simplesurance.de");
        driver.findElement(By.id("login_password")).sendKeys("TestSellingPartner3Pass");
        driver.findElement(By.className("MuiButton-label")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[3]/div[1]/div/div/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("li[data-value='date_start']")).click();
        Thread.sleep(3000);

        WebElement table=driver.findElement(By.cssSelector("table[data-testid='policy-list']"));
        Thread.sleep(3000);
        WebElement tbody =table.findElement(By.tagName("tbody"));
        List <WebElement> rows=tbody.findElements(By.tagName("tr"));
        for (int j=1;j<rows.size();j++){
            List<WebElement> columns=rows.get(j).findElements(By.tagName("td"));
            Date sDate = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(columns.get(3).getText());
        }

       
    }
}
