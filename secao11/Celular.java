package secao11;

public class Celular {
    
    String marca;
    String modelo;
    int bateria = 100;
    
    public void ligar() {
        System.out.println("O celular " + modelo + " está ligado");
    }

    public void desligar() {
        System.out.println("O celular " + modelo + " está desligado");
    }

    public void usar(int consumo) {
        if (bateria - consumo >= 0) {
            bateria -= consumo;
            System.out.println("A bateria está em " + bateria +"%");
        } else {
            System.out.println("Bateria está zerada");
        }
    }
}
