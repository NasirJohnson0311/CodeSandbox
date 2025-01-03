public class Node {

    String firstName;
    String lastName;
    int age;
    char gender;
    Node next;

    public Node(){
        this.firstName = null;
        this.lastName = null;
        this.age = 0;
        this.gender = '0';
        this.next = null;
    }

    public Node(String firstName, String lastName, int age, char gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.next = null;
    }

    public void getInfo(){
        System.out.print(firstName + " ");
        System.out.print(lastName + " ");
        System.out.print(age + " ");
        System.out.print(gender + " ");
        System.out.println();
    }
}
