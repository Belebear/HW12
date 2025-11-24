package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class PopupElement {

    @Step("Закрытие попапа")
    public void closePopup() {
        SelenideElement closeButton = $(".popup-metadata-type-slider-close__btn");
        sleep(5000);
        if (closeButton.isDisplayed()) {
            closeButton.click();
        } else {
            sleep(500);
        }

    }
}
