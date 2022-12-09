package me.whiteship.designpatterns._01_creational_patterns._01_singleton.sunju;

/**
 * Enum을 사용해서 싱글톤 만들기
 * 장점은 reflection에 안전함
 * 직렬화 역직렬화에 안전하다. (enum은 기본적으로 Serializable을 구현하고 있다.)
 * 보기 - 바이트코드 표시에 보면 java/lang/enum을 상속했고, 이는 Serializable을 구현함을 확인 가능하다.
 * 단점은 class를 만드는 순간 이미 만들어진자. (미리 만들어진다.) - lazy loading 불가능
 * 그리고 상속을 쓰지 못한다. (보통 enum만 상속받을 수 있다.)
 */
public enum Settings4 {

    INSTANCE;

}
