package assignment_code;

//1.Create a class that keeps track of the number of instances created. Implement a static
//variable and method to accomplish this.
public class StaticDemo {
    private static int count=0;
    public StaticDemo(){
        count++;
    }
    public static int getCount(){
        return count;
    }

    public static void main(String[] args) {
        StaticDemo a=new assignment_code.StaticDemo();
        StaticDemo b=new assignment_code.StaticDemo();
        StaticDemo c=new assignment_code.StaticDemo();
        System.out.println("Number of instance created :"+ assignment_code.StaticDemo.count);
    }
}
