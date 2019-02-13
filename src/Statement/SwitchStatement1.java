package Statement;

/**
 * switch 문 예제를 작성.
 */
public class SwitchStatement1 {
    /**
     * switch 문을 실생 하고 결과를 확인.
     *
     * @param args
     */
    public static void main(String[] args) {
        int value = Integer.valueOf(args[0]);

        switch (value){
            case 0 :
                System.out.println("[1] value 는 0");
                break;
            case 1 :
                System.out.println("[1] value 는 1");
                break;
            default:
                System.out.println("[1] value는 0도 1도 아니다.");
        }
    }
}
