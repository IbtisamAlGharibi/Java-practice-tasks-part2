public class Task19 {
    public static void main(String [] args){
        int a = 0;
        int b = 1;
        int c = 2;

        if (a == 2 && b == 2 && c == 2){
            System.out.println("10");
        } else if (a == b && b == c) {
            System.out.println("5");
        } else if (b != a && c != a) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}