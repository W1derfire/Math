package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String function = "x + 3 = 4x + 6";

        System.out.println("\n\nThe answer is " + solve(function));

    }

    public static double solve(String equation){

        ArrayList<Object> numbers = new ArrayList<Object>();
        double x = 0;
        int check = 0;
        String newEquation = "";

        double plier1 = 0;
        double plier2 = 0;


        //Set up the function, to make it easier to detect spaces.
        for(int i = 0; i < equation.length(); i ++){

            if(equation.charAt(i) == ' '){

                newEquation = newEquation + '#';

            }else{

                newEquation = newEquation + equation.charAt(i);

            }

        }

        //Make a scanner to look through the thing.
        Scanner solver = new Scanner(newEquation).useDelimiter("#");

        System.out.println("The equation is " + newEquation);



        //Split the equation into smaller pieces to make it easier to deal with.
        while(solver.hasNext() || solver.hasNextDouble()){
           if(solver.hasNextDouble() ){

                numbers.add(solver.nextDouble());

            }else if(solver.hasNext()) {

                numbers.add(solver.next());

            }


            if(numbers.get(check) != null){
                System.out.println(numbers.get(check));
                check ++;
            }

        }


        //Now, we look for the "x" (or "x"s).
        



        //System.out.println();

        return x;
    }



    public static double log(double b, double M) {

        return Math.log(M)/Math.log(b);

    }

}
