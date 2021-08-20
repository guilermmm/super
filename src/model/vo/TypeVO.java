package model.vo;

public class TypeVO {

    private int id;
    private int typeCode;
    private String name;
    private SellingForm sellingForm;

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

    public int getTypeCode() {
        return this.typeCode;
    }

    public void setTypeCode(int typeCode) {
        if (typeCode < 0) {
            System.out.println("A quantidade não pode ser menor que zero");
        } else {
            this.typeCode = typeCode;
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

    public SellingForm getSellingForm() {
        return this.sellingForm;
    }

    public void setSellingForm(SellingForm sellingForm) {
        this.sellingForm = sellingForm;
    }

}