package telefonia;

import java.util.Scanner;

public class Main {

    public static String verificarComboCompleto(String[] servicosContratados) {
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;
        boolean comboCompleto = false;

        // TODO: Itere sobre os serviços contratados
        for (String servico : servicosContratados) {
            if (servico.contains("movel")) {
                movelContratado = true;
            }else if (servico.contains("banda larga")) {
                bandaLargaContratada = true;
            }
        else if (servico.contains("tv") ){
                tvContratada = true;
            }
        }

        if(movelContratado && bandaLargaContratada && tvContratada){
            comboCompleto = true;
        }
        // TODO: Verifique se todos os serviços foram contratados
        if (comboCompleto) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}