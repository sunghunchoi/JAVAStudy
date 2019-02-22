package part1.LamdaSample;

public class AnonymousSample {

    public static void main(String[] args) {

        InterfaceSample anonymous = new InterfaceSample() {
            @Override
            public void sampleMethod(String name) {
                System.out.println(name + "입니다.");
            }
        };
        anonymous.sampleMethod("test");
    }
}
