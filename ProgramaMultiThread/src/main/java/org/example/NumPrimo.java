package org.example;

import java.util.Scanner;

public class NumPrimo {

    public static void main(String[] args) {

        int numero;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 5 números: ");
        numero = Integer.parseInt(scanner.nextLine());
        numero2 = Integer.parseInt(scanner.nextLine());
        numero3 = Integer.parseInt(scanner.nextLine());
        numero4 = Integer.parseInt(scanner.nextLine());
        numero5 = Integer.parseInt(scanner.nextLine());

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                verificacaoNumeroPrimo(numero);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                verificacaoNumeroPrimo(numero2);
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                verificacaoNumeroPrimo(numero3);
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                verificacaoNumeroPrimo(numero4);
            }
        });

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                verificacaoNumeroPrimo(numero5);
            }
        });

        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }
    //Criação de método
    public static void verificacaoNumeroPrimo (int numero){
        if (numero == 2){
            System.out.println("O número é primo");
        } else if (numero!=2 && (numero%3==0 || numero%5==0 || numero%7==0)){
            System.out.println("O número não é primo");
        } else if (numero%numero == 0 || numero%1 == 0){
            System.out.println("O número é primo");
        } else {
            System.out.println("O número não é primo.");
        }
    }

}

