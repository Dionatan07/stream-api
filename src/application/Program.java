package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> randomNumbers = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Print all elements of this String list: ");
        randomNumbers.forEach(System.out::println);
        System.out.println();

        System.out.println("Put the first 5 numbers and put it inside a Set: ");
        randomNumbers.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Transform this string list into an integer list: ");
        List<Integer> collectList = randomNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collectList);
        System.out.println();


        System.out.println("Take even numbers greater than 2 and put them in a list: ");
        List<Integer> listEvenNumbersGreaterTwo = randomNumbers.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        System.out.println(listEvenNumbersGreaterTwo);
        System.out.println();


        System.out.println("Show the average of numbers: ");
        randomNumbers.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
        System.out.println();


        System.out.println("Remove odd numbers: ");
        List<Integer> randomNumbersInteger = randomNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        randomNumbersInteger.removeIf(integer -> integer % 2 != 0);
        System.out.println(randomNumbersInteger);
    }
}
