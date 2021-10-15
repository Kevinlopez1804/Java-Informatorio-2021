import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int cont = 0, n1;
        System.out.println("Ingrese Numero");
        Scanner s1 = new Scanner(System.in);
        n1 = s1.nextInt();
        for (int i = 0; i < n1; i++) {

            System.out.print("\n");

            cont++;

            for (int j = 1; j < cont + 1; j++) {

                System.out.print(j);
            }
        }
    }
}