import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import page.CartPage;
import page.HomePage;
import page.NotebookPage;
import page.SearchPage;
import utils.PropertiesReader;
import utils.WaitHelper;


import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private WebDriver driver;

    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        String url = new PropertiesReader().getUrl();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        //WaitHelper.delay(); // For Debug!
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public NotebookPage getNotebookPage() {
        return new NotebookPage(getDriver());
    }

    public SearchPage getSearchPage() {
        return new SearchPage(getDriver());
    }

    public CartPage getCartPage() {
        return new CartPage(getDriver());
    }
}


