package LamdaSample;

/**
 * 일반적으로 인터페이스를 구현하려면 클래스로 만들고, 메서드를 정의하고, 인스턴스로 만드는 과정이 필요.
 * 람다식을 도입하면 이런 복잡한 과정을 간결하게 해결 가능.
 *
 */
public class LamdaSample {
    /**
     *  Lamda Test
     *
     * @param args
     */
    public static void main(String[] args) {
        // 처리를 람다식으로 구현
        InterfaceSample lamda = (String name) -> {
            System.out.println(name + "입니다.");
        };

        lamda.sampleMethod("승훈");
    }

}
