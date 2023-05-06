public class Student extends Person{

    private Integer year;

    public Student(String newName, String address, String phone, Integer year){
        super(newName, address, phone);
        this.year = year;
    }
    public void setGraduationYear(Integer year){
        this.year = year;
    }
    public Integer getGraduationYear(){
        return this.year;
    }
    public String toString(){
        return super.toString() + ", Graduation year: " + getGraduationYear();
    }
}  

// class Print{
//     public static void main(String[] args){
//         Student s1 = new Student("Jaime", "Amherst", "000-000-0000", 2000);
//         System.out.println(s1.toString());
//     }
// }