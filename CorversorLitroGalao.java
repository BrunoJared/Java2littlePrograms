import java.util.Scanner;

public class CorversorLitroGalao {



    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int galão;


        System.out.print("Insira quantidade de galões = ");
        galão = sc.nextInt();
        double litros = (galão*3.7854);

        System.out.println(galão+ " galões = "+litros+ " litros");


    }
}
