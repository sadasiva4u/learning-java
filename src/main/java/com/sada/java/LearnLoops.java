package com.sada.java;

public class LearnLoops {

    public static void main(String[] args) {
        //if-else
        // true / false

        String input = "This is my first string fan";
        String[] inputs = input.split(" ");
        String str1 ;
        String str2 = "";
        String str = null;

        /*
        AND - &&
        0,0 -> 0
        0,1 -> 0
        1,0 -> 0
        1,1 -> 1

        OR - ||
        0,0 -> 0
        0,1 -> 1
        1,0 -> 1
        1,1 -> 1

        TRUE -> 1
        False -> 0

         */

        if((null != str2) || (str.isEmpty() && inputs.length !=5)){
            System.out.println("Inside if condition");
        } else if(str2.isEmpty()){
            System.out.println("Inside else-if ");
        }else{
            System.out.println("Inside else");
        }

        if(true){

        }else if(false){

        }

        if(false){

        }else{

        }

        // 0 || 1 && 1 && 0
        // 0 || 1 && 0
        // 0 || 0
        // 0

        // for-loop

        int[] ints = {1,2,3,4,5,6,7};
        String[] strings2 = {"abc","def","ghi"};
        int[] ints2 = new int[20];
        String[] strs = new String[5];
        strs[0]="afsdgfhadskvcjadhskvfhaskashksahkjsbadskf";
        strs[1]="afsdgfhadskvcjadhskvfhaskashksahkjsbadskf";
        strs[2]="afsdgfhadskvcjadhskvfhaskashksahkjsbadskf";
        strs[3]="afsdgfhadskvcjadhskvfhaskashksahkjsbadskf";
        strs[4]="afsdgfhadskvcjadhskvfhaskashksahkjsbadskf";

        System.out.println(strs[4]);

        // [0],[1],[2]....
        // length = 6... indexs 0-5
        for(int i=0; i<ints.length ;i++){
            //System.out.println(ints[i]);
        }

        for(int j : ints){

        }

        for(String temp : inputs){
            if(temp.startsWith("fa")) {
                System.out.println(temp);
            }

        }


        // while -- do-while

        int i=1;
        while(true){
            for(int k =0 ; k < 10;k++){
                System.out.println(k);
                if(k==5) {
                    break;
                }
            }
            System.out.println(i++);
            if(i == 100) {
                break;
            }
        }

        do{

        }while (i<100);
        // switch
    }

}
