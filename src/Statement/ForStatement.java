package Statement;

/**
 * for 문 예제
 */
public class ForStatement {
    /**
     * for 문을 실행하고 내용을 확인.
     *
     * @param args
     */
    public static void main(String[] args) {

        // [1] for 문
        System.out.println("----- 카운터를 이용한 예제 -----");
        String stringValue = "가나다라마";
        for(int i=0; i<stringValue.length(); i++){
            System.out.println("[1] " + stringValue.charAt(i));
        }

        System.out.println("----- 배열을 이용한 예제 -----");
        char[] chars = stringValue.toCharArray();
        for(char charValue : chars){
            System.out.println("[2] " + charValue);
        }



    }

}
