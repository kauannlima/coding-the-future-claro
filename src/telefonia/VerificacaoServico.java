package telefonia;

import java.util.Scanner;

public class VerificacaoServico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String servico = scanner.nextLine().trim();

        String entradaCliente = scanner.nextLine().trim();

        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];

        boolean contratado = false;

            for (String p : partes) {
                if (servico.equals(p)) {
                    contratado = true;

                }
            }
            if (contratado){
                System.out.println("Sim");
            }else {
                System.out.println("Nao");
            }

        scanner.close();
    }
}
