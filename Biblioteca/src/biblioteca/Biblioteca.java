package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> catalogoLivros;
    private List<Usuario> usuarios;
    private List<Revista> catalogoRevistas;
    String tituloLivro = GeradorTitulosLivros.gerarTituloLivro();
    String tituloRevista = GeradorTitulosRevistas.gerarTituloRevista();

    public Biblioteca() {
        catalogoLivros = new ArrayList<>();
        usuarios = new ArrayList<>();
        catalogoRevistas = new ArrayList<>();
    }

    public void adicionar_livro(Livro livro) {
        catalogoLivros.add(livro);
    }

    public void adicionar_revista(Revista revista) {
        catalogoRevistas.add(revista);
    }

    public void adicionar_usuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void emprestar_livro(Livro livro, Usuario usuario) {
        // Implemente a lógica de empréstimo de livros aqui
        livro.emprestar();
        usuario.adicionarLivroEmprestado(livro);
    }

    public void emprestar_revista(Revista revista, Usuario usuario) {
        // Implemente a lógica de empréstimo de revistas aqui
        revista.emprestar();
        usuario.adicionarRevistaEmprestada(revista);
    }

    public List<Livro> listar_livros_emprestados() {
        List<Livro> livrosEmprestados = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            livrosEmprestados.addAll(usuario.getLivrosEmprestados());
        }
        return livrosEmprestados;
    }

    public List<Revista> listar_revistas_emprestadas() {
        List<Revista> revistasEmprestadas = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            revistasEmprestadas.addAll(usuario.getRevistasEmprestadas());
        }
        return revistasEmprestadas;
    }

    public List<Revista> getRevistas() {
        return catalogoRevistas;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Livro> getLivros() {
        return catalogoLivros;
    }
}


