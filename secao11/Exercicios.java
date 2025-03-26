package secao11;

public class Exercicios {
    public static void main(String[] args) {
        
        //Exercicio 1
        Celular iphone = new Celular();

        iphone.marca = "Apple";
        iphone.modelo = "Iphone";

        iphone.ligar();

        iphone.desligar();

        iphone.usar(10);

        Celular s10 = new Celular();

        s10.marca = "Samsung";
        s10.modelo = "S10";
        
        s10.ligar();
        s10.desligar();
        s10.usar(40);

        //Exercicio 2
        Aluno aluno = new Aluno("Luan", 123, 10);



    }
}
