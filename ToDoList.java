package todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    // Task class to represent each to-do item
    static class Task {
        String description;
        boolean isDone;

        Task(String description) {
            this.description = description;
            this.isDone = false;
        }

        @Override
        public String toString() {
            return (isDone ? "[✔] " : "[ ] ") + description;
        }
    }

    // List to store tasks
    static ArrayList<Task> tasks = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            choice = getIntInput("Choose an option: ");
            switch (choice) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> markTaskCompleted();
                case 4 -> deleteTask();
                case 5 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid option. Try again.");
            }
        } while (choice != 5);
    }

    private static void printMenu() {
        System.out.println("\n== TO-DO LIST MENU ==");
        System.out.println("1. Add a Task");
        System.out.println("2. View All Tasks");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Delete a Task");
        System.out.println("5. Exit");
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        tasks.add(new Task(description));
        System.out.println("Task added.");
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Your to-do list is empty.");
            return;
        }
        System.out.println("\nYour Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    private static void markTaskCompleted() {
        viewTasks();
        if (tasks.isEmpty()) return;
        int index = getIntInput("Enter task number to mark as completed: ") - 1;
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).isDone = true;
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void deleteTask() {
        viewTasks();
        if (tasks.isEmpty()) return;
        int index = getIntInput("Enter task number to delete: ") - 1;
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static int getIntInput(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        int input = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        return input;
    }
}
