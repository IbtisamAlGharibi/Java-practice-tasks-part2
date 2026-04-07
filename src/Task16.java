public class Task16 {
    public static void main(String[] args){
        String str = "fig";

        if (str.startsWith("f") && str.endsWith("b")){
            System.out.println("FizzBuzz");
        } else if (str.startsWith("f")) {
            System.out.println("Fizz");
        } else if (str.endsWith("b")){
            System.out.println("Buzz");
        } else {
            System.out.println(str);
        }
    }
}