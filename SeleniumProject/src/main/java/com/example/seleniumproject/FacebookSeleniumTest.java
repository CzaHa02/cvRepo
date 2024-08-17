package com.example.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class FacebookSeleniumTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/?locale=pl_PL");
        driver.getTitle();


        try {
            WebElement cookies = driver.findElement(By.xpath("//*[@id='facebook']/body/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/div/span/span"));
            cookies.click();
            WebElement register = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
            register.click();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement typeName = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input"));
        typeName.sendKeys("NAME");

        WebElement typeSurname = driver.findElement(By.name("lastname"));
        typeSurname.sendKeys("SURNAME");

        WebElement typeNumber = driver.findElement(By.name("reg_email__"));
        typeNumber.sendKeys("abcdefgh@abc.com");

        WebElement typeMailAgain = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[3]/div/div/div[1]/input"));
        typeMailAgain.sendKeys("abcdefgh@abc.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement typePassword = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input")));
        typePassword.sendKeys("qwert12345");


        WebElement chooseBirthDaySectionTest = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]"));
        chooseBirthDaySectionTest.click();

        Random randomDay = new Random();
        int randomDaySelector = randomDay.nextInt(1, 31);
        WebElement chooseRandomBirthDay = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]/option[" + randomDaySelector + "]"));
        chooseRandomBirthDay.click();

        for (int i = 1; i <= 12; i++) {
            WebElement chooseRandomBirthMonth = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]/option[" + i + "]"));
            chooseRandomBirthMonth.click();
        }

        Random randomYear = new Random();
        int randomYearSelector = randomYear.nextInt(1, 31);
        WebElement chooseRandomYear = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]/option[" + randomYearSelector + "]"));
        chooseRandomYear.click();

        for (int i = 1; i <= 2; i++) {
            WebElement sexTester = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[" + i + "]"));
            sexTester.click();
        }

        WebElement nonstandardSettings = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[3]/label"));
        nonstandardSettings.click();
        for (int i = 1; i <= 3; i++) {
            WebElement choosePronoun = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[8]/div[1]/select/option["+i+"]"));
            choosePronoun.click();
        }

        WebElement typeOtherSex = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[8]/div[3]/div/input"));
        typeOtherSex.sendKeys("Male");
    }catch (Exception e){
            System.out.println("Something went wrong: "+e.getMessage());
        }finally {
            System.out.println("Every test went good");
           driver.quit();
        }
        }

}