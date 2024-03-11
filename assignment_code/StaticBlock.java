package assignment_code;
//5.Write a program which has static block and constructor overloading,initialise variables
//using constructors and print it.
public class StaticBlock {
    public String name;
    public int age;

    public StaticBlock(){
        System.out.println("Default constructor");
    }

    public StaticBlock(String name){
        super();
        this.name=name;
    }
    public StaticBlock(int  age){
        super();
        this.age=age;
    }
    public StaticBlock(String name,int age){
        super();
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "StaticBlock{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        StaticBlock b=new assignment_code.StaticBlock("PW-Skills");
        System.out.println(b.name);
        StaticBlock b1=new assignment_code.StaticBlock(12);
        System.out.println(b1.age);
        StaticBlock b2=new assignment_code.StaticBlock("GeeksForGeeks",50);
        System.out.println(b2.toString());
    }
}
