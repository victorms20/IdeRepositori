package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long empieza = System.currentTimeMillis();
        Random aleatorio = new Random();
        int numero = 335;

        List<Integer> lista_num = new ArrayList<>();

        for (int i = 0; i < 500000; i++) {
            int num_ale = aleatorio.nextInt(100000);
            lista_num.add(num_ale);
        }
        System.out.println(lista_num.contains(numero));
        long acaba = System.currentTimeMillis();
        
        System.out.println("Ha tardado " + (empieza-acaba) + " milisegundos en encontrar el numero");

    }
}