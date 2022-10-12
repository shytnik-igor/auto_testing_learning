package page.main

import com.codeborne.selenide.Selenide

class MainPage {

    fun open() {
        Selenide.open("https://www.21vek.by/")
    }

    fun openAuthDialog() {
        // TODO реализовать метод открытия диалога авторизации
    }
}