package Project3;


import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo1 extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demowebshop.tricentis.com/");
        WebElement logIn= driver.findElement(By.linkText("Log in"));
        logIn.click();

        WebElement emailBox= driver.findElement(By.id("Email"));
        emailBox.sendKeys("grup22@gmail.com");

        WebElement passwordBox= driver.findElement(By.id("Password"));
        passwordBox.sendKeys("12345622g");

        WebElement logInBtn= driver.findElement(By.cssSelector("input[type='submit'][value='Log in']"));
        logInBtn.click();

        WebElement userNameVerify=driver.findElement(By.linkText("grup22@gmail.com"));
        Assert.assertTrue(userNameVerify.getText().contains("grup22@gmail.com"));

        BekleKapat();




    }

}
