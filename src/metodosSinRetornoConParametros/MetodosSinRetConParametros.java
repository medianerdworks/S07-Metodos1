package metodosSinRetornoConParametros;

class MetodosSinRetConParametros {
void iniciar() {
    double a=3,b=5;
    sumar(a,b);
    int valor1=7,valor2=7;
    restar(valor1,valor2);
}

    private void sumar(double a, double b) {
        double resultado=a+b;
        System.out.println("La suma es: "+resultado);
    }

    private void restar(int valor1, int valor2) {
        int resultado=valor1-valor2;
        System.out.println("La resta es: "+resultado); 
    }
    
}
