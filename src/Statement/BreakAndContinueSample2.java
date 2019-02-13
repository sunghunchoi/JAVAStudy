package Statement;
/**
 * break 문과 continue 문 예제를 실행하고 내용을 확인.
 */
public class BreakAndContinueSample2 {
    /**
     * break 문과 continue 문 예제를 실행하고 내용을 확인.
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("----- [1] 루프가 중첩된 경우 안쪽 루프에서 break -----");
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(j==1){
                    System.out.println("j == 1 일 때 break");
                    break;
                }
                System.out.println("i = " + i + ", j = " +j);
            }
        }

        System.out.println("----- [2] 루프가 중첩된 경우 안쪽 루프에서 continue -----");
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(j==1){
                    System.out.println("j == 1 일 때 continue");
                    continue;
                }
                System.out.println("i = " + i + ", j = " +j);
            }
        }

        System.out.println("----- [3] 루프가 중첩된 경우 바깥쪽 루프에서 break -----");
        for (int i=0; i<3; i++){
            if(i==1){
                System.out.println("i == 1 일 때 break");
                break;
            }
            for(int j=0; j<3; j++){
                System.out.println("i = " + i + ", j = " +j);
            }
        }

        System.out.println("----- [4] 루프가 중첩된 경우 바깥쪽 루프에서 continue -----");
        for (int i=0; i<3; i++){
            if(i==1){
                System.out.println("i == 1 일 때 continue");
                continue;
            }
            for(int j=0; j<3; j++){
                System.out.println("i = " + i + ", j = " +j);
            }
        }




    }

}
