package Fizzbuzz;

import org.example.Fizzbuzz;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({
            "1 , '1'",
            "2 , '2'",
            "4 , '4'",
            "7 , '7'",
            "8 , '8'",
    })
    void check_number_to_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new Fizzbuzz().convert(input));
    }

    @ParameterizedTest
    @CsvSource({
            "3 , 'Fizz'",
            "6 , 'Fizz'",
            "9 , 'Fizz'",
            "12 , 'Fizz'",
    })
    void check_number_to_fizz_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new Fizzbuzz().convert(input));
    }

    @ParameterizedTest
    @CsvSource({
            "5 , 'Buzz'",
            "10 , 'Buzz'",
            "20 , 'Buzz'",
    })
    void check_number_to_buzz_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new Fizzbuzz().convert(input));
    }

    @ParameterizedTest
    @CsvSource({
            "15 , 'FizzBuzz'",
            "30 , 'FizzBuzz'",
            "45 , 'FizzBuzz'",
    })
    void check_number_to_fizzbuzz_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new Fizzbuzz().convert(input));
    }
}