import java.util.Scanner;


public class conversaoVelocidade {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        double KM;
        double Milha;

        System.out.print("KM = ");
        KM = sc.nextDouble();

        Milha = (KM / 1.6);

        System.out.println("Milha = "+Milha);


    }
}
