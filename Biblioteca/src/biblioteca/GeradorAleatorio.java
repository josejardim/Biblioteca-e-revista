package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorAleatorio {

    public static List<Livro> gerarLivros(int quantidadeLivros) {
        List<Livro> livros = new ArrayList<>();
        for (int i = 1; i <= quantidadeLivros; i++) {
            String titulo = "Livro " + i;
            String autor = "Autor " + i;
            String isbn = "ISBN" + i;
            Livro livro = new Livro(titulo, autor, isbn);
            livros.add(livro);
        }
        return livros;
    }

    public static List<Revista> gerarRevistas(int quantidadeRevistas) {
        List<Revista> revistas = new ArrayList<>();
        for (int i = 1; i <= quantidadeRevistas; i++) {
            String titulo = "Revista " + i;
            String editora = "Editora " + i;
            String isbn = "ISBN" + i;
            Revista revista = new Revista(titulo, editora, isbn);
            revistas.add(revista);
        }
        return revistas;
    }

    public static List<Usuario> gerarUsuarios(int quantidadeUsuarios) {
        List<Usuario> usuarios = new ArrayList<>();
        for (int i = 1; i <= quantidadeUsuarios; i++) {
            String nome = "Usuário " + i;
            String cpf = GeradorCPF.gerarCPF(); // Usando a classe GeradorCPF para gerar CPFs aleatórios
            int matricula = 1000 + i; // Matrícula fictícia para exemplo
            Usuario usuario = new Usuario(nome, cpf, matricula);
            usuarios.add(usuario);
        }
        return usuarios;
    }

    public static void conectarLivrosAosUsuarios(List<Livro> livros, List<Usuario> usuarios) {
        Random random = new Random();
        for (Livro livro : livros) {
            int indiceUsuario = random.nextInt(usuarios.size());
            Usuario usuario = usuarios.get(indiceUsuario);
            // Simule o empréstimo de livros aqui, você deve adaptar isso com sua lógica
            System.out.println("Livro: " + livro.getTitulo() + " emprestado para " + usuario.getNome());
        }
    }

    public static void conectarRevistasAosUsuarios(List<Revista> revistas, List<Usuario> usuarios) {
        Random random = new Random();
        for (Revista revista : revistas) {
            int indiceUsuario = random.nextInt(usuarios.size());
            Usuario usuario = usuarios.get(indiceUsuario);
            // Simule o empréstimo de revistas aqui, você deve adaptar isso com sua lógica
            System.out.println("Revista: " + revista.getTitulo() + " emprestada para " + usuario.getNome());
        }
    }
}
