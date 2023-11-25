package client;


import common.CalcInterface;

import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    static final String URL_SERVER =  "rmi://localhost/CalculatorService";
    static Scanner scan  = new Scanner(System.in);
    static Integer primeiro_numero;
    static Integer segundo_numero;
    public static void main(String[] args) {

        try {

            CalcInterface calc = (CalcInterface) Naming.lookup(URL_SERVER);

            double a = 10;
            double b = 5;
            Integer escolha = -1;


            while (escolha != 0){
                printMenu();
                escolha = scan.nextInt();

                switch (escolha){
                    case 1:
                        pegaValores();
                        printResultado("+",calc.add(primeiro_numero, segundo_numero));
                        break;
                    case 2:
                        pegaValores();
                        printResultado("-",calc.subtract(primeiro_numero, segundo_numero));
                        break;
                    case 3:
                        pegaValores();
                        printResultado("*", calc.multiply(primeiro_numero, segundo_numero));
                        break;
                    case 4:
                        pegaValores();
                        printResultado("/", calc.divide(primeiro_numero, segundo_numero));
                        break;

                    default:
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    static void printMenu(){
        System.out.println("""
                1 - Soma
                2- Subtracao
                2 - Muliplicacao
                4 - Divisao
                0 - Sair/Exit 
                
                Escolha uma opcao:
                """);
    }

    static void pegaValores(){
        System.out.println("Informe o primero numero");
        primeiro_numero = scan.nextInt();
        System.out.println("Informe o segundo");
        segundo_numero = scan.nextInt();
    }

    static void printResultado(String operador, Double results){
        System.out.println("Resultado: " + primeiro_numero + " " + operador + " "  + segundo_numero + " = "  + results);
    }


}
