package me.whiteship.designpatterns._01_creational_patterns._01_singleton.sunju;

/*
double checked locking 사용 : if check를 하고 synchronized에서 한번 더 한다고 double checked locking이라 불림
2번 스레드가 1번스레가 끝날때 까지 기다려야함. 따라서 if문을 같이 통과했다 하더라도 객체가 다르게 생성되는 문제 해결 가능
장점: getInstance 메서드가 동작할때마다 synchronized가 되지 않으므로 좀 더 효율적
instance를 필요할 때만 생성가능
 */
public class Settings2_3 {
    //volatile: 이것까지 써줘야 java 5이상에서 동작하는 double checked locking 기법이 완성됨
    //따라서 5이상만 동작
    private static volatile Settings2_3 instance;
    private Settings2_3() {}

    public static Settings2_3 getInstance() {
        if(instance == null) {
            synchronized (Settings2_3.class) {
                if(instance == null) {
                    instance = new Settings2_3();
                }
            }
        }
        return instance;
    }
}
