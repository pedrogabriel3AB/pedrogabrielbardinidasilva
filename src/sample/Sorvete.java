package sample;

public class Sorvete {
    private String nome;
    private String sabor;
    private double preco;

    public Sorvete(){ }


    public Sorvete(String nome, String sabor, double preco){
        this.nome = nome;
        this.sabor = sabor;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPreço() {
        return preco;
    }

    public void setPreço(double preço) {
        this.preco = preço;
    }
    @Override
    public String toString(){
        return "sorvete:" + nome
                + " ,sabor: " + sabor
                + " preço: " + preco;
    }
}



