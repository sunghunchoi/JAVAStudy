package part1.LamdaSample;

public class LamdaSample3 {
    public static void main(String[] args) {
        // 처리를 람다식으로 구현한다(인수 형의 괄호를 생락한다.)
        InterfaceSample1 lamda = name ->{
            return name + "입니다.";
        };

        // 구현한 처리를 실행한다.
        System.out.println(lamda.sampleMethod("TEST"));
    }
}
