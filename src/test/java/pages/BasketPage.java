package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BasketPage {

    @Step("Проверка стоимости корзины")
    public BasketPage checkPriceInBasket() {
        String currencyPrice = $(".cart-row__wrap.hide-on-mobile")
                .$(".product-price-row.cart-row__total")
                .$(".product-price-row__price")
                .$(".currency")
                .$(".currency__price").getText();
        $(".total__sum")
                .$(".currency")
                .$(".currency__price").shouldHave(text(currencyPrice));
        return this;
    }
}
