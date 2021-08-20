package model.vo;

public class InvoiceItemsVO {
    private ItemsVO item;
    private int quantity;


    public ItemsVO getItem() {
        return this.item;
    }

    public void setItem(ItemsVO item) {
        this.item = item;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("A quantidade não pode ser menor que zero");
        } else{
            this.quantity = quantity;
        }
        
    }

}
