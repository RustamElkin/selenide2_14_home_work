package githab;

import config.TestConfig;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TitleFromPricePageTest extends TestConfig {

    @Test
    public void checkTitleFromPricePage() {

        // На главной странице GitHub выберите меню
        open("https://github.com");

        // Pricing -> Compare Plans с помощью команды hover для Pricing.
        // Верстка поменялась, ховер сделал на Open Source
        $(byText("Open Source")).hover();

        // после кликнул по Pricing
        $(byText("Pricing")).click();

        // Убедитесь что загрузилась нужная страница (например что заголовок - "Choose the plan that’s right for you."
        // Заголовок тоже поменялся
        $(".h2-mktg").shouldHave(text("Get the complete developer platform."));
    }
}