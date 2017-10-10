package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int numero = 335;

        List<Integer> lista_num = new ArrayList<>();

        for (int i = 0; i < 500000; i++) {
            int num_ale = aleatorio.nextInt(700000);
            lista_num.add(num_ale);
        }

        System.out.println(lista_num.contains(numero));

    }
}
