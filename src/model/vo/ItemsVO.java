package model.vo;

public class ItemsVO {
    private int id;
    private String name;
    private String brand;
    private int barCode;
    private int quantStock;
    private int price;
    private TypeVO type;

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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
        }

    }

    public int getBarCode() {
        return this.barCode;
    }

    public void setBarCode(int barCode) {
        if (barCode < 0) {
            System.out.println("A quantidade não pode ser menor que zero");
        } else {
            this.barCode = barCode;
        }
    }

    public int getQuantStock() {
        return this.quantStock;
    }

    public void setQuantStock(int quantStock) {
        if (quantStock < 0) {
            System.out.println("A quantidade não pode ser menor que zero");
        } else {
            this.quantStock = quantStock;
        }
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("A quantidade não pode ser menor que zero");
        } else {
            this.price = price;
        }
    }

    public TypeVO getType() {
        return this.type;
    }

    public void setType(TypeVO type) {
        if (type != null) {
            this.type = type;
        }

    }
}
