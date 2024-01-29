class demo{
    int x,y;
}
public class variable{
    public static void main(String[] args) {
        int sum1,sum2;
        demo obj1 = new demo();
        demo obj2 = new demo();
        obj1.x=10;
        obj1.y=20;
        obj2.x=30;
        obj2.y=40;
        sum1 = obj1.x+obj1.y;
        sum2 = obj2.x+obj2.y;
        System.out.println("The Sum of First Objects of Number is: "+sum1);
        System.out.println("The Sum of Second Objects of Number is: "+sum2);
    }
}