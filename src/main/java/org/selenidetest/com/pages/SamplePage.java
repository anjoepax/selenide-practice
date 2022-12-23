package org.selenidetest.com.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class SamplePage {

    private static final SelenideElement USERNAME_FIELD = $(byId(""));
    private static final SelenideElement PASSWORD_FIELD = $(byId(""));
    private static final SelenideElement LOGIN_BUTTON = $(byId(""));

    public void login(String username, String password) {
        USERNAME_FIELD.shouldBe(visible)
                .sendKeys(username);
        PASSWORD_FIELD.shouldBe(visible)
                .sendKeys(password);
        LOGIN_BUTTON.shouldBe(enabled)
                .click();
    }
}

