package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

import static Day2.MainPageYahoo.resultStatsYahoo;
import static Day2.MainPageYahoo.searchInputYahoo;
import static Day2.MainPageYahoo.submitButtonYahoo;

public class YahooSearch {

    private WebDriver driver;

    @BeforeTest
    public void setupDriver() {
        File file = new File("src/test/resources");
        String path = file.getAbsolutePath();
        System.setProperty("webdriver.gecko.driver", path + "/geckodriver");
        driver = new FirefoxDriver();
    }
//Yahoooo SearchTest
    @Test
    public void test001() {
        navigatingtoMainPageYahoo();
        typeRequestinSearchInput();
        submitSearch();
        printOutAmountofSearch();

    }

    private void navigatingtoMainPageYahoo(){
        String url = "https://search.yahoo.com";
        driver.get(url);

    }

    private void typeRequestinSearchInput(){
        driver.findElement(MainPageYahoo.searchInputYahoo).sendKeys("Portnov Computer School");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private void submitSearch(){
        driver.findElement(MainPageYahoo.submitButtonYahoo).click();
    }

    private void printOutAmountofSearch(){
        String res = driver.findElement(MainPageYahoo.resultStatsYahoo).getText();
        String res = driver.findElement(MainPageYahoo.resultStatsYahoo).getText();
       System.out.println(res);
    }

    //some status change

}

