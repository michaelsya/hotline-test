package PageObjects;

import DriverManagers.DriverManager;

public class HomePage extends AbstractPage {
    public HomePage openHomePage(String homePageURL) {
        DriverManager.getDriver().get(homePageURL);
        return this;
    }

    public HomePage inputToSearchField(String input) {
        DriverManager.getDriver().findElement(getSearchFieldLR()).sendKeys(input);
        return this;
    }

    public SearchResultPage doSearch() {
        DriverManager.getDriver().findElement(getMagnifyingGlassButtonLR()).click();
        return new SearchResultPage();
    }
}
