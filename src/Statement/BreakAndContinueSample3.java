package Statement;
/**
 * break 문과 continue 문 예제를 실행
 */
public class BreakAndContinueSample3 {

    /**
     * break 문과 continue 문을 실행하고 내용을 확인.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("----- [1] 레이블이 지정된 루프에서 break -----");
        label : for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(j == 1){
                    System.out.println("j == 1 일 때 label에 대해 break");
                    break label;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println("----- [2] 레이블이 지정된 루프에서 continue -----");
        label : for(int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    System.out.println("j == 1 일 때 label에 대해 continue");
                    continue label;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
