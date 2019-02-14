package ExtendsSample;

public class DriveEmployee {

    // 상속금지
    // 부모 클래스나 메서드에 final키워드가 붙으면 상속을 못함
    // 메서드또한 Overriding을 못함.

    public static void main(String[] args) {
        // 사원 클래스의 인스턴스 생성
        Employee emp = new Employee("test");
        // 아르바이트 클래스의 인스턴스 생성
        PartTime part = new PartTime("test");

        // 직위설정
        emp.setPosition("일반사원");
        part.setPosition("아르바이트");

        // 일하기
        emp.work();
        part.work();
        part.empWork();
    }
}
