|//importação das classes para entrada de dados do teclado
//e geração de números aleatórios
import java.util.Scanner;
import java.util.Random;

public class MegaSena{


    public static void main(String[] args){

        //declaração dos vetores para armazenar
        //as apostas e sorteio
        int[] apostas = new int[6];
        int[] sorteio = new int[6];

        //criação do objeto para leitura dos dados do teclado
        Scanner scan = new Scanner(System.in);

        //criação do objeto para geração de números aleatórios
        Random rand = new Random();

        //declaração das variáveis de controle
        int num=0;
        int cont=0;
        boolean flag;
        int acertos=0;

        //rotina para leitura dos dados do usuário
        while(cont<6){

            System.out.println("Digite um número entre 1 e 60:");
            num = scan.nextInt();

            if(num >=1 && num <=60){
                flag = false;

                for(int j=0;j<6 && !flag;j++){
                    if(num == apostas[j]){
                        System.out.println("Número repetido...Digite outro!!!");
                        flag = true;
                    }
                }

                if(!flag){
                    apostas[cont]=num;
                    cont++;
                }
            }else{
                System.out.println("Número inválido...Digite outro!!!");
            }
        }

        //rotina para sorteio dos números
        cont=0;
        while(cont<6){

            num = rand.nextInt(60)+1;
            flag = false;

            for(int j=0;j<6 && !flag;j++){
                if(num == sorteio[j]){
                    System.out.println("Número repetido...Digite outro!!!");
                    flag = true;
                }
            }

            if(!flag){
                sorteio[cont]=num;
                cont++;
            }
        }

        //mostrando os números lidos e sorteados
        for(int i=0;i<6;i++){
            System.out.print(apostas[i]+",");
        }
        System.out.println();
        for(int i=0;i<6;i++){
            System.out.print(sorteio[i]+",");
        }
        //rotina para contar o número de acertos
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(apostas[i]==sorteio[j]){
                    acertos++;
                }
            }
        }

        //verificamos o número de acertos e mostramos o resultado
        switch(acertos){
            case 4: 
                System.out.println("Fez a quadra...");
            break;
            case 5:
                System.out.println("Fez a quina...");
            break;
            case 6:
                System.out.println("Ficou milhonariooooo....");
            break;
            default:
                System.out.println("Vai ter que continuar estudando...");
            break;
        }


    }

}