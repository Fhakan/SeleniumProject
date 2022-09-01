package Project2;


import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Senaryo_4 extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement demoebook = driver.findElement(By.cssSelector("[onclick*='1595015']"));
        demoebook.click();

        driver.switchTo().frame(5);

        WebElement debit = driver.findElement(By.xpath("//span[contains(text(),'Visa')]"));
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
        WebElement cardno = driver.findElement(By.name("cardnumber"));
        cardno.sendKeys("1111 1111 1111 1111");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='SnackBar']")));

        WebElement snackBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='SnackBar']")));
        Assert.assertEquals(snackBar.getText(),"Kart numaranız geçersiz.");


        BekleKapat();
    }
}
