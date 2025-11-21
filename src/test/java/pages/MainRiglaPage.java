package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainRiglaPage {

    private final SelenideElement navigationTopButtonn = $(".navigation-top"),
            navigationBar = $(".navigation__main-links"),
            alphabetByAssortment = $(".widget-assortment__content"),
            symbol = $(".alphabet-forms__letter"),
            searchBar = $(".search-bar__input"),
            searchButton = $("button.search-bar__button"),
            BasketButton = $(".minicart-top._dark-mobile");
    ElementsCollection intoBasketButton = $$(".product-add-to-cart");

    public MainRiglaPage openMainPage() {
        open("");
        return this;
    }

    public MainRiglaPage openNavigationBar() {
        navigationTopButtonn.click();
        return this;
    }

    public MainRiglaPage checkInNavigationBar(String name) {
        navigationBar.$$(".navigation-item").findBy(text(name)).$("a").shouldBe(visible);
        return this;
    }

    public MainRiglaPage checkCategoryBar(String name) {
        $$(".new-tabs__tab").findBy(text(name)).$("span").shouldBe(visible);
        return this;
    }

    public MainRiglaPage selectLetterForGoods(String letter) {
        alphabetByAssortment.scrollIntoCenter().$("[href='/letter/" + letter + "']").click();
        return this;
    }

    public MainRiglaPage checkLetterForGoods(String letter) {
        symbol.shouldHave(text(letter));
        return this;
    }

    public MainRiglaPage searchGoods(String goods) {
        searchBar.sendKeys(goods);
        searchButton.click();
        return this;
    }

    public MainRiglaPage checkProductBySearchWord(String goods) {
        $$("span").findBy(text(goods)).shouldBe(visible);
        return this;
    }

    public MainRiglaPage addProductInBasket(int indexProduct) {
        intoBasketButton.get(indexProduct).scrollIntoCenter().click();
        sleep(3000);
        return this;
    }

    public MainRiglaPage openBasketPage() {
        BasketButton.click();
        sleep(3000);
        return this;
    }

    public MainRiglaPage checkBasket() {
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
