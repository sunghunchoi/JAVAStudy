package part2.Detail;

import java.math.BigDecimal;

public class PrintReceipt1 {

    public static void main(String[] args) {

        // 구매 내역 데이터 작성
        Detail detail = new Detail();
        detail.setItemName("お米5kg");
        detail.setAmount(new BigDecimal(1500));

        // 구매 내역 데이터 가공
        StringBuilder sb = new StringBuilder();
        sb.append(detail.getItemName());
        sb.append("        ");
        sb.append(detail.getAmount());
        sb.append("円");

        // 구매 내역 출력
        System.out.println(sb.toString());

    }

}
