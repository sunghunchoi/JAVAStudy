package GenericSample;

public class Main {

    public static void main(String[] args) {

        // 제네릭을 사용한 클래스의 인스턴스 생성
        GenericSample<String> generic = new GenericSample<String>();

        // Setter
        generic.setObject("hi");

        // 게터 실행
        System.out.println(generic.getObject());

        GenericSample<Integer> generic2 = new GenericSample<Integer>();
        generic2.setObject(1);
        System.out.println(generic2.getObject());

    }
}
