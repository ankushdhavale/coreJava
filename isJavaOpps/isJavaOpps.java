// static method and static variable

/// static is not chane the value in the object or any other value to differnt value only acsses the same value ex: brand 

//static variable call in a class name ex { SmartPhone.brand } and that value is same any object
// staticmethod call the method to use the class name to call the srtatic method 
class SmartPhone{
    static String brand;
    int price;
    String phone; /// is called in class name SmartPhone.phone

    public void Show(){
        System.out.println(brand + ": " + "$"+ price + ": " + phone);
    }

    public static void Show2(SmartPhone sb1){
        System.out.println(brand + ": " + "$"+ sb1.price  + ": " +sb1.phone);
    }

}

public class isJavaOpps{
    public static void main(String[] args) {

        SmartPhone sb = new SmartPhone();
        SmartPhone.brand = "Apple";
        sb.price = 2009;
        sb.phone = "smartphone";

        SmartPhone sb1 = new SmartPhone();
        SmartPhone.brand = "Mi";
        sb1.price = 123;
        sb1.phone = "SimplePhone";

        sb.Show();
        SmartPhone.Show2(sb1);
    }
}
