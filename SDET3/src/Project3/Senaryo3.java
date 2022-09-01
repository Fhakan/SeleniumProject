package Project3;


import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo3 extends BasicStaticDriver {
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

        WebElement addproduct1= driver.findElement(By.cssSelector("[onclick*='31']"));
        addproduct1.click();

        WebElement addproduct2= driver.findElement(By.cssSelector("[onclick*='72']"));
        addproduct2.click();

        WebElement shoppingCart= driver.findElement(By.linkText("shopping cart"));
        shoppingCart.click();

        WebElement aggreeBtn= driver.findElement(By.id("termsofservice"));
        aggreeBtn.click();

        WebElement checkOutBtn= driver.findElement(By.cssSelector("[class='button-1 checkout-button']"));
        checkOutBtn.click();

        WebElement ctnBtn= driver.findElement(By.cssSelector("[onclick='Billing.save()']"));
        ctnBtn.click();

        WebElement checkBox= driver.findElement(By.id("PickUpInStore"));
        checkBox.click();

        WebElement ctnBtn2= driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
        ctnBtn2.click();

        WebElement paymentMethod2= driver.findElement(By.id("paymentmethod_1"));
        paymentMethod2.click();

        WebElement ctnBtn3= driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()'] "));
        ctnBtn3.click();

        WebElement ctnBtn4= driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()'] "));
        ctnBtn4.click();

        WebElement ctnBtn5= driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()'] "));
        ctnBtn5.click();

        Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(text(),' been succes')]")).getText().contains("success"));


        BekleKapat();


    }
}
