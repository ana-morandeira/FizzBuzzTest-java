package org.example;

public class Main {
    static void main() {

        for(int index = 1; index <= 15; index++){
            String result = new Fizzbuzz().convert(index);
            System.out.println(result);
        }
    }
}
