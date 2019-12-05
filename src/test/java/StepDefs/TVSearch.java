package StepDefs;

import PageObjects.HomePage;
import PageObjects.ItemPage;
import PageObjects.SearchResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tests.TestSearchFeature;

public class TVSearch {
    @Given("I am on the {string} website")
    public void iAmOnTheWebsite(String url) {
        HomePage homePage = new HomePage();
        homePage.openHomePage(url);
    }

    @When("I enter {string} in the search field")
    public void iEnterInTheSearchField(String textToSearch) {
        HomePage homePage = new HomePage();
        homePage.inputToSearchField(textToSearch);
    }

    @When("click on search")
    public void clickOnSearch() {
        HomePage homePage = new HomePage();
        homePage.doSearch();
    }

    @When("I click on the first item in the list on a search result page")
    public void iClickOnTheFirstItemInTheListOnASearchResultPage() {
        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.clickOnFirstItemFromSearchResult();
    }

    @Then("I see a word {string} in the item description the item page")
    public void iSeeAWordInTheItemDescriptionTheItemPage(String keyword) {
        TestSearchFeature.verifyIfElementHas(keyword);
    }
}
