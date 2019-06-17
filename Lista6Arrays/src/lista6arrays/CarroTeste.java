
import java.util.Scanner;

public class CarroTeste {

    public static void main(String[] args) {

        Scanner sc = new Scanner;

        System.out.println("Digite o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();

        System.out.println("Digite os preços; ");
        double[] preco = new double[s];
        for (int c = 0; c < preco.length; c++) {
            System.out.println(" Digite o " + (c + 1) + "º preço: ");
            preco[c] = sc.nextDouble();
        }
        
        Carro ca = new Carro (modelo, preco, ano);
        
        System.out.println("Media de preços; " + ca.getMedia());
        System.out.println("Maior Preço: " + ca.getMaior());
        System.out.println("Menor Preço: " + ca.getMenor());
                 
        
        
    }
    


}
