package ArithmeticOperator;

/*
    산술 연산자를 확인하는 클래스.
 */
public class ArithmeticOperator1 {
    /**
     * 산술 연산자를 실행해 내용을 확인.
     *
     * @param args
     *              명령줄 인수.
     */
    public static void main(String[] args) {
        // [1] 특수한 계산
        int result = 1;
        result += 2;
        System.out.println("[1] result = 1 -> result += 2 -> result = " + result);

        // [2] 특수한 계산
        System.out.println("[2] result = 1 -> ++result");
        result = 1;
        printValue(++result);
        System.out.println("result = " + result);

        // [3] 특수한 계산
        System.out.println("[3] result = 1 - > result++");
        result = 1;
        printValue(result++);
        System.out.println("result = " + result);
    }

    /**
     * 전달된 값 value를 화면에 출력.
     *
     * @param value 값
     */
    private static void printValue(int value){
        System.out.println("전달된 값 : value = " + value);
    }



}
