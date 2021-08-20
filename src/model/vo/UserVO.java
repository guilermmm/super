package model.vo;

public class UserVO {

    private int id;
    private String name;
    private String cpf;
    private Permission permission;

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

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null) {
            System.out.println("ta errado");
        } else if (cpf.matches("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$")) {
            this.cpf = cpf;
        } else {
            System.out.println("ta errado dnv");
        }
    }

    public Permission getPermission() {
        return this.permission;
    }

    public void setPermission(Permission permission) {
        if (permission != null) {
            this.permission = permission;
        }
    }

    public String toString() {
        return "Id: " + getId() + "\nName: " + getName() + "\nCPF: " + getCpf() + "\nPermission: " + getPermission();
    }

}