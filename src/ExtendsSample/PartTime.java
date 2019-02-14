package ExtendsSample;

public class PartTime extends Employee {

    // 근무 교대 표
    private String shift;

    public PartTime(String name){
        super(name);
        System.out.println("PartTime 생성자");
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    // 자식 클래스에서 부모 클래스의 메서드 정의를 덮어써 다르게 동작하도록 재정의를 함.
    // 그것을 Overriding 이라고 함.
    @Override
    public void work(){
        System.out.println(this.getPosition() + "입니다. 파트타임으로 일을 합니다.");
    }

    public void empWork(){
        super.work();
    }

}
