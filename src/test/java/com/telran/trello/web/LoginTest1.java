package com.telran.trello.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest1 {
    WebDriver wd;
    @BeforeMethod
    public void setUp(){
        wd=new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://trello.com/logged-out");


    }

    @Test
    public void testLogin()
    {
        click();

    }

    private void click() {
        wd.findElement(By.cssSelector("[href='/login']")).click();
    }

    private click () {
        return wd.findElement(By.cssSelector("[href='/login']"));
    }

    @AfterMethod
    public void tearDown()
    {

    }
}
