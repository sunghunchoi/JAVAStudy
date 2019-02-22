package part2.Detail;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PrintReceipt3 {

    public static void main(String[] args) {
        // 구매 내역 데이터 작성
        Detail detail1 = new Detail();
        detail1.setItemName("お米5kg");
        detail1.setAmount(new BigDecimal(1500));
        Detail detail2 = new Detail();
        detail2.setItemName("かき9個");
        detail2.setAmount(new BigDecimal(900));

        List<Detail> detailList = new ArrayList<>();
        detailList.add(detail1);
        detailList.add(detail2);

        // 구매 내역 문자열 서식 정의
        String lineBase = "%-10s%10s円";

        // 금액 표시용 서식 정의
        DecimalFormat format = new DecimalFormat("###,##0");

        // 금액 표시용으로 가공
        String disAmount1 = format.format(detail1.getAmount().longValue());
        String disAmount2 = format.format(detail2.getAmount().longValue());

        // 변환한 금액을 표시하도록 수정
        String result1 = String.format(lineBase,detail1.getItemName(),disAmount1);
        String result2 = String.format(lineBase,detail2.getItemName(),disAmount2);

        // 구매 내역 출력
        System.out.println(result1);
        System.out.println(result2);
    }
}
