package elements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class GameCard {
    private final SelenideElement card;
    private final SelenideElement gameCaption = $x("//div[contains(@class, 'caption')]");

    public GameCard(SelenideElement card){
        this.card = card;
    }

    public String getCaption(){
        return gameCaption.getText();
    }

    public boolean isVisible(){
        return card.isDisplayed();
    }
}