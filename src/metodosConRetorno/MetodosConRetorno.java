package metodosConRetorno;

public class MetodosConRetorno {

    void iniciar() {
        int resultado = sumar();
        System.out.println("La suma es: "+resultado);
    }

    private int sumar() {
        int a=4,b=5;
        int suma=a+b;
        return suma;
    }
    
}
