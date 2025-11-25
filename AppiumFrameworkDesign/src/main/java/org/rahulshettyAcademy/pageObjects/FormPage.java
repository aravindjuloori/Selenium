package org.rahulshettyAcademy.pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.rahulshetty.utils.AndroidActions;

public class FormPage extends AndroidActions{
    AndroidDriver driver;

    public FormPage(AndroidDriver driver)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Aravind Juloori");

    @AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
    private WebElement nameField;

    @AndroidFindBy(xpath="//android.widget.RadioButton[@text='Female']")
    private WebElement femaleOption;

    @AndroidFindBy(xpath="//android.widget.RadioButton[@text='Male']")
    private WebElement maleOption;

    @AndroidFindBy(id="android:id/text1")
    private WebElement countrySelection;

    @AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
    private WebElement shopButton;

    @AndroidFindBy(xpath="(//android.widget.Toast)[1]")
    private WebElement toastMessage;


    public void setNameField(String name){
        nameField.sendKeys(name);
        driver.hideKeyboard();
    }

    public void toastMessage(String name){
        toastMessage.getAttribute(name);

    }
    public void setGender(String gender){

        if(gender.contains("Female")){
            femaleOption.click();
        }
        else {
            maleOption.click();
        }


    }

    public void setCountrySelection(String countryName){
        countrySelection.click();
       scrollToText(countryName);
        driver.findElement(By.xpath("//android.widget.TextView[@text='"+countryName+"']")).click();

    }

    public ProductCatalogPage submitForm(){
        shopButton.click();
             return new ProductCatalogPage(driver);

    }



}
