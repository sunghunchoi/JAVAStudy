package part1.ArithmeticOperator;

/*
    산술 연산자를 확인하는 클래스.
 */
public class ArithmeticOperator2 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // [1] 괄호 없음
        System.out.println("[1] 1 + 1 = " + 1 + 1);

        // [2] 괄호 있음
        System.out.println("[2] 1 + 1 = " + (1 + 1));

        // [3] 수치가 왼쪽에 있을 때
        System.out.println(1 + 2 + "3");

    }
}
