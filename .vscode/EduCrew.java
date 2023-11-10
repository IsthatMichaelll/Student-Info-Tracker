import java.util.Scanner;

public class EduCrew {

    public static void main(String[] args) {
        EduCrew rosterSystem = new EduCrew();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Student Roster System");
            System.out.println("1. Teacher");
            System.out.println("2. Student");
            System.out.println("3. Exit");

            int roleChoice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (roleChoice) {
                case 1:
                    // Teacher Menu
                    handleTeacherMenu(rosterSystem, scanner);
                    break;
                case 2:
                    // Student Menu
                    handleStudentMenu(rosterSystem, scanner);
                    break;
                case 3:
                    System.out.println("Exiting system.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void handleTeacherMenu(EduCrew system, Scanner scanner) {
        while (true) {
            System.out.println("1. Create Class");
            System.out.println("2. View Classes");
    }
    }
    private static void handleStudentMenu(EduCrew system, Scanner scanner) {
        while (true) {
            System.out.println("\nStudent Roster System");
            System.out.println("1. Add Student");
            System.out.println("2. Search for Student");
            System.out.println("3. Assign Work");
            System.out.println("4. Grade Assignment");
            System.out.println("5. Remove Student");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                
                    // Read student details from user and add to roster
                    break;
                case 2:
                
                    // Read student ID from user and search in roster
                    break;
                case 3:
                
                    // Read faculty, student, and assignment details and assign work
                    break;
                case 4:
        
                    // Read student, assignment and grade details, and grade the assignment
                    break;
                case 5:
            
                    // Read student ID from user and remove from roster
                    break;
                case 6:
                    System.out.println("Exiting system.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
    }
}
}