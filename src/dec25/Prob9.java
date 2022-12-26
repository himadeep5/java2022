package dec25;

public class Prob9 {
    public static void main (String[] args){
        int number = 4536;
        if ( number < 0)
            System.out.println("negative number");
        else if( number ==0 && number <= 9)
            System.out.println("1");
        else if( number >=10 && number <= 99)
            System.out.println("2");
        else if( number >=100 && number <= 999)
            System.out.println("3");
        else if( number >=1000 && number <= 9999)
            System.out.println("4");
        else if( number >=10000 && number <= 99999)
            System.out.println("5");
        else
            System.out.println("more than 5");
    }
}
