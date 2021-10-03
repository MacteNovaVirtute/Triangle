package com.company;



public class Triangles {

    public static void main(String[] args) {
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(i>=j){
                    System.out.print("*");
                }

            }
            System.out.println();

        }
        System.out.println("");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(i<=j){
                    System.out.print("*");
                } else if(i>j){
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        System.out.println("");

        for(int j=1;j <= 3;j++){
            for(int i=1;i <= 3-j;i++){
                System.out.print(" ");
            }

            for(int k=1;k<=j; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
