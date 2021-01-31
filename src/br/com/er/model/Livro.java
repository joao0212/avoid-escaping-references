package br.com.er.model;

public class Livro implements br.com.er.interfaces.ILivro {

    public Livro(Long id, String nome, String autor, Double preco) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        if(preco > 100) { this.preco = preco + 10; } this.preco = preco;
    }

    private final Long id;
    private final String nome;
    private final String autor;
    private Double preco;

    @Override
    public String getAutor() { return autor; }

    public void setPreco(Double preco) { this.preco = preco; }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }
}
