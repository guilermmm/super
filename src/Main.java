import model.vo.*;

class Main {
    public static void main(String[] args) {

        ItemsVO paozinho = new ItemsVO();
        paozinho.setName("paozinho");
        paozinho.setBrand("bauducco");
        paozinho.setQuantStock(35);

        System.out.println(paozinho);

        UserVO gerente = new UserVO();
        gerente.setCpf("712.018.454-75");
        gerente.setId(1);
        gerente.setName("guilerm");
        gerente.setPermission(Permission.adm);

        System.out.println(gerente);

    }
}
