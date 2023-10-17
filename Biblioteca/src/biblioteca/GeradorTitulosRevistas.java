package biblioteca;

import java.util.Random;

public class GeradorTitulosRevistas {
    private static final String[] palavrasChave = {
    		"Ciência", "Tecnologia", "Cultura", "Esportes", "Política", "Saúde",
    		"Entretenimento", "História", "Meio Ambiente", "Negócios", "Inovação",
    		"Educação", "Economia", "Arte", "Música", "Culinária", "Viagem",
    		"Literatura", "Moda", "Religião", "Filosofia", "Sustentabilidade", "Clima",
    		"Energia", "Espaço", "Internet", "Marketing", "Finanças", "Bem-estar","Arquitetura",
    		"Cinema", "Comida", "Tecnologia da Informação","Cultura Pop", "Ciências Sociais",
    		"Medicina", "Esportes Radicais", "Democracia", "Ecossistema", "Empreendedorismo",
    		"Comércio", "Arqueologia", "Natureza", "Desenvolvimento Sustentável", "Globalização", "Robótica",
    		"Saúde Mental", "Política Externa", "Inteligência Artificial", "Biodiversidade"
    };

    private static final String[] sufixos = {
        "em Foco", "Mensal", "Anual", "do Brasil", "Internacional",
        "em Revista", "Atualidades", "Edição Especial", "no Século XXI"
    };

    public static String gerarTituloRevista() {
        Random random = new Random();
        String palavraChave = palavrasChave[random.nextInt(palavrasChave.length)];
        String sufixo = sufixos[random.nextInt(sufixos.length)];
        return palavraChave + " " + sufixo;
    }
}

