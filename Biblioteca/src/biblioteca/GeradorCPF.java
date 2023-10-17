package biblioteca;

import java.util.Random;

public class GeradorCPF {
    public static String gerarCPF() {
        StringBuilder cpf = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 9; i++) {
            cpf.append(random.nextInt(10));
        }

        int digito1 = calcularDigitoVerificador(cpf.toString());
        cpf.append(digito1);

        int digito2 = calcularDigitoVerificador(cpf.toString());
        cpf.append(digito2);

        return cpf.toString();
    }

    private static int calcularDigitoVerificador(String parteCPF) {
        int soma = 0;
        int peso = parteCPF.length() + 1;

        for (int i = 0; i < parteCPF.length(); i++) {
            int digito = Character.getNumericValue(parteCPF.charAt(i));
            soma += digito * peso;
            peso--;
        }

        int resto = soma % 11;
        return (resto < 2) ? 0 : (11 - resto);
    }
}
