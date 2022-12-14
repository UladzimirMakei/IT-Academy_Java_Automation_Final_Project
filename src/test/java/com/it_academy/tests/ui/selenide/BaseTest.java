package com.it_academy.tests.ui.selenide;

import com.it_academy.onliner.pageobject.OnlinerHomePage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static com.it_academy.onliner.enums.OnlinerPageUrl.HOME_PAGE;


public class BaseTest {
    private final OnlinerHomePage onlinerHomePage = new OnlinerHomePage();

    @BeforeEach
    public void navigateToOnliner() {
        addListener("AllureSelenide",
                (new AllureSelenide()).screenshots(true).savePageSource(false));
        open(HOME_PAGE.getOnlinerUrl());
        onlinerHomePage
                .clickOnHeaderLink("Каталог");
    }
}
