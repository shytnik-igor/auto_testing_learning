package goods

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.selector.ByTagAndText
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GoodsTest {

    @BeforeAll
    fun setUp() {
        Selenide.open("https://www.21vek.by/diapers/pants5junior_pampers_03.html")
    }

    @Test
    fun notUsingDollars() {
        // Найти кнопку "В корзину”
        val addToCartButton = Selenide.element(ByTagAndText("button", "В корзину"))
        addToCartButton.shouldBe(Condition.visible)
        // Проверить, что не отображается кнопка “В корзине”
        val inCartLink = Selenide.element(ByTagAndText("a", "В корзине"))
        inCartLink.shouldNot(Condition.visible)
        // Нажать кнопку “В корзину”
        addToCartButton.click()
        // Проверить, что кнопка изменилась на “В корзине”
        addToCartButton.shouldNot(Condition.visible)
        inCartLink.shouldBe(Condition.visible)
    }
}