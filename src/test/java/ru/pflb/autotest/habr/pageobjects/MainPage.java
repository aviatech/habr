package ru.pflb.autotest.habr.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    @Override
    public void open() {
        chromeDriver.get("https://habr.com/ru/");
    }

    public void clickSearchButton() {
        WebElement webElementSign = chromeDriver.findElementByXPath("//button[@id='search-form-btn']");
        webElementSign.click();
    }

    public void setTextToSearchFormField() {
        WebElement searchFormField = chromeDriver.findElementByXPath("//input[@id='search-form-field']");
        wait.until(ExpectedConditions.visibilityOf(searchFormField));
        searchFormField.clear();
        searchFormField.sendKeys("xpath");
        searchFormField.sendKeys(Keys.ENTER);
    }

    public void sortByRating() {
        WebElement sortRating = chromeDriver.findElementByXPath("//a[text()='по рейтингу']");
        sortRating.click();
    }

    public void getJumpToPage() {
        WebElement page = chromeDriver.findElementByXPath("//a[text()='4']");
        //chromeDriver.scrollToElement(page);
        page.click();
    }

    public void getFirstMostReadable() {
        WebElement firstLink = chromeDriver.findElementByXPath("//div[@id = 'broadcast_posts_today']/ul/li[1]/a");
        firstLink.click();
    }

    public void getSugnUpLink() {
        WebElement signUpLink = chromeDriver.findElementByXPath("//div[@class = 'footer-block__content']/ul/li[1]/a[text() = 'Войти']");
        signUpLink.click();
    }


}
