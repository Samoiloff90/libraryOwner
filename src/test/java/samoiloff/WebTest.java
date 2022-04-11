package samoiloff;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

public class WebTest extends TestBase{
    @Test
    public void webTest() {
        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });

        step("Вводим поисковый запрос", () -> {
            $("[data-test-selector='nav-search-input']").setValue("Samoiloff90").pressEnter();
            $$("ul.repo-list").first().shouldHave(text("Samoiloff90"));
            sleep(1000);
        });
    }
}