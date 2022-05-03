package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SearchPage extends BasePage {

    private WebElement checkboxBrand;
    private WebElement dropdownFilter;

    public SearchPage(WebDriver driver) {
        super(driver);
        init();
    }

    private void init() {
        checkboxBrand = findElementByXpath("//a[@data-id='HP']", Duration.ofSeconds(60));
        dropdownFilter = findElementByXpath("//select", Duration.ofSeconds(60));
    }

    public void clickOnBrand() {
        checkboxBrand.click();
    }

    public void selectDropDownFilter() {

        Select dropdown = new Select(dropdownFilter);
        dropdown.selectByVisibleText("От дорогих к дешевым");
    }
}
