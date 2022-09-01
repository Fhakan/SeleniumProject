package Project1;


import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Proje extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement usernamebox= driver.findElement(By.id("session_email"));
        usernamebox.sendKeys("group22@technostudy.com");
        Bekle(1);
        WebElement passwordbox= driver.findElement(By.id("session_password"));
        passwordbox.sendKeys("group22");
        Bekle(1);
        WebElement signin= driver.findElement(By.name("commit"));
        signin.click();
        Bekle(1);
        WebElement addressBtn= driver.findElement(By.xpath("//*[@data-test='addresses']"));
        addressBtn.click();
        Bekle(1);
        WebElement newAddressBtn= driver.findElement(By.xpath("//*[@data-test='create']"));
        newAddressBtn.click();
        Bekle(1);

        WebElement firstName= driver.findElement(By.id("address_first_name"));
        firstName.sendKeys("Fernando");
        Bekle(1);

        WebElement lastName= driver.findElement(By.id("address_last_name"));
        lastName.sendKeys("Torres");
        Bekle(1);

        WebElement address1= driver.findElement(By.id("address_street_address"));
        address1.sendKeys("Anfield Rd");
        Bekle(1);

        WebElement address2= driver.findElement(By.id("address_secondary_address"));
        address2.sendKeys("Anfield");
        Bekle(1);

        WebElement city= driver.findElement(By.id("address_city"));
        city.sendKeys("liverpool");
        Bekle(1);

        WebElement menu= driver.findElement(By.id("address_state"));
        Select ddmenu=new Select(menu);
        Bekle(1);

        ddmenu.selectByVisibleText("Oregon");

        WebElement zipcode= driver.findElement(By.id("address_zip_code"));
        zipcode.sendKeys("L4 0TH");

        WebElement country= driver.findElement(By.id("address_country_us"));
        country.click();
        Bekle(1);

        WebElement birthday= driver.findElement(By.id("address_birthday"));
        birthday.sendKeys("20/03/1984");
        Bekle(1);

        WebElement age= driver.findElement(By.id("address_age"));
        age.sendKeys("36");

        WebElement websitee= driver.findElement(By.id("address_website"));
        websitee.sendKeys("https://www.google.com/");
        Bekle(1);

        WebElement phoneNumber= driver.findElement(By.id("address_phone"));
        phoneNumber.sendKeys("8625747878");
        Bekle(1);

        WebElement climbing= driver.findElement(By.id("address_interest_climb"));
        climbing.click();

        WebElement dancing= driver.findElement(By.id("address_interest_dance"));
        dancing.click();
        Bekle(1);

        WebElement note= driver.findElement(By.id("address_note"));
        note.sendKeys("never back down");
        Bekle(1);

        WebElement createAddress= driver.findElement(By.name("commit"));
        createAddress.click();
        Bekle(1);

        WebElement verifyName= driver.findElement(By.xpath("//span[@data-test='first_name']"));
        Assert.assertTrue(verifyName.getText().contains("Fernando"));
        Bekle(1);

        WebElement verifyLastname= driver.findElement(By.xpath("//span[@data-test='last_name']"));
        Assert.assertTrue(verifyLastname.getText().contains("Torres"));
        Bekle(1);

        WebElement Addresses= driver.findElement(By.xpath("//a[@data-test='addresses']"));
        Addresses.click();

        WebElement edit= driver.findElement(By.xpath("(//a[text()='Edit'])"));
        edit.click();

        WebElement firstNameEdit= driver.findElement(By.id("address_first_name"));
        firstNameEdit.clear();
        firstNameEdit.sendKeys("Peter");
        Bekle(1);

        WebElement lastNameEdit= driver.findElement(By.id("address_last_name"));
        lastNameEdit.clear();
        lastNameEdit.sendKeys("Crouch");
        Bekle(1);

        WebElement updateBtn= driver.findElement(By.cssSelector("[value='Update Address']"));
        updateBtn.click();
        Bekle(1);

        WebElement verifyPeter= driver.findElement(By.xpath("//span[@data-test='first_name']"));
        Assert.assertTrue(verifyPeter.getText().contains("Peter"));
        Bekle(1);

        WebElement verifyCrouch= driver.findElement(By.xpath("//span[@data-test='last_name']"));
        Assert.assertTrue(verifyCrouch.getText().contains("Crouch"));
        Bekle(1);

        WebElement addressClick= driver.findElement(By.xpath("//*[@data-test='addresses']"));
        addressClick.click();
        Bekle(1);

        WebElement destroyClick= driver.findElement(By.xpath("//*[text()='Destroy']"));
        destroyClick.click();
        Bekle(1);

        driver.switchTo().alert().accept();
        Bekle(1);

        WebElement notice= driver.findElement(By.cssSelector("[data-test='notice']"));
        Assert.assertTrue(notice.getText().contains("Address was successfully destroyed"));


        BekleKapat();
    }
}
