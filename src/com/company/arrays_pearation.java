package com.company;

public class arrays_pearation {
    public static void main(String[] args) {
        int list [] ={5,69,55,65,89,11,25,33};
        float list2 [] ={55.8f,44.9f,76.7f};
        System.out.println(list.length);
        //lenth off arrays
        System.out.println(list2.length);
        //floayt is float
        System.out.println(list2[1]);


        //displaying arrays is continuesly line by line
        //print (n-1 ) tak print hoga
        for(int i =0; i<list.length; i++){
            System.out.println(list[i]);
        }
        System.out.println("yahase ulta print hoga");
        for(int i =list.length -1 ; i>=0; i--){
            System.out.println(list[i]);
        }

        System.out.println("yeh wala fopr each loop ka output");
        //for each loop
        for( int element:list){
            System.out.println(element /*only wright element dont need to wright list name*/);
        }




    }
}
