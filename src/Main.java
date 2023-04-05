import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        Scanner s4 = new Scanner(System.in);

            System.out.println("quais notas voce deseja calcular ?");
        double d1 = s.nextDouble();
        double d2 = s2.nextDouble();
        double d3 = s3.nextDouble();
        double d4 = s4.nextDouble();


        double v1 = +d1 + d2 + d3 + d4;
        int i = 4;
        double v = v1/i;


        if (v >= 7){
        System.out.println("Aprovado");}
        else if (v >=5)
        {System.out.println("Recuperação");}
        else {
            boolean b = v <= 4;
            System.out.println("Reprovado");}
    }
}









