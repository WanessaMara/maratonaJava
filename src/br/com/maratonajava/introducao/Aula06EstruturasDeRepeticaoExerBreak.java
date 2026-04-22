package br.com.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoExerBreak {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000
        // se o carro custa 40000, a parcelas tem que ser 40x de 10000

        double valorCarro = 40000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000){
                //System.out.println("Parcela do Carro: " + parcela + "R$" + valorParcela);
                System.out.printf("Parcela do Carro: " + parcela + " - R$ %.2f%n", valorParcela);
            }else {
                break;
            }


        }
    }
}
