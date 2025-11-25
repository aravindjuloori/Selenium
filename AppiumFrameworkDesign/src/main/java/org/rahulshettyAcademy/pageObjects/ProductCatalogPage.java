package org.rahulshettyAcademy.pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.rahulshetty.utils.AndroidActions;

import java.util.List;

public class ProductCatalogPage extends AndroidActions {
    AndroidDriver driver;

    public  ProductCatalogPage(AndroidDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }
    @AndroidFindBy(id="com.androidsample.generalstore:id/productName")
    private List<WebElement> productListNames;

    @AndroidFindBy(id="com.androidsample.generalstore:id/productAddCart")
    private List<WebElement> addToCartButton;

    @AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
    private WebElement cartButton;





    public List<WebElement> getProductListCount(String text) {
        scrollToText(text);
        return productListNames;
    }


  public void addproductsToCart(String targetProductName) {

        int count=productListNames.size();
      for (int i = 0; i < count; i++) {
          String productName =productListNames.get(i).getText();
          if (productName.equalsIgnoreCase(targetProductName )) {
             addToCartButton.get(i).click();


      }
    }



}

        public void addtoCart(){
            cartButton.click();
        }
    }
