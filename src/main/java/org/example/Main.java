package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://85.192.34.140:8081/");
        driver.quit();

    }
}