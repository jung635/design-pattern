package me.whiteship.designpatterns._01_creational_patterns._01_singleton.sunju;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings1 settings1 = Settings1.getInstance();
        Settings1 settings1_2 = Settings1.getInstance();
        System.out.println(settings1 == settings1_2); //true

        //싱글톤 패턴 깨뜨리기
        // 1. 리플렉션 사용
        Constructor<Settings1> constructor = Settings1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings1 settings1_3 = constructor.newInstance();
        System.out.println(settings1 == settings1_3); //false
        
        // 2. 직렬화&역직렬화 사용
        // Serializable을 구현한 것은 직렬화 & 역직렬화에 사용 할 수 있고, 그말인 즉슨, 객체를 파일로 저장했다가 다시 로딩할 수 있다는 말
        Settings3_1 settings3_1 = Settings3_1.getInstance();
        Settings3_1 settings3_1_2 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            settings3_1_2 = Settings3_1.getInstance();
            System.out.println(settings3_1 == settings3_1_2); //true
            out.writeObject(settings3_1);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings3_1_2 = (Settings3_1) in.readObject();
            System.out.println(settings3_1 == settings3_1_2); //false => readResolve를 사용하여 방어하면 true
        }

        //reflection에도 안전한 구현 (enum 사용)
        Settings4 settings4 = Settings4.INSTANCE;
        Settings4 settings4_1 = null;
        Constructor<?>[] declaredConstructors = Settings4.class.getDeclaredConstructors();
        for (Constructor<?> constructor4 : declaredConstructors) {
            constructor4.setAccessible(true);
            //settings4_1 = (Settings4) constructor4.newInstance("INSTANCE");
            //exception 발생
            //Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
            //enum은 리플렉션 할 수 없게 막았다.
        }
        System.out.println(settings4 == settings4_1); //false

        //Serializable을 구현했기때문에 안전 (enum 사용)
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings4);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings4_1 = (Settings4) in.readObject();
            System.out.println(settings4 == settings4_1); //true
        }
    }


}
