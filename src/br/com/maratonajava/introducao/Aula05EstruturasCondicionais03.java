package br.com.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Operador Ternario
        // Doar se salario > 5000

        double salario = 6000;
        //String mensagemDoar = "Eu vou doar 500.";
        //String mensagemNaoDoar = "Ainda não tenho condição.";

        // (condição) ? verdadeiro : false;
        //String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        String resultado = salario > 5000 ? "Eu vou doar 500." : "Ainda não tenho condição.";

        System.out.println(resultado);
    }
}
