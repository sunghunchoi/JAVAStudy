package part1.LamdaSample;

public class LamdaSample1 {
    public static void main(String[] args) {
        // 처리를 람다식으로 구현(인수형 지정을 생략한다.)
        InterfaceSample1 lamda = (String name)->{
            return name + "입니다.";
        };

        System.out.println(lamda.sampleMethod("TEST"));
    }
}
