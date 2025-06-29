package secao11.exercicios;

public class Celular {
    String marca;
    String modelo;
    int bateria = 100;

    void ligar() {
        System.out.println("O celular " + modelo + " está ligado"  );
    }
    
    void desligar() {
        System.out.println("O celular " + modelo + " está desligado"  );
    }

    void usar(int consumo) {
        if (bateria - consumo >= 0) {
            bateria -= consumo;
            System.out.println("O celular foi usado, a bateria está em " + bateria + "%");
        } else {
            System.out.println("A bateria é insuficiente");
        }
    }
}
