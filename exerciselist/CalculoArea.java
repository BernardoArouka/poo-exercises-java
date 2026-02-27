package exerciselist;
import java.util.Scanner;
public class CalculoArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Quadrado");
            System.out.println("2. Círculo");
            System.out.println("3. Retângulo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = scanner.nextDouble();
                    Quadrado quadrado = new Quadrado(lado);
                    System.out.println("Área: " + quadrado.area());
                    System.out.println("Comprimento (perímetro): " + quadrado.comprimento());
                    break;
                case 2:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    System.out.println("Área: " + circulo.area());
                    System.out.println("Comprimento (circunferência): " + circulo.comprimento());
                    break;
                case 3:
                    System.out.print("Digite a base do retângulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double altura = scanner.nextDouble();
                    Retangulo retangulo = new Retangulo(base, altura);
                    System.out.println("Área: " + retangulo.area());
                    System.out.println("Comprimento (perímetro): " + retangulo.comprimento());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }
}