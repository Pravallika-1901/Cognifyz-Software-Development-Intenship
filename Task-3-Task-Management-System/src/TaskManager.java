import java.util.*;

public class TaskManager {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n======================================");
            System.out.println("      SMART TASK MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Add New Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Search Task");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    searchTask();
                    break;
                case 6:
                    System.out.println("\nThank you for using Smart Task Management System.");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while(choice != 6);
        sc.close();
    }
    public static void addTask() {
        System.out.print("\nEnter Task: ");
        String task = sc.nextLine();
        tasks.add(task);
        System.out.println("\nTask Added Successfully!");
    }
    public static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("\nNo Tasks Available!");
            return;
        }
        System.out.println("\n========== TASK LIST ==========");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        System.out.println("===============================");
    }
    public static void updateTask() {
        if (tasks.isEmpty()) {
            System.out.println("\nNo Tasks Available!");
            return;
        }
        viewTasks();
        System.out.print("\nEnter Task Number to Update: ");
        int taskNo = sc.nextInt();
        sc.nextLine();
        if (taskNo >= 1 && taskNo <= tasks.size()) {
            System.out.print("Enter New Task: ");
            String newTask = sc.nextLine();
            tasks.set(taskNo - 1, newTask);
            System.out.println("\nTask Updated Successfully!");
        } else {
            System.out.println("\nInvalid Task Number!");
        }
    }
    public static void deleteTask() {
        if (tasks.isEmpty()) {
            System.out.println("\nNo Tasks Available!");
            return;
        }
        viewTasks();
        System.out.print("\nEnter Task Number to Delete: ");
        int taskNo = sc.nextInt();
        sc.nextLine();
        if (taskNo >= 1 && taskNo <= tasks.size()) {
            tasks.remove(taskNo - 1);
            System.out.println("\nTask Deleted Successfully!");
        } else {
            System.out.println("\nInvalid Task Number!");
        }
    }
    public static void searchTask() {
        if (tasks.isEmpty()) {
            System.out.println("\nNo Tasks Available!");
            return;
        }
        System.out.print("\nEnter Task to Search: ");
        String search = sc.nextLine();
        boolean found = false;
        System.out.println("\n========== SEARCH RESULT ==========");
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).toLowerCase().contains(search.toLowerCase())) {
                System.out.println((i + 1) + ". " + tasks.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Task Not Found!");
        }
        System.out.println("===================================");
    }
}
