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


        // Exercicio 2
        Aluno luan = new Aluno("Luan",11, 75.0);

        System.out.println(luan.getNome());

        System.out.println(luan.getNotaFinal());

        luan.setNome(("Luan Avila"));

        luan.setNotaFinal(80);

        luan.exibirInfo();
    }
}