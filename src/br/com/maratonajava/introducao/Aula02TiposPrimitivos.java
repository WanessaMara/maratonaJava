package br.com.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int idade = (int) 10000000000L;
        long numeroGrande = 10000000;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0F;
        byte idadeByte = 23;
        short idadeShort = 23;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'F';
        String texto = "Isso é um exemplo de string.";

        System.out.println("A idade é: " + idade);
        System.out.println(verdadeiro);
        System.out.println(texto);
    }
}
