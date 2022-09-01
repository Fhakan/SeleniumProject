package Project3;


import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo2 extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demowebshop.tricentis.com/");
        WebElement logIn= driver.findElement(By.linkText("Log in"));
        logIn.click();

        WebElement emailBox= driver.findElement(By.id("Email"));
        emailBox.sendKeys("hatalımail@gmail.com");

        WebElement passwordBox= driver.findElement(By.id("Password"));
        passwordBox.sendKeys("hatalı şifre");

        WebElement logInBtn= driver.findElement(By.cssSelector("input[type='submit'][value='Log in']"));
        logInBtn.click();

        WebElement errorMsg= driver.findElement(By.cssSelector("[class='validation-summary-errors']"));
        Assert.assertTrue(errorMsg.getText().contains("found"));

        BekleKapat();
    }
}
