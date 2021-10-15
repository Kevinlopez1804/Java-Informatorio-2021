import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Ingrese su nombre");
        Scanner sc = new Scanner(System.in);
        System.out.println("HOLA " + sc.nextLine());
        sc.close();
    }
}