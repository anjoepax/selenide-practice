package org.selenidetest.com;


import org.junit.jupiter.api.Test;
import org.selenidetest.com.pages.LandingPage;

class SelenideTest {

    LandingPage landingPage = new LandingPage();

    @Test
    void firstTest() {
        String searchTerm = "Cheese";
        landingPage.navigateToLandingPage()
                .searchFor(searchTerm)
                .checkWhetherSearchResultsContains(20, "Cheese - Wikipedia");
    }

    @Test
    void secondTest() {
        String searchTerm = "Banana";
        landingPage.navigateToLandingPage()
                .searchFor(searchTerm)
                .checkWhetherSearchResultsContains(20, "Banana - Wikipedia");
    }
}
