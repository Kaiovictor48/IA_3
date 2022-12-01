import java.util.Scanner;

public class Main extends MinhaInterface{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MinhaInterface Menu = new MinhaInterface();
        Menu.menu();
        System.out.print("Digite o(s) filme(s) que deseja assistir: ");
        Menu.setMenu(input.nextInt());

        Menu.resumoFilme();

        MinhaInterface Sessao = new MinhaInterface();
        Sessao.sessao();

        System.out.print("\nEscolha a sessão: ");
        Menu.setSessaoEscolhida(input.nextInt());

        Menu.bilheteria();
        Menu.comprovante();
        }
}



