package me.whiteship.designpatterns._01_creational_patterns._01_singleton.sunju;

/*
static inner 클래스 사용하기
멀티스레드 환경에서도 안전하고, getInstance가 샐행될때 SettingsHolder 클래스가 실행되고, 객체도 생성되는 lazyLoading도 가능
클래스, static 로딩에 관한 정보: https://inpa.tistory.com/entry/JAVA-%E2%98%95-%ED%81%B4%EB%9E%98%EC%8A%A4%EB%8A%94-%EC%96%B8%EC%A0%9C-%EB%A9%94%EB%AA%A8%EB%A6%AC%EC%97%90-%EB%A1%9C%EB%94%A9-%EC%B4%88%EA%B8%B0%ED%99%94-%EB%90%98%EB%8A%94%EA%B0%80-%E2%9D%93#thankYou
 */
public class Settings2_4 {
    private Settings2_4() {}

    private static class SettingsHolder {
        private static final Settings2_4 INSTANCE = new Settings2_4();
    }

    public static Settings2_4 getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
