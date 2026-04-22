package br.com.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExerSwitch {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprimia se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte diaDaSemana = 3;

        switch (diaDaSemana){
            case 1:
                System.out.println("Final de Semana: Domingo");
                break;
            case 2:
                System.out.println("Dia Útil: Segunda");
                break;
            case 3:
                System.out.println("Dia Útil: Terça");
                break;
            case 4:
                System.out.println("Dia Útil: Quarta");
                break;
            case 5:
                System.out.println("Dia Útil: Quinta");
                break;
            case 6:
                System.out.println("Dia Útil: Sexta");
                break;
            case 7:
                System.out.println("Final de Semana: Sábado");
                break;
            default:
                System.out.println("Opção Inválida, tente novamente!");
                break;
        }
    }
}
