import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int n1, fac = 0, acum = 1;
        System.out.println("Ingrese Nro");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        for (int i = 1; i < n1 + 1; i++) {
            acum = acum * i;
        }

        fac = fac + acum;
        System.out.print(fac);
        System.out.print("\n");

    }
}