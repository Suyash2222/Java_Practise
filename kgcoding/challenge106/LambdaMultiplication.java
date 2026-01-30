package in.kgcoding.challenge106;

import java.util.Scanner;
import java.util.function.BinaryOperator;


public class LambdaMultiplication {
    public static void main(String[] args) {
    BinaryOperator<Integer> mul = (a,b) -> a * b;
    int res = mul.apply(4,5);
        System.out.println(res);
    }
}
