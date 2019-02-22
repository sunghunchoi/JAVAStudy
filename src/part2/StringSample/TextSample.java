package part2.StringSample;

public class TextSample {
    public static void main(String[] args) {

        // よくないやりかた。Stringを＋するとメモリ上新しいStringインスタンスが生成されてしまうので
        // Stringの結合とかはStringBuilderを利用しましょう！
        // String text1 = "정말";
        // String text2 = "감사합니다.";
        // text1 = text1 + text2;
        // System.out.println(text1);

        // StringBuilder
        // ＋演算子を利用するとStringをつなげるたんびにStringインスタンスが生成されてしまう。
        String text1 = "정말";
        String text2 = "감사합니다.";

        StringBuilder sb = new StringBuilder();
        sb.append(text1);
        sb.append(text2);
        String resultString = sb.toString();
        System.out.println(resultString);


    }
}
