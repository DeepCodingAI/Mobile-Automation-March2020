package articles;

import base.CommonAPI;
import pages.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ArticleTest extends CommonAPI {

    @Test
    public void testArticles(){
        MainPage mainPage = PageFactory.initElements(appiumDriver, MainPage.class);
        mainPage.goToArticles();
    }

}
