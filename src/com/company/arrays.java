package com.company;

public class arrays {
    public static void main(String[] args) {
        //array type 1
        String [] list_1 = new String[10];
        list_1[0] = "Anp_aniket";
        list_1[1] = "savitar";
        list_1[2] = "anapaniket";
        list_1[3] = "alonewalker";
        list_1[4] = "goodman";
        System.out.println(list_1[4]);


        //array in one line type 2
        int list_2 [] ={5,69,55,65,89,11,25,33};
        System.out.println(list_2[5]);

//arrays in different line
        int [] list_3 ;
        list_3 = new int [5];
        list_3[0] = 3;
        list_3[1] =33;
        list_3[2] = 44;
        list_3[3] = 66;
        list_3[4] = 76;
        System.out.println(list_3[4]);
    }
}
