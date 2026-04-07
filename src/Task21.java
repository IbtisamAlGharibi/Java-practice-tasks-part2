public class Task21 {
    public static void main(String[] args){

        int temp = 35;
        boolean isSummer = true;

        if (isSummer == false ){
            if (temp >= 60 && temp <= 90){
                System.out.println("True");
            }

        } else if (isSummer == true ) {
            if (temp>= 60 && temp <=100){
                System.out.println("True");
            }
            
        }else {
            System.out.println("False");
        }

    }
}
