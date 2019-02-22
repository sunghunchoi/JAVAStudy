package part2.Detail;

import java.math.BigDecimal;

public class Detail {

    // 商品名
    private String itemName;

    // 金額
    private BigDecimal amount;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
