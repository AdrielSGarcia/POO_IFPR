/*
    Classe exemplo cadeia caracteres.
    Desenvolvedor: Adriel Soares Garcia
    Data de criação: 06/03/2025
*/

public class CadeiaCaracteres{
    public static void main(String[] args){
        //Declaração e inicialização de variáveis
        String nome = "Adriel",
                sobrenome = " Soares Garcia";
        int teste = 10, soma = 0;
        double testeD = 100.75;

        String nomeCompleto = nome + sobrenome;
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Nome completo: " + nomeCompleto + " " + teste);
        System.out.println("Tamanho String: " + nomeCompleto.length());
        System.out.println("Igual a Adriel Mandela: " + nomeCompleto.equals("Adriel Mandela"));
        System.out.println("Igual a ADRIEL SOARES GARCIA: " + nomeCompleto.equalsIgnoreCase("ADRIEL SOARES GARCIA"));
        System.out.println("Joana \\ D' Arc" + " \n\tera francesinha");
        System.out.println("Joana \\ D' \"Arc\"" + " \n\tera francesinha");
        System.out.println(soma = (int) ((double) ((float) teste)) + (int) testeD);
    }
}