package model.vo;

public class InvoiceVO {

    private int id;
    private InvoiceItemsVO[] items;
    private int totalValue;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if (id < 0) {
            System.out.println("A quantidade não pode ser menor que zero");
        } else{
            this.id = id;
        }
    }

    public InvoiceItemsVO[] getItems() {
        return this.items;
    }

    public void setItems(InvoiceItemsVO[] items) {
        this.items = items;
    }

    public int getTotalValue() {
        return this.totalValue;
    }

    public void setTotalValue(int totalValue) {
        if (totalValue < 0) {
            System.out.println("A quantidade não pode ser menor que zero");
        } else{
            this.totalValue = totalValue;
        }
    }


}