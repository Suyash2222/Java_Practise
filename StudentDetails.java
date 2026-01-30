public class StudentDetails {
    String name;
    int age;
    String addr;

    public StudentDetails(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Name: "+name+"\nAge : "+age+"\nAddress: "+addr;
    }

    public static void main(String[] args) {
        StudentDetails sd = new StudentDetails("Diya",24,"Pune");
        System.out.println(sd.toString());
    }
}
