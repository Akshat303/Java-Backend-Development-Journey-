package pdfKodewala.string;

public class MainstringTodoList {

	public static void main(String[] args) {

		StringTodoList todo = new StringTodoList();

		todo.addTask("Buy groceries");
		todo.addTask("Finish homework");
		todo.addTask("Call the plumber");

		System.out.println("To-Do List:");
		todo.displayTasks();

		todo.updateTask("Finish homework", "Finish homework - Updated");

		System.out.println("\nUpdated List:");
		todo.displayTasks();

		todo.removeTask("Call the plumber");

		System.out.println("\nAfter Removing a Task:");
		todo.displayTasks();
	}
}
