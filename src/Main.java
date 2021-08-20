import java.util.Scanner;

import model.vo.*;

public class Main {
    static private Scanner scanner = new Scanner(System.in);

    static <T> void print(T str) {
        System.out.println(str);
    }

    static String input(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    static int intInput(String prompt) {
        try {
            return Integer.parseInt(input(prompt));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {

        TypeVO bauducco = new TypeVO();
        bauducco.setId(1);
        bauducco.setName("paozinho");
        bauducco.setSellingForm(SellingForm.unit);
        bauducco.setTypeCode(01);

        ItemVO Items = new ItemVO();
        Items.setId(intInput("ID: "));
        Items.setName(input("Nome: "));
        Items.setBrand(input("Marca: "));
        Items.setPrice(intInput("Preço: "));
        Items.setType(bauducco);
        Items.setBarCode(input("Codigo de Barras: "));
        print(Items);
    }
}