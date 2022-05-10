package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class SearchedPages {

    private final SelenideElement articleTitles = $x("//article[contains(@class,'post-460746 post type-post status-publish format-standard has-post-thumbnail hentry category-eto-interesno tag-iphone-13-pro')]");

    /**
     * return href from the 1st article
     */
    public String getFirstArticle(){
        return articleTitles.getText();
    }
}
