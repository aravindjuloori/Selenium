package org.rahulshettyacademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.rahulshettyAcademy.pageObjects.FormPage;
import org.rahulshettyAcademy.pageObjects.ProductCatalogPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Ecommerce_tc1 extends BaseTest {

    @Test
    public void fillform() throws InterruptedException {


        formPage.setNameField("Aravind Juloori");
        formPage.setGender("Female");
        formPage.setCountrySelection("Argentina");
        //formPage.submitForm("Jordan 6 Rings");
        ProductCatalogPage productCatalogPage = formPage.submitForm();

        //String toastMessage=driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
        //System.out.println(toastMessage);
        //Assert.assertEquals(toastMessage, "Please enter your name");
       // driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))"));
       //int count= productCatalogPage.getProductCount("Jordan 6 Rings");

        productCatalogPage.getProductListCount("Jordan 6 Rings");
      // int productCount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
        productCatalogPage.addproductsToCart("Jordan 6 Rings");
        productCatalogPage.addtoCart();
        /*for (int i = 0; i < count; i++) {
            String productName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();

            if (productName.equalsIgnoreCase("Jordan 6 Rings")) {
                driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
            }

        }*/
	/*	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
			wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text", "cart"));
			
			String lastPageProduct=driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
			Assert.assertEquals(lastPageProduct, "Jordan 6 Rings");
	}*/
    }
}
