package Project2;


import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo_2 extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement ebook= driver.findElement(By.cssSelector("[onclick*='1595015']"));
        ebook.click();

        driver.switchTo().frame(5);

        WebElement promo= driver.findElement(By.xpath("//*[text()='Add Promo Code']"));
        promo.click();

        WebElement code= driver.findElement(By.className("Promo-Code-Value"));
        code.sendKeys("123456789");

        WebElement apply=driver.findElement(By.xpath("//*[text()='Apply']"));
        apply.click();

        WebElement invalid=driver.findElement(By.xpath("//*[text()='Invalid promo code']"));
        Assert.assertTrue(invalid.getText().contains("Invalid promo code"));

        BekleKapat();
    }
}
