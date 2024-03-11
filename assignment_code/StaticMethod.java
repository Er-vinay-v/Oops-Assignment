package assignment_code;
//4.Write a program to call a method without creating an object of a class.
public class StaticMethod {
    public static int sum(int a,int b){
        int c=a+b;
        return c;
    }
    public static float mul(int a, int b,int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        int ans=sum(5,12);
        System.out.println("sum of two no.: "+ans);

        System.out.println("sum of to no. :"+StaticMethod.sum(23,45));
        System.out.println("multiplication of 2 no --> "+ mul(3,5,8));
    }
}
