package com.example.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccentureSeleniumTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.accenture.com/pl-pl");
        try {
            WebElement cookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
            cookies.click();
            System.out.println("Cookies test went good...");
        } catch (Exception e) {
            System.out.println("cookies button failed..." + "\n" + "Exception" + e);
        }
        try {
            WebElement aboutUs1 = driver.findElement(By.xpath("/html/body/div[2]/div/header/div/div/div/div/div/div[1]/nav/div[1]/button"));
            aboutUs1.click();


            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            WebElement aboutUs2 = driver.findElement(By.id("globalnav-primarynavlinks-item1-f6df395325"));
            aboutUs2.click();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            WebElement aboutUs3 = driver.findElement(By.xpath("/html/body/div[2]/div/header/div/div/div/div/div/div[1]/nav/div[3]/ul/li[2]/div/div/div/div/div/div[1]/div/a[1]"));
            aboutUs3.click();

            WebElement aboutUs4Scroll = driver.findElement(By.id("page-e2619725dd"));
            aboutUs4Scroll.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement aboutUsTextOurGoal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".logo-text-animate.bp-logo-section-subtitle.text-animate-1")));
            WebElement aboutUsTextOurGoal2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".logo-text-animate.bp-logo-section-description.text-animate-2")));
            String ourGoal1 = "First line: " + aboutUsTextOurGoal.getText();
            String ourGoal2 = "Second line: " + aboutUsTextOurGoal2.getText();
            System.out.println("Our goal text test: " + "\n" + ourGoal1 + "\n" + ourGoal2);
            System.out.println("About us text test went good....");
        } catch (Exception a) {
            System.out.println("About us text test went wrong...." + "\n" + "Exception: " + a);
        }

        try {
            WebElement mainSite = driver.findElement(By.xpath("/html/body/div[2]/div/header/div/div/div/div/nav/div/div[1]/div[2]/a"));
            mainSite.click();
            System.out.println("Main page button test went good");
        } catch (Exception b) {
            System.out.println("Main page button test went wrong the exception is: " + b);
        }
            try {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                WebElement languageSelector = driver.findElement(By.className("rad-global-nav__language-selector"));
                languageSelector.click();
                WebElement languageChangeToSpanish = driver.findElement(By.xpath("//*[@id=\"globalnav-f16021d3bc\"]/div[1]/nav/div[4]/div[2]/div/div[2]/ul/li[48]/a"));
                languageChangeToSpanish.click();
                WebElement languageSelector2 = driver.findElement(By.className("rad-global-nav__language-selector"));
                languageSelector2.click();

                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                WebElement languageChangeToPolish = driver.findElement(By.xpath("/html/body/div[2]/div/header/div/div/div/div/div/div[1]/nav/div[4]/div[2]/div/div[2]/ul/li[41]/a"));
                languageChangeToPolish.click();
                System.out.println("Language test went good...");
            } catch (Exception c) {
                System.out.println("Language set test went wrong..." + "\n" + "Exception: " + c);
            }
            try {
                WebElement menus = driver.findElement(By.xpath("/html/body/div[2]/div/header/div/div/div/div/div/div[1]/nav/div[1]/button"));
                menus.click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                WebElement careersButton = driver.findElement(By.xpath("/html/body/div[2]/div/header/div/div/div/div/div/div[1]/nav/div[3]/ul/li[3]/button"));
                careersButton.click();
                WebElement searchAndApply = driver.findElement(By.xpath("/html/body/div[2]/div/header/div/div/div/div/div/div[1]/nav/div[3]/ul/li[3]/div/div/div/div/div[2]/div[1]/div/a[1]"));
                searchAndApply.click();
                WebElement searchItFrase = driver.findElement(By.className("cmp-jobs-search-hero__search-input"));
                searchItFrase.sendKeys("IT");
                WebElement searchButton = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div[1]/div/div/div/div[1]/div/div[2]/form/div[2]/button"));
                searchButton.click();
                System.out.println("Career searching test went good");
            }catch (Exception d){
                System.out.println("Career searching test went wrong, exception: "+d);
            }
        System.out.println("Test is over...");
            driver.quit();
        }
    }



