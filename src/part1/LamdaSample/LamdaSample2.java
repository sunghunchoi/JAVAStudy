package part1.LamdaSample;

public class LamdaSample2 {
    public static void main(String[] args) {
        // 처리를 람다식으로 구현한다(인수의 형 지정을 생략한다.)
        InterfaceSample1 lamda = (name) -> {
            return name + "입니다.";
        };

        // 구현한 처리를 실행.
        System.out.println(lamda.sampleMethod("TEST"));
    }
}
