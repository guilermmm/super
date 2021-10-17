package model.vo;

public class ItemVO {
    private int id;
    private String name;
    private String brand;
    private String barCode;
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
        if (name == null || name.isEmpty()) {
            System.out.println("ta errado");
        } else {
            this.name = name;
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            System.out.println("ta errado");
        } else {
            this.brand = brand;
        }

    }

    public String getBarCode() {
        return this.barCode;
    }

    public void setBarCode(String barCode) {

        if (barCode != null && barCode.matches("^\\d{13}$")) {
            this.barCode = barCode;
        } else {
            System.out.println("ta errado");
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

    public String toString() {
        return "\nId: " + getId() + "\nName: " + getName() + "\nBrand: " + getBrand() + "\nBar Code: " + getBarCode()
                + "\nQuantity in Stock: " + getQuantStock() + "\nPrice: " + getPrice() + "\nType: "
                + getType().getName();
    }
}
