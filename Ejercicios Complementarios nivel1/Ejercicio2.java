import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int n1, n2, sum, res, div, multi, mod;
        System.out.println("Ingrese primer numero");
        Scanner s1 = new Scanner(System.in);
        n1 = s1.nextInt();
        System.out.println("Ingrese segundo numero");
        Scanner s2 = new Scanner(System.in);
        n2 = s2.nextInt();
        s1.close();
        s2.close();
        sum = n1 + n2;
        res = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;
        mod = n1 % n2;

        System.out.println("La suma de los numeros es igual a " + sum);
        System.out.println("La resta de los numeros es igual a " + res);
        System.out.println("La multiplicacion de los numeros es igual a " + multi);
        System.out.println("La division de los numeros es igual a " + div);
        System.out.println("El modulo es igual a " + mod);
    }
}