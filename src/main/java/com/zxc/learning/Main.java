package com.zxc.learning;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Main {
    private static Properties properties = new Properties();
    private static WebDriver driver;
    private static String url;

    @BeforeClass
        public static void setUp(){
        try {
            properties.load(new FileInputStream(new File("E:\\PerformanceAutotesting\\settings.properties")));
        }catch (IOException e){
            e.getMessage();
        }

        switch (properties.getProperty("browser")){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", properties.getProperty("webdriver.gecko.driver"));
                driver = new FirefoxDriver();
                break;
                default:
                    driver = new ChromeDriver();
        }

        url = properties.getProperty("url");

        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterClass
        public static void endTest(){
            driver.quit();
        }

        public static WebDriver getDriver(){
            return driver;
        }
}
