package biblioteca;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Random random = new Random();       
       
        
        // Adicionar livros à biblioteca com títulos aleatórios
        for (int i = 1; i <= 30; i++) {
            String titulo = GeradorTitulosLivros.gerarTituloLivro();
            String autor = "Autor " + i;
            String isbn = "ISBN" + i;
            Livro livro = new Livro(titulo, autor, isbn);
            biblioteca.adicionar_livro(livro);
        }

        int quantidadeUsuarios = 50;
        for (int i = 1; i <= quantidadeUsuarios; i++) {
            String nome = "Usuário " + i;
            String cpf = GeradorCPF.gerarCPF();
            int matricula = 1000 + i;
            Usuario usuario = new Usuario(nome, cpf, matricula);
            biblioteca.adicionar_usuario(usuario);
        }              

        for (int i = 1; i <= 10; i++) {
            int livroIndex = random.nextInt(3);
            int usuarioIndex = random.nextInt(2);
            Livro livro = biblioteca.getLivros().get(livroIndex);
            Usuario usuario = biblioteca.getUsuarios().get(usuarioIndex);
            biblioteca.emprestar_livro(livro, usuario);
        }
        
        // Realize pelo menos um empréstimo de livro
        Livro livroParaEmprestar = biblioteca.getLivros().get(0);
        Usuario usuarioParaEmprestar = biblioteca.getUsuarios().get(0);
        biblioteca.emprestar_livro(livroParaEmprestar, usuarioParaEmprestar);
        
        System.out.println("Livros emprestados:");
        for (Livro livro : biblioteca.listar_livros_emprestados()) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", ISBN: " + livro.getISBN());
        }  

        // Adicionar revistas à biblioteca com títulos aleatórios
        for (int i = 1; i <= 30; i++) {
            String titulo = GeradorTitulosRevistas.gerarTituloRevista();
            String editora = "Editora " + i;
            String isbn = "ISBN" + i;
            Revista revista = new Revista(titulo, editora, isbn);
            biblioteca.adicionar_revista(revista);
        }
        for (int i = 1; i <= 30; i++) {
            int revistaIndex = random.nextInt(30);
            int usuarioIndex = random.nextInt(2);
            Revista revista = biblioteca.getRevistas().get(revistaIndex);
            Usuario usuario = biblioteca.getUsuarios().get(usuarioIndex);
            biblioteca.emprestar_revista(revista, usuario);
        }

        System.out.println("Revistas emprestadas:");
        for (Revista revista : biblioteca.listar_revistas_emprestadas()) {
            System.out.println("Título: " + revista.getTitulo() + ", Editora: " + revista.getEditora() + ", ISBN: " + revista.getISBN());
        }
    }
}