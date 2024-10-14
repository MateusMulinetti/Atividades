import java.util.Scanner;
import objetos.Produto;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Produto> produtos = new ArrayList<>();
    public static void main(String[] args){menu();} {

    }
    static void cadastro(){

        System.out.println("digite o nome do produto:");
        String nome = scanner.next();
        System.out.println("digite o preco do produto");
        double preco = scanner.nextDouble();
        System.out.println("digite o quantidade do produto");
        int quantidade = scanner.nextInt();


        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
    }
    static void exibir(){
        System.out.println("--- Lista de produtos ---");
        for(Produto produto : produtos){
            System.out.println(produto);
        }
        System.out.println("-----------------------");
    }
    static void menu() {
        int opcao = 0;
        while (opcao!= 3) {
            System.out.println("Digite 1 para cadrastrar um produto:");
            System.out.println("Digite 2 para exibir a lista de produtos:");
            System.out.println("Digite 3 para sair do programa:");
            opcao = scanner.nextInt();
            if (opcao>3) {
                System.out.println("Opção invalida!!");
            } else {
                switch (opcao) {
                    case 1:
                        cadastro();
                        break;
                    case 2:
                        exibir();
                        break;
                }

            }
        }
        System.out.println("SAINDO....");
    }
}