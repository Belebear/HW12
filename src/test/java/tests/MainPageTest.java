package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainRiglaPage;
import pages.components.PopupElement;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class MainPageTest extends BaseTest {
    private final String letter = "У";
    private final String goods = "Ибуклин";
    private final int indexProduct = 0;
    MainRiglaPage mainRiglaPage = new MainRiglaPage();
    PopupElement popupElement = new PopupElement();

    @Test
    @DisplayName("Проверка позиций в каталоге")
    @Tag("mainPage")
    void checkInNavigationBarTest() {

        step("Открытие главной страницы", () -> {
            mainRiglaPage.openMainPage();
        });
        step("Закрытие попапа", () -> {
            popupElement.closePopup();
        });
        step("Раскрытие бургера 'Каталог'", () -> {
            mainRiglaPage.openNavigationBar();
        });
        step("Проверка пункта 'Идеи подарков'", () -> {
            mainRiglaPage.checkInNavigationBar("Идеи подарков");
        });
        step("Проверка пункта 'Ригла Бьюти'", () -> {
            mainRiglaPage.checkInNavigationBar("Ригла Бьюти");
        });
        step("Проверка пункта 'Ригла рекомендует'", () -> {
            mainRiglaPage.checkInNavigationBar("Ригла рекомендует");
        });
        step("Проверка пункта 'Самое актуальное'", () -> {
            mainRiglaPage.checkInNavigationBar("Самое актуальное");
        });
        step("Проверка пункта 'Лекарственные препараты'", () -> {
            mainRiglaPage.checkInNavigationBar("Лекарственные препараты");
        });
        step("Проверка пункта 'Фитопрепараты'", () -> {
            mainRiglaPage.checkInNavigationBar("Фитопрепараты");
        });
        step("Проверка пункта 'Витамины и БАДы'", () -> {
            mainRiglaPage.checkInNavigationBar("Витамины и БАДы");
        });
        step("Проверка пункта 'Планирование семьи'", () -> {
            mainRiglaPage.checkInNavigationBar("Планирование семьи");
        });
        step("Проверка пункта 'Мама и малыш'", () -> {
            mainRiglaPage.checkInNavigationBar("Мама и малыш");
        });
        step("Проверка пункта 'Медицинские изделия'", () -> {
            mainRiglaPage.checkInNavigationBar("Медицинские изделия");
        });
        step("Проверка пункта 'Приборы медицинские'", () -> {
            mainRiglaPage.checkInNavigationBar("Приборы медицинские");
        });
        step("Проверка пункта 'Гигиена, красота и уход'", () -> {
            mainRiglaPage.checkInNavigationBar("Гигиена, красота и уход");
        });
        step("Проверка пункта 'Спорт и фитнес'", () -> {
            mainRiglaPage.checkInNavigationBar("Спорт и фитнес");
        });
    }

    @Test
    @DisplayName("Проверка категорий")
    @Tag("mainPage")
    void checkCategoryBarTest() {
        step("Открытие главной страницы", () -> {
            mainRiglaPage.openMainPage();
        });
        step("Закрытие попапа", () -> {
            popupElement.closePopup();
        });
        step("Проверка категории 'Хиты продаж'", () -> {
            mainRiglaPage.checkCategoryBar("Хиты продаж");
        });
        step("Проверка категории 'Стоп-цена'", () -> {
            mainRiglaPage.checkCategoryBar("Стоп-цена");
        });
        step("Проверка категории 'Новинки'", () -> {
            mainRiglaPage.checkCategoryBar("Новинки");
        });
        step("Проверка категории 'Товар дня'", () -> {
            mainRiglaPage.checkCategoryBar("Товар дня");
        });
        step("Проверка категории 'Ригла Бьюти'", () -> {
            mainRiglaPage.checkCategoryBar("Ригла Бьюти");
        });
    }

    @Test
    @DisplayName("Проверка ассортимента по алфавиту")
    @Tag("mainPage")
    void checkGoodsByLetterTest() {
        step("Открытие главной страницы", () -> {
            mainRiglaPage.openMainPage();
        });
        step("Закрытие попапа", () -> {
            popupElement.closePopup();
        });
        step("Клик по букве в алфавите", () -> {
            mainRiglaPage.selectLetterForGoods(letter);
        });
        step("Клик по букве в алфавите", () -> {
            mainRiglaPage.checkLetterForGoods(letter);
        });
    }

    @Test
    @DisplayName("Поиск товара")
    @Tag("mainPage")
    void searchGoodsTest() {
        step("Открытие главной страницы", () -> {
            mainRiglaPage.openMainPage();
        });
        step("Закрытие попапа", () -> {
            popupElement.closePopup();
        });
        step("Поиск по товару в поисковой строке", () -> {
            mainRiglaPage.searchGoods(goods);
        });
        step("Закрытие попапа", () -> {
            popupElement.closePopup();
        });
        step("Проверка товара по названию", () -> {
            mainRiglaPage.checkProductBySearchWord(goods);
        });
    }

    @Test
    @DisplayName("Добавление товара в корзину")
    @Tag("mainPage")
    void addProductInBasketTest() {
        step("Открытие главной страницы", () -> {
            mainRiglaPage.openMainPage();
        });
        step("Закрытие попапа", () -> {
            popupElement.closePopup();
        });
        step("Клик на кнопку 'в корзину' на" + indexProduct + "товаре", () -> {
            mainRiglaPage.addProductInBasket(indexProduct);
        });
        step("Переход в корзину", () -> {
            mainRiglaPage.openBasketPage();
        });
        step("Закрытие попапа", () -> {
            popupElement.closePopup();
        });
        step("Проверка стоимости корзины", () -> {
            mainRiglaPage.checkBasket();
        });
    }
}
