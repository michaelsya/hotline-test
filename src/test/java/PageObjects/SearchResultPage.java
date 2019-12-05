package PageObjects;

import DriverManagers.DriverManager;
import Elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResultPage extends AbstractPage {
    private  By firstItemInTheListLR = new By.ByCssSelector("li:nth-of-type(1) > .item-price.stick-bottom > " +
            "div:nth-of-type(1) > div:nth-of-type(3) > .link");
    Button firstItemInTheList = new Button(firstItemInTheListLR, "First item from the Search Result page");

    public ItemPage clickOnFirstItemFromSearchResult() {
        DriverManager.wait.until(ExpectedConditions.visibilityOfElementLocated(firstItemInTheListLR));
        DriverManager.getDriver().findElement(firstItemInTheListLR).click();
        return new ItemPage();
    }
}
