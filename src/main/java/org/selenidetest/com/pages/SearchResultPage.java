package org.selenidetest.com.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.CollectionCondition.sizeLessThanOrEqual;
import static com.codeborne.selenide.Selenide.$$x;

public final class SearchResultPage {

    private static final ElementsCollection SEARCH_RESULT_HEADING_LINK = $$x("//div[@id='search']//h3");

    public void checkWhetherSearchResultsContains(int numberOfResult, String containsItem) {
        SEARCH_RESULT_HEADING_LINK
                .shouldHave(sizeLessThanOrEqual(numberOfResult))
                .shouldHave(itemWithText(containsItem));
    }
}
