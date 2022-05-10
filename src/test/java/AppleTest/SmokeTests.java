package AppleTest;

import BaseTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import static constants.Constants.*;

public class SmokeTests extends BaseTest {

    @Test
    public void checkHref() {
        HomePage homePage = new HomePage(BASE_URL);
        String href = homePage.search(SEARCHED_STRING).getFirstArticle();
        Assert.assertTrue(href.contains(SEARCHED_PHRASE_IN_URL));


        /**
         * We also can write all as a 'one' line of code:
         */
//        Assert.assertTrue(new HomePage(BASE_URL)
//                .search(SEARCHED_STRING)
//                .getFirstArticle()
//                .contains(SEARCHED_PHRASE_IN_URL));
    }
}
