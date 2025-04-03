package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HobbysPage {
    private final SelenideElement hobbyEventsButton = $x("//a[contains(@href, '/hobby/events')]");
    private final SelenideElement hobbyTutorialsButton = $x("//a[contains(@href, '/hobby/tutorials')]");
    private final SelenideElement hobbyQuestionsButton = $x("//a[contains(@href, '/hobby/questions')]");


    public HobbysPage checkHobbyEvents(){
        hobbyEventsButton.shouldBe(visible.because("На странице с увлечениями должна быть кнопка Мероприятия"))
                .shouldHave(text("Мероприятия"));
        return this;
    }

    public HobbysPage checkHobbyTutorials(){
        hobbyTutorialsButton.shouldBe(visible.because("На странице с увлечениями должна быть кнопка Мастер-классы"))
                .shouldHave(text("Мастер-классы"));
        return this;
    }

    public HobbysPage checkHobbyQuestions(){
        hobbyQuestionsButton.shouldBe(visible.because("На странице с увлечениями должна быть кнопка Вопросы и ответы"))
                .shouldHave(text("Вопросы и ответы"));
        return this;
    }
}