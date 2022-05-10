package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$x;


/**
 * HomePage of the appleinsider.ru
 */
public class HomePage {

    private final SelenideElement textBoxInput = $x("//input[@type='text']");

    public HomePage (String url){
        Selenide.open(url);
    }

    /**
     * Run search between articles and click enter
     * @param searchString the article we are searching
     */
    public SearchedPages search(String searchString){
     textBoxInput.setValue(searchString).sendKeys(Keys.ENTER);
     return new SearchedPages();
    }
}
