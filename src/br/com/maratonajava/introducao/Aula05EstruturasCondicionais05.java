package br.com.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Problema: imprima o dia da semana , considerando 1 como domingo
        // Switch: char, int, byte, short, enum, String

        byte dia = 10;

        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("seg");
                break;
            case 3:
                System.out.println("ter");
                break;
            case 4:
                System.out.println("quart");
                break;
            case 5:
                System.out.println("quint");
                break;
            case 6:
                System.out.println("sext");
                break;
            case 7:
                System.out.println("sab");
                break;
            default:
                System.out.println("opção inválida");
                break;
        }

        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
