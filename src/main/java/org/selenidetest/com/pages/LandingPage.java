package org.selenidetest.com.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public final class LandingPage {

    private static final SelenideElement SEARCH_FIELD = $(byName("q"));

    public LandingPage navigateToLandingPage() {
        open("/");
        return this;
    }

    public SearchResultPage searchFor(String searchTerm) {
        SEARCH_FIELD.shouldBe(visible)
                .setValue(searchTerm)
                .pressEnter();
        return new SearchResultPage();
    }
}
