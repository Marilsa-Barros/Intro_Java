// 1- Pacote
package intro;

// 2 - Referência as bibliotecas

import java.sql.SQLOutput;

// 3- Classe
public class Medidas {
    //3.1 Atributos - Caracteristicas

    //3.2 - Métodos e Funções
    public static void main(String[] args){
    calcularAreaModoCurto();
    calcularAreaModoExtenso();

    }

    public static void calcularAreaModoCurto(){
        System.out.println("Cálculo de área Mood Curto");
        // Calculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                +  comprimento + "m a area é de " + largura * comprimento + "m2");

    }

    public static void calcularAreaModoExtenso(){
        System.out.println("Cálculo de área Mood Extenso");
        // Calculo de área - Exemplo o tamnho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5;
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                +  comprimento + "m a area é de " + resultado + "m2");

    }


}
