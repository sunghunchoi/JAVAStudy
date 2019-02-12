package RelationOperator;

import java.io.Serializable;

/**
 * 비교 연산 예제(instanceof 연산자)
 */
public class RelationOperator3 {
    /**
     * 비교 연산 예제(instanceof 연산자)
     *
     * @param args
     */
    public static void main(String[] args) {
        // [1] 자료형 비교
        String value = "가나다라마";
        boolean result = value instanceof String;
        System.out.println("[1] \"가나다라마\" instanceof String -> result = " + result);

        // [2] 상속한 클래스와 자료형 비교
        result = value instanceof Object;
        System.out.println("[2] \"가나다라마\" instanceof Object -> result = " + result);

        // [3] 인터페이스와 자료형 비교
        result = value instanceof Serializable;
        System.out.println("[3] \"가나다라마\" instanceof Serializable -> result = " + result);

        // [4] 일치하지 않는 자료형과 비교
        Object object = "가나다라마";
        result = object instanceof Integer;
        System.out.println("[4] \"가나다라마\" instanceof Integer -> result = " + result);

    }
}
