package ExtendsSample;

public class Employee {

    // 이름
    private String name;
    // 직위
    private String position;

    public Employee(String name){
        this.name = name;
        System.out.println("Employee 생성자");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // 출근 메서드
    public void clockIn(){
        System.out.println(this.name + "출근했습니다.");
    }

    // 퇴근 메서드
    public void clockOut(){
        System.out.println(this.name + "퇴근했습니다.");
    }

    // 근무 메서드
    public void work(){
        System.out.println(this.position + "입니다. 일을 합니다.");
    }
}
