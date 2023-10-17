package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String cpf;
    private int matricula;
    private List<Livro> livrosEmprestados;
    private List<Revista> revistasEmprestadas;

    public Usuario(String nome, String cpf, int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.livrosEmprestados = new ArrayList<>();
        this.revistasEmprestadas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public List<Revista> getRevistasEmprestadas() {
        return revistasEmprestadas;
    }

    public void adicionarLivroEmprestado(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void adicionarRevistaEmprestada(Revista revista) {
        revistasEmprestadas.add(revista);
    }

    public void removerLivroEmprestado(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public void removerRevistaEmprestada(Revista revista) {
        revistasEmprestadas.remove(revista);
    }

    public static List<Usuario> gerarUsuariosPadrao() {
        List<Usuario> usuarios = new ArrayList<>();
        for (int i = 1; i <= 25; i++) {
            String nome = "Usuário " + i;
            String cpf = "CPF" + i;
            int matricula = 1000 + i;
            Usuario usuario = new Usuario(nome, cpf, matricula);
            usuarios.add(usuario);
        }
        return usuarios;
    }

	
    
}
