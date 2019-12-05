package PageObjects;

import Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;
@Getter
public class AbstractPage {
    private By searchFieldLR = By.id("searchbox");
    private By homePageLR = By.cssSelector("[href] [alt='Hotline – сравнить цены в интернет-магазинах Украины']");
    private By magnifyingGlassButtonLR = By.id("doSearch");
    Button homePage = new Button(homePageLR, "Home Page");
    Field searchField = new Field(searchFieldLR, "Search Field");
    Button magnifyingGlassButton = new Button(magnifyingGlassButtonLR, "Magnifying Glass Button to perform search");
}
