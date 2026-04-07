public class Task18 {
    public static void main(String[] args){
        int a =2;
        int b = 4;
        int c = 6;
        int dif1 = a-b;
        int dif2 = a-c;
        int dif3 = b-c;

        if (Math.abs(dif1) > 10 || Math.abs(dif2)>10 || Math.abs(dif3)>10){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
