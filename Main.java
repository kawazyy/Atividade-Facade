import java.util.Scanner;

public class Main {

public static void main(String[] args) {

System.out.println("Selecione seu combo");
System.out.println("1. Combo Master ou 2. Super Combo");
System.out.print("Sua escolha: ");

Scanner input = new Scanner(System.in);

int opcao = input.nextInt();

if (opcao == 1) {
    Combo combo = Combo.comboMaster();
    System.out.println("Combo escolhido: ");
    combo.exibirItens();
} 
if (opcao == 2) {
    Combo combo = Combo.comboSuper();
    System.out.println("Combo escolhido: ");
    combo.exibirItens();

}
}
}