package org.example;

public class Fizzbuzz {
    public String convert(int inputNumber){

        //     if(inputNumber == 7){
        //         return "7";
        //  }

        //     if(inputNumber == 4){
        //      return "4";
        //      }
        //      if(inputNumber == 2){
        //         return "2";
        //      }

        //      return "1";

//        if(inputNumber == 3){
//            return "Fizz";
//        }
//
//        if(inputNumber == 6){
//            return "Fizz";
//        }
//
//        if(inputNumber == 9){
//            return "Fizz";
//        }

        if(inputNumber % 3 == 0 && inputNumber % 5 == 0){
            return "FizzBuzz";
        }

        if(inputNumber % 5 == 0){
            return "Buzz";
        }

        if(inputNumber % 3 == 0){
            return "Fizz";
        }

        return String.valueOf(inputNumber);
    }
}