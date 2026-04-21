package br.com.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado");
        } else {
            System.out.println("Não Autorizado");
        }

        //not !
        if (!isAutorizadoComprarBebida) { //isAutorizado == false
            System.out.println("Não autorizado");
        }
    }
}
