package Project2;


import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Senaryo_1 extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement ebook= driver.findElement(By.cssSelector("[onclick*='1595015']"));
        ebook.click();


        driver.switchTo().frame(5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='Product-Quantity']>input[value='1']")));
        WebElement quantityCheck = driver.findElement(By.cssSelector("[class='Product-Quantity']>input[value='1']"));

        Assert.assertTrue(quantityCheck.getAttribute("value").contains("1"));

        WebElement removeButton = driver.findElement(By.className("Product-Remove"));
        removeButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='Continue-Button Close-Cart']")));

        driver.switchTo().parentFrame();
        driver.switchTo().frame(5);

        WebElement back = driver.findElement(By.cssSelector("[class='Continue-Button Close-Cart']"));
        back.click();
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("EJ-CartItemsNum")));

        WebElement itemZero = driver.findElement(By.className("EJ-CartItemsNum"));
        Assert.assertTrue(itemZero.getText().contains("0"));


        BekleKapat();
    }
}
