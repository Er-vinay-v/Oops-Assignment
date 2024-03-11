package assignment_code;
//2.Write a program and create a constructor with parameters and initialise the variable using
//a constructor.
public class ParameterizedConstructor {
    int id;
    String name;
    String city;
    String coursers;

    ParameterizedConstructor(int id,String name,String city,String coursers){
        this.id=id;
        this.name=name;
        this.city=city;
        this.coursers=coursers;

    }

    @Override
    public String toString() {
        return "ParameterizedConstructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", coursers='" + coursers + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ParameterizedConstructor p=new assignment_code.ParameterizedConstructor(12,"Vinay",
                "Noida","Java With DSA");
        System.out.println(p.toString());
    }
}
