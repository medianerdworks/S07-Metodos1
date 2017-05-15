package metodosSinRetorno;

import java.util.Scanner;

public class MetodosSinRetornoSinParametros {
    void iniciar() {
        //sumar();
        restar();
    }

    void sumar() {
        int a=3, b=6;
        int resultado = a+b;
        System.out.println("la suma es: "+resultado);
    }

    private void restar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor 1:");
        int valor1 = sc.nextInt();
        System.out.print("Ingresa el valor 2:");
        int valor2 = sc.nextInt();
        System.out.println("la resta es "+(valor1-valor2));
    }
    
    
            
}
