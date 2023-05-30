import java.util.Scanner;
import java.util.Random;

class game {
    
     int num;
    int random_num;
     
     
     game()
     {
        num=0;

     }

public int random_generator() {
    Random ran = new Random();
    random_num = ran.nextInt(100);
    return random_num;    
}
public int userinput()
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the num to guess the number :");
num = sc.nextInt();
return num;

}

public int guess_num() {
    if (random_num<num) 
    {
        System.out.println("it's too high");
    }               
    else if(random_num>num)
    {
        System.out.println(" it's too low");
    }
         else if(random_num==num)
         {
             System.out.println("correct");
            }
            
            return 0; 
            
        }
        
}

class num_guessing_game {
    
    public static void main(String[] args) {
        
        System.out.println("********** note :- computer already choosed the random numberr in between 1 to 100********* ");
        int count=0;        
        game player1 = new game();
        player1.userinput();
        player1.random_generator(); 
        int a,b;
        a=player1.num;
        b=player1.random_num;
        while(b!=a)
        {
            player1.guess_num();
            player1.userinput();        
            if(player1.num==player1.random_num)
            {
                player1.guess_num();
                System.out.println("computr choosed : "+ player1.random_num);
                break;
            }    
            count ++;
        }
        int z =count+2;
        
        System.out.println(" ********congratulations you guess correct number in "+z+" attempts.*********");
    

    }
    
}
