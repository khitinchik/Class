import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class LambdaSteps {

    private final static String repo = "eroshenkoam/allure-example";
    private static final int number = 59;

    @Test

    public void IssueSearch() {
        step("Откыть страницу github", () -> {
            open("https://github.com");
        });

        step("Ищем репозитории eroshenkoam/allure-example", () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys("eroshenkoam/allure-example");
            $(".header-search-input").submit();
        });

        step("Переходим в репозитори" + repo, () -> {
            $(linkText(repo)).click();
        });

        step("Открываем таб Issures", () -> {
            $(partialLinkText("Issues")).click();
        });

        step("Проверяем наличие номера" + number,() -> {
        $(withText("#59")).should(Condition.visible);
        });
    }
}





