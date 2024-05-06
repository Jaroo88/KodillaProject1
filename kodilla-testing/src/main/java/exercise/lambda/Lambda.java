package exercise.lambda;

public class Lambda {
    public static void main(String[] args) {

/*
        Sum sum = new Sum(){
            @Override
            public int calculate(int a, int b) {
                return a + b;
 */


        Sum sum = (a, b) -> a + b;
        System.out.println(sum.calculate(5,7));

    }
}
