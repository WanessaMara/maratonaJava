package br.com.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        System.out.println("Valor " + numero01 + numero02);
        System.out.println(numero01 + numero02);

        // -----------------------------------------------------------//

        int resto = 20 % 2;
        System.out.println(resto);

        // -----------------------------------------------------------//

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        // ------------------------------------------------------------//

        // AND (&&), OR (||), NOT (!)
        // AND
        int idade = 29;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        // OR
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravevel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravevel " + isPlaystationCincoCompravevel);

        // Atribuição = += -= *= /= %=
        double bonus = 1000;
        bonus += 1000;
        System.out.println(bonus);

        //incremento ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        System.out.println(contador);

    }
}
