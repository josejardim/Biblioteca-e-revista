package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorUsuarios {
    private static final String[] nomesFicticios = {
        "João", "Maria", "Pedro", "Ana", "Lucas", "Camila", "Fernando", "Laura", "Carlos", "Isabel",
        "Rafael", "Sofia", "Miguel", "Larissa", "Gustavo", "Vitória", "Eduardo", "Carolina", "Gabriel", "Beatriz",
        "Marcelo", "Júlia", "Renato", "Valentina", "Ricardo", "Bianca", "Matheus", "Catarina", "Fábio", "Letícia",
        "Antônio", "Lorena", "César", "Mariana", "Luiz", "Clara", "Daniel", "Manuela", "Bruno", "Débora",
        "Alex", "Ester", "José", "Alice", "André", "Elisa", "Fernanda", "Davi", "Natália"
    };

    public static List<Usuario> gerarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 25; i++) {
            int indiceNome = random.nextInt(nomesFicticios.length);
            String nome = nomesFicticios[indiceNome];
            String cpf = gerarCPF(); // Use a função gerarCPF() para criar CPFs válidos
            int matricula = 1000 + i; // Matrícula fictícia para exemplo
            Usuario usuario = new Usuario(nome, cpf, matricula);
            usuarios.add(usuario);
        }
        return usuarios;
    
    }

    // Função para gerar um CPF válido aleatório
    public static String gerarCPF() {
        Random random = new Random();
        int[] cpf = new int[9];

        // Gera os 9 primeiros dígitos do CPF
        for (int i = 0; i < 9; i++) {
            cpf[i] = random.nextInt(10);
        }

        // Calcula os dígitos verificadores do CPF
        int digito1 = calcularDigitoVerificador(cpf, 10);
        int digito2 = calcularDigitoVerificador(cpf, 11);

        // Monta o CPF completo
        StringBuilder cpfCompleto = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            cpfCompleto.append(cpf[i]);
        }
        cpfCompleto.append(digito1);
        cpfCompleto.append(digito2);

        return cpfCompleto.toString();
    }

    private static int calcularDigitoVerificador(int[] cpf, int peso) {
        int soma = 0;
        for (int i = 0; i < cpf.length; i++) {
            soma += cpf[i] * peso;
            peso--;
        }

        int resto = soma % 11;
        if (resto < 2) {
            return 0;
        } else {
            return 11 - resto;
        }
    }

    public static void main(String[] args) {
        List<Usuario> usuarios = gerarUsuarios();
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("CPF: " + usuario.getCpf());
            System.out.println("Matrícula: " + usuario.getMatricula());
            System.out.println();
        }
    }
}
