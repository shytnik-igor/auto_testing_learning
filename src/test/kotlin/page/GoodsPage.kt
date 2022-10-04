package page

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.selector.ByTagAndText

class GoodsPage {

    val addToCartButton = Selenide.element(ByTagAndText("button", "В корзину"))
    val inCartLink = Selenide.element(ByTagAndText("a", "В корзине"))

    fun assertAddToCartButtonVisible() {
        addToCartButton.shouldBe(Condition.visible)
    }

    fun clickAddToCartButton() {
        addToCartButton.click()
    }

    fun assertAddToCartButtonInvisible() {
        addToCartButton.shouldNot(Condition.visible)
    }

    fun assertInCartLinkInvisible() {
        inCartLink.shouldNot(Condition.visible)
    }

    fun assertInCartLinkVisible() {
        inCartLink.shouldBe(Condition.visible)
    }
}