import com.codeborne.selenide.CollectionCondition.sizeGreaterThan
import com.codeborne.selenide.Condition.text
import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.Selenide.*
import com.codeborne.selenide.SelenideElement
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.openqa.selenium.By

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GoogleTest {

    @BeforeAll
    fun setUp() {
        open("https://google.com/ncr")
    }

    @Test
    fun usingDollarsWithBackticks() {
        `$`(By.name("q")).setValue("selenide").pressEnter()
        `$$`("#res .g").shouldHave(sizeGreaterThan(5))
        `$`("#res .g").shouldHave(text("concise ui tests in Java"))
    }

    @Test fun notUsingDollars() {
        element(By.name("q")).setValue("selenide").pressEnter()
        elements(By.cssSelector("#res .g")).shouldHave(sizeGreaterThan(5))
        element(By.cssSelector("#res .g")).shouldHave(text("concise ui tests in Java"))
    }

    @Test fun usingAliases() {
        get("[name=q]").setValue("selenide").pressEnter()
        all("#res .g").shouldHave(sizeGreaterThan(5))
        get("#res .g").shouldHave(text("concise ui tests in Java"))
    }

    fun get(selector: String) : SelenideElement {
        return `$`(selector)
    }

    fun all(selector: String) : ElementsCollection {
        return `$$`(selector)
    }
}