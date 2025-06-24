package secao11.exercicios;

public class ProdutoEletronico {
    
    private String nome;
    private double preco;
    private int garantia;

    public ProdutoEletronico(String nome, double preco, int garantia) {
        this.nome = nome;
        this.preco= preco;
        this.garantia = garantia;
    }

    public void aplicarDesconto(double porcentagem) {

        if (porcentagem > 0 && porcentagem <= 100) {
            
            double valorDesconto = calcularDesconto(porcentagem);

            preco -= valorDesconto;

            System.out.println("O valor com desconto é de: " + preco + "R$");
        } else {
            System.out.println("Desconto inválido");
        }
    }


    public double calcularDesconto(double porcentagem) {
        return (preco * porcentagem) / 100;
    }

    public void exibirInfo() {
        System.out.println("O produto: " + nome + ", está com o preço de: " + preco + "R$, e garintia de: " + garantia + " meses"); 
    }

    


}
