package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class NotebookPage extends BasePage {

    private WebElement cartButton;
    private List<WebElement> addToCartButton;

    public NotebookPage(WebDriver driver) {
        super(driver);
        init();
    }

    private void init() {
        addToCartButton = findElementsByXpath("//button[contains(@class,'buy-button')]", Duration.ofSeconds(60));
        cartButton = findElementByXpath("//li[7]/rz-cart/button", Duration.ofSeconds(60));
    }

    public void clickOnBuyButton() {
        addToCartButton.get(0).click();
    }

    public void clickOnCartButton() {
        cartButton.click();
    }
}