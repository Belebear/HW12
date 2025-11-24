package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainRiglaPage {

    private final SelenideElement navigationTopButtonn = $(".navigation-top"),
            navigationBar = $(".navigation__main-links"),
            alphabetByAssortment = $(".widget-assortment__content"),
            searchBar = $(".search-bar__input"),
            searchButton = $("button.search-bar__button"),
            BasketButton = $(".minicart-top._dark-mobile");
    ElementsCollection intoBasketButton = $$(".product-add-to-cart");

    @Step("Открытие главной страницы")
    public MainRiglaPage openMainPage() {
        open("");
        return this;
    }

    @Step("Раскрытие бургера 'Каталог'")
    public MainRiglaPage openNavigationBar() {
        navigationTopButtonn.click();
        return this;
    }

    @Step("Проверка пункта каталога")
    public MainRiglaPage checkInNavigationBar(String name) {
        navigationBar.$$(".navigation-item").findBy(text(name)).$("a").shouldBe(visible);
        return this;
    }

    @Step("Проверка категории")
    public MainRiglaPage checkCategoryBar(String name) {
        $$(".new-tabs__tab").findBy(text(name)).$("span").shouldBe(visible);
        return this;
    }

    @Step("Клик по букве в алфавите")
    public MainRiglaPage selectLetterForGoods(String letter) {
        alphabetByAssortment.scrollIntoCenter().$("[href='/letter/" + letter + "']").click();
        return this;
    }

    @Step("Поиск по товару в поисковой строке")
    public MainRiglaPage searchGoods(String goods) {
        searchBar.sendKeys(goods);
        searchButton.click();
        return this;
    }

    @Step("Клик на кнопку 'в корзину'")
    public MainRiglaPage addProductInBasket(int indexProduct) {
        intoBasketButton.get(indexProduct).scrollIntoCenter().click();
        sleep(3000);
        return this;
    }

    @Step("Переход в корзину")
    public MainRiglaPage openBasketPage() {
        BasketButton.click();
        sleep(3000);
        return this;
    }


}
