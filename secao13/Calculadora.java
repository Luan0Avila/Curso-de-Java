package secao13;

interface Calculadora {
    
    int somar(int a, int b);

    default int multi(int a, int b) {
        return a * b;
    }
}
