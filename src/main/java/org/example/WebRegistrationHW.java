package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebRegistrationHW
{
    static protected WebDriver driver ;     // 1
    @Test
    public void userShouldAbleToRegisterSuccessfullyMatlan()
    {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowsersDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.matalan.co.uk/");
        driver.findElement(By.linkText("My Account")).click();
       // WebDriverWait wait = new WebDriverWait(driver,20);
       //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Mens Jumpers']")));

        driver.findElement(By.id("account_form_email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.xpath("//button[@data-behavior = 'save_button']")).click();
        driver.findElement(By.id("account_form_meta_attributes[first_name][value]")).sendKeys("Tarjani");
        driver.findElement(By.id("account_form_meta_attributes[last_name][value]")).sendKeys("Kachhia");
        driver.findElement(By.id("account_form_email_confirmation")).sendKeys("abcd@gmail.com");
        driver.findElement(By.id("account_form_password")).sendKeys("Abcd1234");
        driver.findElement(By.id("account_form_password_confirmation")).sendKeys("Abcd1234");
    }
        @Test
        public void commonMethodToOpenBrowser()         // 2 A
        {
            System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowsersDriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().fullscreen();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }

        @Test
        public void UserShouldAbleToRegisterSuccessfullyAsda()      //2
        {
            commonMethodToOpenBrowser();
            driver.get("https://www.asda.com/");
            driver.findElement(By.linkText("Groceries")).click();
            driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();

            driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kachhiatarjani@gmail.com");
            driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("Abcd1234");
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("HA02LH");
            driver.findElement(By.xpath("//label[@class='regCheckTnC check-box']//span[@class='checkmark']")).click();
            driver.findElement(By.xpath("//label[@class=' check-box']//span[@class='checkmark']")).click();
            driver.findElement(By.xpath("//button[@type='submit']")).click();
        }
        @Test
        public void UserShouldAbleToRegisterSuccessfullyMorrisons()     //3
        {
            commonMethodToOpenBrowser();
            driver.get("https://groceries.morrisons.com/webshop/startWebshop.do");
            driver.findElement(By.id("quickReg")).click();
            driver.findElement(By.id("postcode")).sendKeys("HA02LH");
            driver.findElement(By.xpath("//input[@type='submit']")).click();
            Select select = new Select(driver.findElement(By.id("title")));
            select.selectByVisibleText("Mrs");
            driver.findElement(By.id("firstName")).sendKeys("Tarjani");
            driver.findElement(By.id("lastName")).sendKeys("Kachhia");
            driver.findElement(By.id("login")).sendKeys("abcd@gmail.com");
            driver.findElement(By.id("password")).sendKeys("Abcd1234");
            driver.findElement(By.id("registration-submit-button")).click();
        }
        @Test
        public void UserShouldAbleToRegisterSuccessfullyTesco()     //4
        {
            commonMethodToOpenBrowser();
            driver.get("https://secure.tesco.com/account/en-GB/register");
            driver.findElement(By.id("username")).sendKeys("abcd@gmail.com");
            driver.findElement(By.id("password")).sendKeys("Abcd1234!");
            driver.findElement(By.xpath("//label[contains(@for,'dont')]//span[contains(@class,'dot')]")).click();
           Select select = new Select(driver.findElement(By.id("title")));
            select.selectByVisibleText("Mrs");
            driver.findElement(By.id("first-name")).sendKeys("Tarjani");
            driver.findElement(By.id("last-name")).sendKeys("Kachhia");
            driver.findElement(By.id("phone-number")).sendKeys("07894905098");
            driver.findElement(By.id("postcode")).sendKeys("HA02LH");
            driver.findElement(By.xpath("//span[contains(text(),'Find address')]")).click();
            Select select1 = new Select(driver.findElement(By.id("address-dropdown")));
            select1.selectByVisibleText("68 Central Road");

            driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
        }


        @Test
        public void UserShouldAbleToRegisterSuccessfullyNext() throws InterruptedException
        {
            commonMethodToOpenBrowser();
            driver.get("https://www.next.co.uk/");
            driver.findElement(By.xpath("//a[contains(@title,'account ')]")).click();
            driver.findElement(By.xpath("//*[@id=\"sec\"]/div/a/span")).click();
            Select select = new Select(driver.findElement(By.id("Title")));
            select.selectByVisibleText("Mrs");
            driver.findElement(By.id("FirstName")).sendKeys("Tarjani");
            driver.findElement(By.id("LastName")).sendKeys("Kachhia");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.id("Email")).sendKeys("kachhiatarjani@gmail.com");
            driver.findElement(By.id("Password")).sendKeys("Abcd1234");

            driver.findElement(By.id("DobDate")).sendKeys("21 04 81");
            driver.findElement(By.id("PhoneNumber")).sendKeys("07894905098");
            driver.findElement(By.id("HouseNumberOrName")).sendKeys("68");
            driver.findElement(By.id("Postcode")).sendKeys("HA0 2LH");
            driver.findElement(By.id("SearchPostcode")).click();
            driver.findElement(By.xpath("//label[contains(text(),'NO')]")).click();
            driver.findElement(By.id("ChkByPost")).click();
            driver.findElement(By.id("ChkByTel")).click();
            driver.findElement(By.id("ChkBySms")).click();
            driver.findElement(By.id("SignupButton")).click();

       }

}
