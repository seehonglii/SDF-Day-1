package myapp;

import java.io.Console;

public class Hello {
    //entry point
    public static void main(String[] args) {
        //get the console
        //declare a variable <type> <name>
        Console cons = System.console();
        
        //prompt the user for an input 
        String input = cons.readLine("what is your name?");
        String phone = cons.readLine("Your contact number?");
        String strAge = cons.readLine("Your age is?");

        int age = Integer.parseInt(strAge);
        boolean agegreaterthan30 = age>=30;

               //print the input 
        System.out.printf("hello %s. Your phone is %s\n", input, phone);
        System.out.printf("You are %s years old\n", age);
        System.out.printf("greater than 50 years old? %b\n", age>50);

        
            if (agegreaterthan30) {
                System.out.printf("hello Mr %s. Your phone is %s\n", input, phone);
            }

            switch (input.trim().toLowerCase()) {
                case "fred":
                    System.out.printf("hello fred\n");
                    break;

                case "Barn":
                    System.out.printf("hello Barn\n");
                    break;

                default:
                    System.out.printf("You are not fred or Barn\n");

            }

        while(age>0) {

            System.out.printf("name: %s, age: %s", input, age);
            age = age - 1;
        }

    }
    
    }
