package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {

    @Step("Проверка товара по названию")
    public SearchResultPage checkProductBySearchWord(String goods) {
        $$("span").findBy(text(goods)).shouldBe(visible);
        return this;
    }
}
