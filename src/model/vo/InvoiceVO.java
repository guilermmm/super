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
        } else {
            this.id = id;
        }
    }

    public InvoiceItemsVO[] getItems() {
        return this.items;
    }

    public void setItems(InvoiceItemsVO[] items) {
        if (items == null) {
            System.out.println("ta errado");
        } else {
            boolean test = true;
            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    System.out.println("ta errado");
                    test = false;
                    break;
                }
            }
            if (test) {
                this.items = items;
            } else {
                System.out.println("tem um errado");
            }
        }

    }

    public int getTotalValue() {
        return this.totalValue;
    }

    public void setTotalValue(int totalValue) {
        if (totalValue < 0) {
            System.out.println("A quantidade não pode ser menor que zero");
        } else {
            this.totalValue = totalValue;
        }
    }

}