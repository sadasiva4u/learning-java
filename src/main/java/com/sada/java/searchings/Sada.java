package com.sada.java.searchings;

import java.util.Scanner;

public class Sada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int fatherPOs = in.nextInt();
        int martinPOs = in.nextInt();
        int velFather = in.nextInt();
        int steps = in.nextInt();

        int[] result = commonFootSteps(fatherPOs,martinPOs,velFather,steps);
        for (int idx = 0; idx < result.length;idx++){
            System.out.print(result[idx] + " ");
        }
        System.out.println(result[result.length -1]);
    }

    private static int[] commonFootSteps(int fatherPOs, int martinPOs, int velFather, int steps) {
        int[] answer = new int[2];


        return answer;
    }
}
