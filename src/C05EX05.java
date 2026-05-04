import java.util.Scanner;

// Juan Grochowski

public class C05EX05  {
    public static void main(String[] args) {
        double celsius, kelvin, fahrenheit;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Temperatura em celcius: ");
        celsius = teclado.nextDouble();

        kelvin = celsius + 273;
        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("celcius = "+ celsius);
        System.out.println("kelvin = "+ kelvin);
        System.out.println("fahrenheit = "+ fahrenheit);

        teclado.close();
    }
}