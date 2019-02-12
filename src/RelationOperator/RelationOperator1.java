package RelationOperator;

/**
 * 비교 연산 예제
 */
public class RelationOperator1 {

    /**
     * 비교연산 실행
     *
     * @param args
     */
    public static void main(String[] args) {

        // [1] 참조형 데이터를 연산자로 비교한 경우.
        boolean result = new Integer("1") == new Integer("1");
        System.out.println("[1] new Integer(\"1\") == new Integer(\"1\") -> result = " + result );

        // [2] 참조형 데이터를 equals 메서드로 비교한 경우.
        result = new Integer("1").equals(new Integer("1"));
        System.out.println("[2] new Integer(\"1\").equals(new Integer(\"1\")) -> result = " + result);

        // [3] 참조형 데이터를 compareTo 메서드로 비교한 경우
        // 인수로 받은 인스턴스의 값이 같은경우에는 0, 큰 경우에는 양수, 작은 경우에는 음수를 반환한다.
        int resultValue = new Integer("1").compareTo(new Integer("1"));
        System.out.println("[3] new Integer(\"1\").compareTo(new Integer(\"1\")) -> result = " + resultValue);

        resultValue = new Integer("1").compareTo(new Integer("2"));
        System.out.println("[3] new Integer(\"1\").compareTo(new Integer(\"2\")) -> result = " + resultValue);

        resultValue = new Integer("2").compareTo(new Integer("1"));
        System.out.println("[3] new Integer(\"2\").compareTo(new Integer(\"1\")) -> result = " + resultValue);

    }
}
