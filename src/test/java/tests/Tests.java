package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tests {



    public static void main (String[] args) {

       WebDriver browser = new ChromeDriver();

       //test 1

       browser.get("http://jira.hillel.it:8080");

       browser.findElement(By.cssSelector("input[id=login-form-username]"))
               .sendKeys("autorob");

       browser.findElement(By.cssSelector("input[id=login-form-password]"))
                .sendKeys("forautotests");

       browser.findElement(By.cssSelector("input[id=login]")).click();
       // "input[id=login]" - doesn't work, but simple "input[id=login]" is working.



        //test 2

        // у меня фейлится test 2 в самом начале.

        browser.findElement(By.cssSelector("input[id=create-menu]")).click();

        browser.findElement(By.cssSelector("input[id=summary]"))
                .sendKeys("example");

        browser.findElement(By.cssSelector("input[id=tinymce]"))
                .sendKeys("example1");

        browser.findElement(By.cssSelector("input[id=labels-textarea]"))
                .sendKeys("example2");

        browser.findElement(By.cssSelector("input[id=tinymce]"))
                .sendKeys("example3");

        browser.findElement(By.cssSelector("input[id=issuelinks-issues-textarea]"))
                .sendKeys("example4");

        browser.findElement(By.cssSelector("input[id=customfield_10000-field]"))
                .sendKeys("example5");

        browser.findElement(By.cssSelector("input[id=create-issue-submit]")).click();

        // как сделать проверку не знаю..

























          //browser.quit();



    }

}
