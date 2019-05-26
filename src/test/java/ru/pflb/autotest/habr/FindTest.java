package ru.pflb.autotest.habr;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import ru.pflb.autotest.habr.pageobjects.*;

public class FindTest {

    MainPage mainPage = new MainPage();
    AccountPage accountPage = new AccountPage();
    Registration registration = new Registration();
    BasePage basePage = new BasePage();
    Services services = new Services();

    @Ignore
    @Test
    public void getTestCase1() {
        mainPage.open();
        mainPage.clickSearchButton();
        mainPage.setTextToSearchFormField();
        mainPage.sortByRating();
        mainPage.getJumpToPage();
        mainPage.getFirstMostReadable();
        mainPage.getSugnUpLink();
        accountPage.setEmail();
        accountPage.setPassword();
        WebElement warning = accountPage.getWarningElement();
        accountPage.clickComeIn();
        Assert.assertNotNull(warning);
    }

    @Test
    public void getTestCase2() {
        registration.open();
        registration.clickRegistrationButton();
        accountPage.setEmail();
        accountPage.setPassword();
        registration.setNickName();
        registration.setPasswordRepeat();
        registration.setCaptcha();
        registration.clickButton();
        WebElement warningCaptcha = registration.getWarningElement();
        Assert.assertNotNull(warningCaptcha);
    }

    @Test
    public void getTestCase3() {
        mainPage.open();
        services.clickАdvertising();
        String displayAdvertising = services.getAdvertising1();
        Assert.assertEquals( "Медийная", displayAdvertising);
    }

    @BeforeMethod
    public void setMax() {
        basePage.maximaze();
    }

    @AfterMethod
    public void closePage() {
        basePage.close();
    }
}
