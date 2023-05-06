import java.util.Scanner;

class MainProgram{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String selection;

        Person p1 = new Person("Jaime", "Amherst", "000-000-0000");
        Persons ps1 = new Persons();

        do {
            System.out.println("Enter option from list below: ");
            System.out.println("   1) Display complete directory");
            System.out.println("   2) Enter new person");
            System.out.println("   3) Search for person");
            System.out.println("   4) Modify person information");
            System.out.println("   5) Delete a record");
            System.out.println("   Q) Quit");
            System.out.print("Enter your option: ");

            selection = scan.next();

            switch (selection){
                case "1":
                    System.out.println("一");
                    System.out.println();
                    break;
                case "2":
                    enterNewPerson(ps1);
                    System.out.println("二");
                    break; 
                case "3":
                    System.out.println("三");
                    break; 
                case "4":
                    System.out.println("四");
                    break;
                case "5":
                    System.out.println("五");
                    break;   
                case "Q":
                    System.out.println("終止");
                }
        } while (!"Q".equals(selection));
    }

    public static void enterNewPerson(Persons P, Scanner scanner) {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        System.out.println("Enter phone: ");
        String phone = scanner.nextLine();
        scanner.nextLine(); // consume the newline character
        System.out.println("Is the person a student? (y/n)");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            System.out.println("Enter graduation year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            Student personCreated = new Student(name, address, phone, year);
        }
        else {
            System.out.println("Is the person an employee? (y/n)");
            String answer1 = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("Enter department: ");
                String department = scanner.nextLine();
                scanner.nextLine();
                Employee personCreated = new Employee(name, address, phone, department);
            }
            else{
                Person personCreated = new Person(name, address, phone);
            }
        }
    }
}
