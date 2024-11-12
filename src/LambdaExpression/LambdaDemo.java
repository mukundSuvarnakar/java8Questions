package LambdaExpression;

interface Calculator{
    int Calculate(int a,int b);
}
public class LambdaDemo {

    public static void main(String[] args) {
        Calculator add=(a,b)->a+b;
        Calculator sub=(a,b)->a-b;

        System.out.println(add.Calculate(10,5));
        System.out.println(sub.Calculate(10,5));

    }
}
