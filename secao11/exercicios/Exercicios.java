package secao11.exercicios;

public class Exercicios {
    public static void main(String[] args) {
        
        // Exercicio 1
        Celular iphone = new Celular();

        iphone.marca = "Apple";
        iphone.modelo = "Iphone 15";

        iphone.ligar();
        iphone.desligar();
        iphone.usar(10);
    }
}