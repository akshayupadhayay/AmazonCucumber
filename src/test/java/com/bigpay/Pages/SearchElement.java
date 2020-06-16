package com.bigpay.Pages;

import com.bigpay.BasePackage.BaseClass;
import com.bigpay.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchElement extends CommonMethods {

    @FindBy(xpath = "//span[@class='nav-sprite nav-logo-base']")
    public WebElement amazonLogo;

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id='nav-search']")
    public WebElement searchButton;


    @FindBy(xpath = "//div[@id='issDiv0']")
    public WebElement firstElement;

    public SearchElement() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    public void sendItem(String text) {
        sendText(searchBox, text);
    }

    public void searchClick() {
        click(searchButton);
    }

    public void selectFirstElement() {
        click(firstElement);
    }

    public void searchItem(String item){
        sendItem(item);
        selectFirstElement();
        searchClick();
    }
}
