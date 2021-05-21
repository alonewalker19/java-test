package com.company;

public class multidimentional_array {
    public static void main(String[] args) {
        int ani[]; //first box row
        int are[] []; //second box
        are =new int[2][3]; //row or colomn assign
        are[0] [0]= 1;
        are[0] [1]= 2;
        are[0] [2] =3;
        are[1] [0]= 4;
        are[1] [1]=5;
        are[1] [2]=6;

        for (int i =0; i<are.length; i++){
            for (int j=0; j < are[i].length; j++ ){
                System.out.print(are[i][j]);
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}

