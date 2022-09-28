package goods

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.selector.ByTagAndText
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GoodsTest {

    @BeforeAll
    fun setUp() {
        // TODO вписать, какую страницу открывать
        Selenide.open("https://google.com/ncr")
    }

    @Test
    fun notUsingDollars() {
        // TODO Реализовать шаги тест-кейса
        // Найти кнопку "В корзину”
        val addToCartButton = Selenide.element(ByTagAndText("button", "В корзину"))
        // Проверить, что не отображается кнопка “В корзине”

        // Нажать кнопку “В корзину”

        // Проверить, что кнопка изменилась на “В корзине”

    }
}