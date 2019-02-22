package part1.RelationOperator;
/**
 * 비교 연산 예제(문자열)
 */
public class RelationOperator2 {
    /**
     * 비교 연산 예제(문자열)
     *
     * @param args
     */
    public static void main(String[] args) {

        // [1] 문자열을 == 연산자로 비교한 경우
        boolean result = "가나다라마" == "가나다라마";
        System.out.println("[1] 가나다라마\" == \"가나다라마 -> result = " + result);

        // [2] String의 생성자로 만든 인스턴스를 == 연산자로 비교한 경우
        result = new String("가나다라마") == new String("가나다라마");
        System.out.println("[2] new String(\"가나다라마\") == new String(\"가나다라마\") -> result = " + result);
    }
}
