package LamdaSample;

public class LamdaSample4 {
    public static void main(String[] args) {
        // 처리를 람다식으로 구현한다(return과 괄호를 생략한다.)
        InterfaceSample1 lamda = name -> name+"입니다.";

        // 구현한 처리를 실행한다.
        System.out.println(lamda.sampleMethod("TEST"));

        // 보통의 람다식
        InterfaceSample1 lamda2 = (String name) -> {
            return name + "입니다.";
        };

        // 생략 기법을 적용한 람다식
        InterfaceSample1 lamda3 = name -> name + "입니다.";
        System.out.println(lamda3.sampleMethod("TSET"));

    }
}
