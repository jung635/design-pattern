package me.whiteship.designpatterns._01_creational_patterns._01_singleton.sunju;

/*
이른 동기화(eager initialization 사용
만약 인스턴스를 만드는 과정이 길고 오래걸리고, 메모리를 많이 잡아먹는데 사용안할 수 있음
 */
public class Settings2_2 {
    private static final Settings2_2 INSTANCE = new Settings2_2();
    private Settings2_2() {}

    public static synchronized Settings2_2 getInstance() {
        return INSTANCE;
    }
}
