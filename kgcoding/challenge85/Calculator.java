package in.kgcoding.challenge85;

public class Calculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2,5));
        System.out.println(c.add(5,8,6));
        System.out.println(c.add(2,4,6,8));
    }



    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
}
