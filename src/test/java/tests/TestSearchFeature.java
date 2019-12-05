package tests;

import DriverManagers.DriverManager;
import PageObjects.HomePage;
import PageObjects.ItemPage;
import PageObjects.SearchResultPage;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TestSearchFeature {

    public static void verifyIfElementHas(String textToVerify) {
        ItemPage ip = new ItemPage();
        Assert.assertTrue(ip.getFirstItemDescriptionText().contains(textToVerify));
    }

}