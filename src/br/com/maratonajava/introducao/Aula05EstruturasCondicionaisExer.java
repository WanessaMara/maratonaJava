package br.com.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExer {
    public static void main(String[] args) {
//    Dado um determinado salario, calcule quanto de imposto ele deverá pagar.

        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double impostoParaPagarAnual;

        if (salarioAnual <= 34712) {
            impostoParaPagarAnual = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            impostoParaPagarAnual = salarioAnual * segundaFaixa;
        }else {
            impostoParaPagarAnual = salarioAnual * terceiraFaixa;
        }

        System.out.println(impostoParaPagarAnual);

    }
}
