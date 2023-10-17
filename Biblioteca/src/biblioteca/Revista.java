package biblioteca;

public class Revista implements Imprimivel {
    private String titulo;
    private String editora;
    private String isbn;
    private boolean emprestada;

    public Revista(String titulo, String editora, String isbn) {
        this.titulo = titulo;
        this.editora = editora;
        this.isbn = isbn;
        this.emprestada = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public String getISBN() {
        return isbn;
    }

    public String exibir_info() {
        return "Título: " + titulo + ", Editora: " + editora + ", ISBN: " + isbn;
    }

    public boolean estaEmprestada() {
        return emprestada;
    }

    public void emprestar() {
        emprestada = true;
    }

    public void devolver() {
        emprestada = false;
    }

    public boolean imprimir() {
        // Verifique se a revista não está emprestada antes de imprimir.
        if (!estaEmprestada()) {
            // Lógica específica para imprimir uma revista.
            // No seu caso, o método deve apenas retornar sucesso.
            return true;
        }
        return false;
    }

    public static Revista gerarRevistaAleatoria() {
        // Gere um título, autor e ISBN aleatórios
        String titulo = "Revista " + (int) (Math.random() * 1000);
        String editora = "Editora " + (int) (Math.random() * 1000);
        String isbn = "ISBN" + (int) (Math.random() * 1000);

        return new Revista(titulo, editora, isbn);
    }
    
    
}
