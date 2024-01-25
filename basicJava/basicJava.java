package basicJava;
class Calculator{
    public static int add(int num1 ,int num2){
        System.out.println("hello Budy");
        int result = num1 + num2;
        return result ;
    }


    public void playMusic(){
        System.out.println("playing music");
    }

    public String getPen(int cost){
        if(cost >=10)
            return "pen";
        else
            return "You Not Buy The pen";
    }
}

public class basicJava{
    public static void main(String args[]){
        Calculator c = new Calculator();
        String result = c.getPen(2);
        c.playMusic();
        System.out.println(result);
    }
}


