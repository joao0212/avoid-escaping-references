package br.com.er.collection;

import br.com.er.interfaces.ILivro;
import br.com.er.model.Livro;

import java.util.List;

public class ColecaoDeLivros {

    public List<Livro> livros;

    public ColecaoDeLivros() {
        livros = List.of(
                new Livro(1L, "Clean Code", "Uncle Bob", 119.99)
        );
    }

    public void mostrarLivros() {
        livros.forEach(System.out::println);
    }

    public ILivro buscarPorAutor(String autor) {
        return livros.stream().
                filter(livro -> livro.getAutor().contains(autor))
                .findAny()
                .orElseThrow(RuntimeException::new);
    }
}
