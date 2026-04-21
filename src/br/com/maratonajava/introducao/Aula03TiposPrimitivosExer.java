package br.com.maratonajava.introducao;

public class Aula03TiposPrimitivosExer {
    public static void main(String[] args) {
        String nome = "Wanessa";
        String endereço = "Rua tal tal tal, número 890";
        double salario = 1.142;
        String dataRecebimento = "15/04/2026";
        String mensagem = "Eu " + nome + ", morando no endereço: " + endereço +
                ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimento;

        System.out.println(mensagem);
    }
}
