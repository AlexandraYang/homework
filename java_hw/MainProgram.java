import java.util.Scanner;

class MainProgram{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String selection;

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
                    enterNewPerson(ps1, scan);
                    break;
                case "3":
                    System.out.println("Enter the name that you want to search");
                    scan.nextLine();
                    String letter = scan.nextLine();
                    ps1.search(ps1.getArrayList(),letter);
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

        // close scan
        scan.close();
    }

    public static void enterNewPerson(Persons P, Scanner scanner) {
        scanner.nextLine();
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
            P.add(personCreated);
            // ALEX DEBUG
            System.out.println("Student " + name + " " + address + " " + phone + " " + year +  "is added");
        }
        else {
            System.out.println("Is the person an employee? (y/n)");
            String isEmployee = scanner.nextLine();
            if (isEmployee.equalsIgnoreCase("y")) {
                System.out.println("Enter department: ");
                String department = scanner.nextLine();
                scanner.nextLine();
                Employee personCreated = new Employee(name, address, phone, department);
                P.add(personCreated);

                // ALEX DEBUG
                System.out.println("Employee " + name + " " + address + " " + phone + " " + department + " is added");

            }
            else{
                Person personCreated = new Person(name, address, phone);
                P.add(personCreated);
                // ALEX DEBUG
                System.out.println("Person " + name + " " + address + " " + phone + " " + " is added");
            }
        }
    }
}
