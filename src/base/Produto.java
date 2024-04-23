package base;

public class Produto {
    private String nome;
    private double quantidade;
    private double preco;

    public String getNome() {
        return nome;
    }
    public double getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    //setter and getter for preco
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

}
