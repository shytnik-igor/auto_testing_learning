package test.auth

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import page.main.MainPage

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AuthTest {

    @BeforeEach
    fun setUp() {
        val mainPage = MainPage()
        mainPage.open()
        mainPage.openAuthDialog()
    }

    // TODO реализовать тесты
}