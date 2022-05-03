import model.FiltersModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Log;
import utils.XMLToObject;


public class CheckSumInCart extends BaseTest {

    @Test(priority = 1, description = "Check If Sum In Cart Is Less Than ")
    public void checkIfSumInCartIsLessThan250000UAH() {

        FiltersModel filtersModel = XMLToObject.deserializeFromXML();

        Log.setNameClass("CheckSumInCart");
        Log.info("Start checkIfSumInCartIsLessThan250000UAH()");

        Log.info("1) Open page", getHomePage().getCurrentUrl());
        Log.info("2) Enter a word in the search:", filtersModel.getName());
        getHomePage().inputSearchQuery(filtersModel.getName());
        getHomePage().clickOnFindButton();

        Log.info("3) Set filter on the search page.");
        getSearchPage().clickOnBrand();
        getSearchPage().selectDropDownFilter();

        Log.info("4) Select a product, go to the cart.");
        getNotebookPage().clickOnBuyButton();
        getNotebookPage().clickOnCartButton();

        Log.info("5) Open cart, get price.");
        getCartPage().getTextOfPriceProductInCart();

        Log.info("6) Check if sum in cart is less than <", filtersModel.getPrice());
        Assert.assertTrue(Integer.parseInt(getCartPage().getTextOfPriceProductInCart()) < Integer.parseInt(filtersModel.getPrice()));

        Log.info("Finish checkIfSumInCartIsLessThan250000UAH()");
    }


}
