
class Calculator{
    public int add(int n1 , int n2){
        return n1 + n2;
    }
    public int add(int n1 , int n2 , int n3){
        return n1 + n2 + n3;
    }
    public double add(double n1 , double n2){
        return n1 + n2;
    }
}

public class basicJava{
    public static void main(String args[]){
        Calculator obj = new Calculator();
        int r1 = obj.add(10, 20);
        int r2 = obj.add(10, 20 , 10);
        double do1 = obj.add(10, 20);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(do1);
    }
}