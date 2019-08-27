import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://www.baidu.com");

        WebElement search_input = driver.findElement(By.name("wd"));

        search_input.sendKeys("快陪练");

        search_input.submit();

        Thread.sleep(3000);

        Assert.assertEquals("快陪练_百度搜索", driver.getTitle());

        driver.quit();
    }
}

