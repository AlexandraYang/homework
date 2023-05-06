public class Employee extends Person{

    private String department;

    public Employee(String newName, String address, String phone, String department){
        super(newName, address, phone);
        this.department = department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return this.department;
    }
    public String toString(){
        return super.toString() + ", Department: " + getDepartment();
    }
}  

// class Print{
//     public static void main(String[] args){
//         Employee e1 = new Employee("Jaime", "Amherst", "000-000-0000", "CS");
//         System.out.println(e1.toString());
//     }
// }