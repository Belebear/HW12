package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AlphabeticalCatalogPage {

    private final SelenideElement symbol = $(".alphabet-forms__letter");

    @Step("Пверка товара на выбранную букву")
    public AlphabeticalCatalogPage checkLetterForGoods(String letter) {
        symbol.shouldHave(text(letter));
        return this;
    }
}
