package me.whiteship.designpatterns._01_creational_patterns._01_singleton.sunju;

/*
멀티스레드 이슈 해결을 위해 synchronized 키워드 사용
단점은, 동기화 작업때문에 getInstance 할 때마다 성능에 불이익이 발생할 수 있음 (lock을 하기 때문)
 */
public class Settings2 {
    private static Settings2 instance;
    private Settings2() {}

    public static synchronized Settings2 getInstance() {
        if(instance == null) { //매번 new를 사용할 경우 객체가 매번 새로 생성되기때문에 Singleton이라 볼 수 없으므로 추가된 코드
            instance = new Settings2();
        }

        return instance;
    }
}
