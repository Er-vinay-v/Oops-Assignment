package assignment_code;
//3.Use a private keyword for a variable and use setter and getter methods to initialise and
//print the values.
public class ExampleGetter_Setter {
    private String name;
    private String city;
    private  String contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    public static void main(String[] args) {
        ExampleGetter_Setter e=new assignment_code.ExampleGetter_Setter();
        e.setName("Vinay");
        e.setCity("Ranchi");
        e.setContact("9584938983");
        System.out.println(e.getName());
        System.out.println(e.getCity());
        System.out.println(e.getContact());
    }
}
