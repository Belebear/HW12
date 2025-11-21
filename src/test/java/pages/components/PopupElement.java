package pages.components;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class PopupElement {
    public void closePopup() {
        SelenideElement closeButton = $(".popup-metadata-type-slider-close__btn");
        sleep(3000);
        if (closeButton.isDisplayed()) {
            closeButton.click();
        } else {
            sleep(500);
        }

    }
}
