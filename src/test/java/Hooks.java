/*
import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    FactoryPatternObject factoryPatternObject;
    WebDriver webDriver;
    HomePage homePage;

    @Before
    public void before() {
        factoryPatternObject = new FactoryPatternObject();
        webDriver = factoryPatternObject.getWebDriver("chrome"); //The WebDriver should equal the returned driver from the FactoryPatternObject
        homePage = new HomePage(webDriver); // HomePage must be instantiated at the beginning as its where you start from
    }

    @After
    public void after() {
        webDriver.quit();
    }
}
*/
