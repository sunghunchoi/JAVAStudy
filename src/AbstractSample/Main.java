package AbstractSample;

public class Main {

    public static void main(String[] args) {

        Employee employee1;
        Employee employee2;

        // Manager
        employee1 = new Manager();
        // PartTime
        employee2 = new PartTime();

        employee1.echo();
        employee2.echo();
    }
}
