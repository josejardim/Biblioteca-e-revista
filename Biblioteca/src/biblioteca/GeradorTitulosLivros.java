package biblioteca;

import java.util.Random;

public class GeradorTitulosLivros {
    private static final String[] palavrasChave = {
        "Aventuras", "Mistérios", "Segredos", "Desafios", "Viagens",
        "Fantasia", "Romance", "Intriga", "História", "Lendas",
        "Enigmas", "Destino", "Heróis", "Magia", "Ficção"
    };

    private static final String[] sufixos = {
    		"O Grande Gatsby", "Cem Anos de Solidão", "1984", "Dom Quixote", "Ulisses", 
    		"Em Busca do Tempo Perdido", "Dom Casmurro", "Moby Dick", "A Revolução dos Bichos",
    		"O Apanhador no Campo de Centeio", "A Menina que Roubava Livros", "Os Miseráveis", "Crime e Castigo",
    		"O Senhor dos Anéis", "O Pequeno Príncipe", "Ensaio Sobre a Cegueira", "O Nome do Vento", "Harry Potter e a Pedra Filosofal",
    		"O Iluminado", "Lolita", "O Sol é para Todos", "As Aventuras de Sherlock Holmes", "A Revolta de Atlas", "A Insustentável Leveza do Ser",
    		"Crepúsculo", "O Silmarillion", "O Poderoso Chefão", "Orgulho e Preconceito", "Laranja Mecânica", "O Leão, a Feiticeira e o Guarda-Roupa",
    		"Guerra e Paz", "Maus", "O Último Desejo", "Duna", "Os Homens que Não Amavam as Mulheres", "A Estrada", "O Hobbit", "As Crônicas de Gelo e Fogo",
    		"O Código Da Vinci", "Drácula", "Anna Karenina", "Os Sofrimentos do Jovem Werther", "A Insustentável Leveza do Ser", "O Retrato de Dorian Gray", "O Amor nos Tempos do Cólera",
    		"A Sangue Frio", "Os Três Mosqueteiros", "O Exorcista", "Frankenstein"
    };

    public static String gerarTituloLivro() {
        Random random = new Random();
        String palavraChave = palavrasChave[random.nextInt(palavrasChave.length)];
        String sufixo = sufixos[random.nextInt(sufixos.length)];
        return palavraChave + " " + sufixo;
    }
}

