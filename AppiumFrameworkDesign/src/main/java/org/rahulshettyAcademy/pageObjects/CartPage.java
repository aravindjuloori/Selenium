package org.rahulshettyAcademy.pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.rahulshetty.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CartPage extends AndroidActions {
    AndroidDriver driver;


    public CartPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    @AndroidFindBy(id="com.androidsample.generalstore:id/productPrice")
    private List<WebElement> productList;

    @AndroidFindBy(id="com.androidsample.generalstore:id/totalAmountLbl")
    private WebElement totalAmount;

    @AndroidFindBy(id="com.androidsample.generalstore:id/termsButton")
    private WebElement terms;

    @AndroidFindBy(id="android:id/button1")
    private WebElement acceptButton;

    @AndroidFindBy(id="com.androidsample.generalstore:id/btnProceed")
    private WebElement proceed;

    @AndroidFindBy(className="android.widget.CheckBox")
    private WebElement Checkbox;




}
