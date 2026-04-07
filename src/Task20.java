public class Task20 {
    public static void main(String[] args){
        int a =20;
        int b = 55;

        int leftA = a / 10;
        int rightA =  a % 10;
        int leftB = b / 10;
        int rightB = b%10;

        if ((leftA == leftB) || (leftA == rightB) || (rightA==leftB) || (rightA == rightB)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
