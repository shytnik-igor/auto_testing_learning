package goods

import com.codeborne.selenide.Selenide
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import page.GoodsPage

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GoodsTest {

    @BeforeAll
    fun setUp() {
        Selenide.open("https://www.21vek.by/diapers/pants5junior_pampers_03.html")
    }

    @Test
    fun notUsingDollars() {
        val goodsPage = GoodsPage()
        //Проверить, что отображается кнопка “В корзину”
        goodsPage.assertAddToCartButtonVisible()
        //Проверить, что не отображается кнопка “В корзине”
        goodsPage.assertInCartLinkInvisible()
        //Нажать кнопку “В корзину”
        goodsPage.clickAddToCartButton()
        //Проверить, что отображается кнопка “В корзине”
        goodsPage.assertInCartLinkVisible()
        //Проверить, что не отображается кнопка “В корзину”
        goodsPage.assertAddToCartButtonInvisible()
    }
}