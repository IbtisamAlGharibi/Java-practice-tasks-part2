public class Task28 {
    public static void main(String[] args){
        int die1 = 2;
        int die2= 4;
        boolean noDoubles = true;

        if ( noDoubles == false ){
            System.out.println(die1 + die2);

        } else if (noDoubles == true && die1 != die2) {
            System.out.println( die1 + die2 );
            
        }else if(noDoubles == true &&  die1 == die2){
            die1 +=1;

        }




    }
}
