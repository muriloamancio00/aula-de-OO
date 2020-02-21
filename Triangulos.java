import java.util.Scanner;
public class Triangulos{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int LadoA ;
        int LadoB ;
        int LadoC ;
        System.out.println("Digite a primeira medida do Triangulo");
        LadoA = scan.nextInt();
        System.out.println("Digite a segunda medida do Triangulo");
        LadoB = scan.nextInt();
        System.out.println("Digite a terceira medida do Triangulo");
        LadoC = scan.nextInt();
        if ((LadoA == LadoB && LadoB != LadoC) || (LadoB == LadoC && LadoC != LadoA) || (LadoC == LadoA && LadoA != LadoB)){
            System.out.println("triangulo isoceles");
        }
        else if (LadoA != LadoB && LadoA != LadoC && LadoB != LadoC){
            System.out.println("triangulo escaleno");
        }
        else {
            System.out.println("triangulo equilatero");
        }
    }
}