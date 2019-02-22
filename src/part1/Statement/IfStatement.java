package part1.Statement;

/**
 * if 문 예제를 실행.
 *
 */
public class IfStatement {
    /**
     * if 문 예제를 실행
     *
     * @param args
     */
    public static void main(String[] args) {
        int value = Integer.valueOf(args[0]);

        // [1] if 문
        if(value == 0){
            System.out.println("[1] Value 는 0");
        }else if(value ==1){
            System.out.println("[1] Value 는 1");
        }else{
            System.out.println("[1] Value 는 0도 1도 아니다.");
        }
    }
}
