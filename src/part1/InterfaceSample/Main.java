package part1.InterfaceSample;

public class Main {

    public static void main(String[] args) {
        Employee employee1;
        Employee employee2;

        employee1 = new Manager();
        employee2 = new PartTime();

        employee1.echo();
        employee2.echo();


    }


}
