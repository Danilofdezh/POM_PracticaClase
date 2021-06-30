package com.demoqa.automation.pageobjects;

import net.bytebuddy.implementation.bind.annotation.Default;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/text-box")
public class TextBoxPage extends PageObject {

    public By fullNameInput = By.id("userName");
    public By emailInput = By.id("userEmail");
    public By currentAddressInput = By.id("currentAddress");
    public By permanentAddressInput = By.id("permanentAddress");
    public By submitButton = By.id("submit");

    public void sendFullName(String string){
        getDriver().findElement(fullNameInput).sendKeys(string);
    }
    public void sendEmail(String string){
        getDriver().findElement(emailInput).sendKeys(string);
    }
    public void sendCurrentAddress(String string){
        getDriver().findElement(currentAddressInput).sendKeys(string);
    }
    public void sendPermanentAddress(String string){
        getDriver().findElement(permanentAddressInput).sendKeys(string);
    }





}
