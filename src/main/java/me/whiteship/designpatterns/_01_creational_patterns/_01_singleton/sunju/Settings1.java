package me.whiteship.designpatterns._01_creational_patterns._01_singleton.sunju;

/*
보통 웹서비스를 만들면 멀티스레드로 동작한다.
멀티스레드에서 안전하지 않은 방법.
이유는, 스레드 1번이 객체를 생성하기 전에 2번이 if문을 통과하면 아직 instance가 null인 경우 발생
이 때, new Settings1();을 같이 실행시킬 수 있음
그러면 두개의 스레드가 다른 instance를 가지게 됨
 */
public class Settings1 {
    private static Settings1 instance;
    private Settings1() {}

    public static Settings1 getInstance() {
        if(instance == null) { //매번 new를 사용할 경우 객체가 매번 새로 생성되기때문에 Singleton이라 볼 수 없으므로 추가된 코드
            instance = new Settings1();
        }

        return instance;
    }
}
