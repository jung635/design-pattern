package me.whiteship.designpatterns._01_creational_patterns._01_singleton.sunju.quiz;

public class SettingsQuiz {

    private SettingsQuiz() {}

    public static class Holder {
        public static final SettingsQuiz INSTANCE = new SettingsQuiz();
    }

    public SettingsQuiz getInstatnce() {
        return Holder.INSTANCE;
    }
}
