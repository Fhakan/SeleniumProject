package Project2;


import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Senaryo_3 extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement ebook= driver.findElement(By.cssSelector("[onclick*='1595015']"));
        ebook.click();


        driver.switchTo().frame(5);
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[text()='Visa, AMEX, MasterCard, Maestro, Discover']"),
                "Visa, AMEX, MasterCard, Maestro, Discover"));
        WebElement debit= driver.findElement(By.xpath("//*[text()='Visa, AMEX, MasterCard, Maestro, Discover']"));
        debit.click();

        WebElement pay=driver.findElement(By.xpath("//*[text()='Pay 0.50 USD']"));
        pay.click();

        WebElement invalid=driver.findElement(By.xpath("//*[text()='Invalid Email']"));

        Assert.assertTrue(invalid.getText().contains("Invalid Email"));

        BekleKapat();
    }
}
