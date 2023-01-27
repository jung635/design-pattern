package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.sunju;

public interface ShipFactory {
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    Ship createShip();

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    // java8의 경우 default는 가능하지만 private은 둘 수 없다.
    // 따라서 추상메서드로 정의하고, 그 안에서 구현체를 작성한다.
   void sendEmailTo(String email, Ship ship);
}
