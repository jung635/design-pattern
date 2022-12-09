package me.whiteship.designpatterns._01_creational_patterns._01_singleton.sunju;

import java.io.Serializable;

/*
싱글톤 패턴 깨뜨리기
직렬화 & 역직렬화
 */
public class Settings3_1 implements Serializable {
    private Settings3_1() {}

    private static class SettingsHolder {
        private static final Settings3_1 INSTANCE = new Settings3_1();
    }

    public static Settings3_1 getInstance() {
        return Settings3_1.SettingsHolder.INSTANCE;
    }

    //역직렬화 대응 방안
    //이 시그니쳐를 가지고 있으면 역직렬화 할 때 반드시 사용하게 됨
    //원래는 new Settings3_1();을 하게되지만 getInstance()를 하도록 함
    protected Object readResolve() {
        return getInstance();
    }
}
