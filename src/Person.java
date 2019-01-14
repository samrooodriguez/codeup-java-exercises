public class Person {
    private String firstName;
    private String lastName;

    private String sayHello(){
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args){
        Person sam = new Person();
        sam.firstName = "Sam";
        sam.lastName = "Rodriguez";
        System.out.println(sam.sayHello());
    }
}

