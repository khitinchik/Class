import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;


public class TestBase {

    @Step ("Откыть страницу github")
    public void openPage() {
        open("https://github.com");
    }
    @Step("Ищем репозитории eroshenkoam/allure-example")
     public void searchRepository() {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("eroshenkoam/allure-example");
        $(".header-search-input").submit();
    }

    @Step("Переходим в репозиторий")
    public void goTo() {
        $(linkText("eroshenkoam/allure-example")).click();
    }

    @Step("Открываем таб Issures")
    public void openIssures() {
        $(partialLinkText("Issues")).click();
    }

    @Step("Проверяем наличие номера")
    public void checkNumber(){
        $(withText("#59")).should(Condition.visible);
    }
}






