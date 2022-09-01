package Project2;


import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Senaryo_5 extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement ebook= driver.findElement(By.cssSelector("[onclick*='1595015']"));
        ebook.click();


        driver.switchTo().frame(5);

        WebElement debit= driver.findElement(By.xpath("//*[text()='Visa, AMEX, MasterCard, Maestro, Discover']"));
        debit.click();

        WebElement email = driver.findElement(By.cssSelector("[placeholder='Email']"));
        email.sendKeys("sagfseg@gmai.com");

        WebElement cemail = driver.findElement(By.cssSelector("[placeholder='Confirm Email']"));
        cemail.sendKeys("sagfseg@gmai.com");

        WebElement name = driver.findElement(By.cssSelector("[placeholder='Name On Card']"));
        name.sendKeys("asdasf");

        WebElement phone = driver.findElement(By.cssSelector("[autocomplete='phone']"));
        phone.sendKeys("126486465");

        WebElement company = driver.findElement(By.cssSelector("[autocomplete='company']"));
        company.sendKeys("126486465");

        driver.switchTo().frame(2);

        WebElement card = driver.findElement(By.cssSelector("[name='cardnumber']"));
        card.sendKeys("4242 4242 4242 4242");

        WebElement date = driver.findElement(By.cssSelector("[class='InputElement is-empty Input Input--empty']"));
        date.sendKeys("12/22");

        WebElement cvc = driver.findElement(By.cssSelector("[aria-label='Kredi veya banka kartı CVC/CVV numarası']"));
        cvc.sendKeys("000");

        driver.switchTo().parentFrame();
        WebElement btn = driver.findElement(By.xpath("//*[text()='Pay 0.50 USD']"));
        btn.click();
        wait.until(ExpectedConditions.textToBe(By.cssSelector("[class='green_text_margin']"),
        "your order is confirmed. Thank you!"));

        WebElement order = driver.findElement(By.cssSelector("[class='green_text_margin']"));

        Assert.assertTrue(order.getText().contains("your order is confirmed. Thank you!"));



        BekleKapat();
    }
}
