package aeds.dio.STREAM;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamLesson1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

//        List<Integer> twoEvenSquares =   numbers.stream()
//                .filter(n -> {
//                    System.out.println("filtering " + n);
//                    return n % 2 == 0;
//                })
//                .map(n -> {
//                    System.out.println("mapping " + n);
//                    return n * n;
//                })
//                .limit(2)
//                .collect(toList());
        List<Integer> paresAoCubo = numbers.stream()
                .filter(n -> {
                    System.out.println("Filtrando: "+ n);
                    return n%2==0;
                })
                .map(n -> {
                    System.out.println("Mapeando: "+n);
                    return (int)Math.pow(n,3);
                }).limit(3).collect(toList());
        System.out.println(paresAoCubo);
    }
}
