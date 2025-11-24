package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AlphabeticalCatalogPage;
import pages.BasketPage;
import pages.MainRiglaPage;
import pages.SearchResultPage;
import pages.components.PopupElement;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class MainPageTest extends BaseTest {
    private final String letter = "У";
    private final String goods = "Ибуклин";
    private final int indexProduct = 0;
    MainRiglaPage mainRiglaPage = new MainRiglaPage();
    AlphabeticalCatalogPage alphabeticalCatalogPage = new AlphabeticalCatalogPage();
    BasketPage basketPage = new BasketPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    PopupElement popupElement = new PopupElement();

    @Test
    @DisplayName("Проверка наличия позиций в выпадющем списке 'Каталог'")
    @Tag("mainPage")
    void checkInNavigationBarTest() {
            mainRiglaPage.openMainPage();
            popupElement.closePopup();
            mainRiglaPage.openNavigationBar();
            mainRiglaPage.checkInNavigationBar("Идеи подарков");
            mainRiglaPage.checkInNavigationBar("Ригла Бьюти");
            mainRiglaPage.checkInNavigationBar("Ригла рекомендует");
            mainRiglaPage.checkInNavigationBar("Самое актуальное");
            mainRiglaPage.checkInNavigationBar("Лекарственные препараты");
            mainRiglaPage.checkInNavigationBar("Фитопрепараты");
            mainRiglaPage.checkInNavigationBar("Витамины и БАДы");
            mainRiglaPage.checkInNavigationBar("Планирование семьи");
            mainRiglaPage.checkInNavigationBar("Мама и малыш");
            mainRiglaPage.checkInNavigationBar("Медицинские изделия");
            mainRiglaPage.checkInNavigationBar("Приборы медицинские");
            mainRiglaPage.checkInNavigationBar("Гигиена, красота и уход");
            mainRiglaPage.checkInNavigationBar("Спорт и фитнес");
    }

    @Test
    @DisplayName("Проверка наличия категорий на главной странице")
    @Tag("mainPage")
    void checkCategoryBarTest() {
            mainRiglaPage.openMainPage();
            popupElement.closePopup();
            mainRiglaPage.checkCategoryBar("Хиты продаж");
            mainRiglaPage.checkCategoryBar("Стоп-цена");
            mainRiglaPage.checkCategoryBar("Новинки");
            mainRiglaPage.checkCategoryBar("Товар дня");
            mainRiglaPage.checkCategoryBar("Ригла Бьюти");
    }

    @Test
    @DisplayName("Проверка ассортимента товаров по алфавиту")
    @Tag("mainPage")
    void checkGoodsByLetterTest() {
            mainRiglaPage.openMainPage();
            popupElement.closePopup();
            mainRiglaPage.selectLetterForGoods(letter);
            alphabeticalCatalogPage.checkLetterForGoods(letter);
    }

    @Test
    @DisplayName("Поиск товара")
    @Tag("mainPage")
    void searchGoodsTest() {
            mainRiglaPage.openMainPage();
            popupElement.closePopup();
            mainRiglaPage.searchGoods(goods);
            popupElement.closePopup();
            searchResultPage.checkProductBySearchWord(goods);
    }

    @Test
    @DisplayName("Добавление товара в корзину")
    @Tag("mainPage")
    void addProductInBasketTest() {
            mainRiglaPage.openMainPage();
            popupElement.closePopup();
            mainRiglaPage.addProductInBasket(indexProduct);
            mainRiglaPage.openBasketPage();
            popupElement.closePopup();
            basketPage.checkPriceInBasket();
    }
}
