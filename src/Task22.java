public class Task22 {
    public static void main(String[] args){
        int day = 4;
        boolean vacation = false;

        if ( day == 0 || day ==6){
            if (vacation== false){
                System.out.println("10:00");
            }else{
                System.out.println("off");
            }

        }else{
            if (vacation == false){
                System.out.println("7:00");
            }else{
                System.out.println("10:00");
            }
        }

    }
}
