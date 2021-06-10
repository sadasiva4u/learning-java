package com.sada.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {


    // https://www.youtube.com/watch?v=1ZGJzvkcLsA

    static List<Integer> spiralOrder(int[][] A) {

        int T,B,L,R,dir;
        T=0;
        B=A.length-1;
        L=0;
        R=A[0].length-1;
        dir=0;
        int i;
        List<Integer> ans = new ArrayList<>();

        while(T<=B && L<=R)
        {
            if(dir==0)
            {
                for(i=L;i<=R;i++)
                    ans.add(A[T][i]);
                T++;
            }
            else if(dir==1)
            {
                for(i=T;i<=B;i++)
                    ans.add(A[i][R]);
                R--;
            }
            else if(dir==2)
            {
                for(i=R;i>=L;i--)
                    ans.add(A[B][i]);
                B--;
            }
            else if(dir==3)
            {
                for(i=B;i>=T;i--)
                    ans.add(A[i][L]);
                L++;
            }
            dir=(dir+1)%4;
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int b[][]={{1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24},
                {25,26,27,28,29,30},
                {31,32,33,34,35,36}};
        // Function Call
        System.out.println(mySpiralMatrics(b));
    }


    static List<Integer> mySpiralMatrics(int[][] input){

        List<Integer> output = new ArrayList<>();

        int top = 0;
        int bottom=input.length-1;
        int right =input[0].length-1;
        int left=0;
        int dir = 0;


        int index=0;

        System.out.println("top="+top+ " ,bottom="+bottom  + " , right="+right + " ,left="+left);
        while(top<=bottom && left<=right){
            if(dir == 0){
                for(index=left;index<=right;index++){
                    output.add(input[top][index]);
                }
                ++top;
                //System.out.println("top="+top+ " ,bottom="+bottom  + " , right="+right + " ,left="+left);
            } else if(dir==1){
                for(index=top;index<=bottom;index++){
                    output.add(input[index][right]);
                }
                --right;
                //System.out.println("top="+top+ " ,bottom="+bottom  + " , right="+right + " ,left="+left);
            }else if(dir==2){
                for(index=right;index>=left;index--){
                    output.add(input[bottom][index]);
                }
                --bottom;
                //System.out.println("top="+top+ " ,bottom="+bottom  + " , right="+right + " ,left="+left);
            }else if(dir==3){
                for(index=bottom;index>=top;index--){
                    output.add(input[index][left]);
                }
                ++left;
                //System.out.println("top="+top+ " ,bottom="+bottom  + " , right="+right + " ,left="+left);
            }
            dir=(dir+1)%4;
        }

        System.out.println("top="+top+ " ,bottom="+bottom  + " , right="+right + " ,left="+left);
        return output;
    }
}
