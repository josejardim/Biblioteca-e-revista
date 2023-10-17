package biblioteca;

public class Livro implements Imprimivel {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean emprestado;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return isbn;
    }

    public String exibir_info() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn;
    }

    public boolean estaEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        emprestado = true;
    }

    public void devolver() {
        emprestado = false;
    }

    public boolean imprimir() {
        // Verifique se o livro não está emprestado antes de imprimir.
        if (!estaEmprestado()) {
            // Lógica específica para imprimir um livro.
            // No seu caso, o método deve apenas retornar sucesso.
            return true;
        }
        return false;
    }

    public static Livro gerarLivroAleatorio() {
        // Gere um título, autor e ISBN aleatórios
        String titulo = "Livro " + (int) (Math.random() * 1000);
        String autor = "Autor " + (int) (Math.random() * 1000);
        String isbn = "ISBN" + (int) (Math.random() * 1000);

        return new Livro(titulo, autor, isbn);
    }
}
