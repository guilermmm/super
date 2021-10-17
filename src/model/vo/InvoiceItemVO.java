package model.vo;

public class InvoiceItemVO {
    private ItemVO item;
    private int quantity;

    public ItemVO getItem() {
        return this.item;
    }

    public void setItem(ItemVO item) {
        if (item != null) {
            this.item = item;
        }
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("A quantidade não pode ser menor que zero");
        } else {
            this.quantity = quantity;
        }
    }
}