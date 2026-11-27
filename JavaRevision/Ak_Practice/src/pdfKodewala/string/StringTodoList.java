package pdfKodewala.string;

public class StringTodoList {

	private final StringBuffer tasks;

	public StringTodoList() {
		tasks = new StringBuffer();
	}

	public void addTask(String task) {
		if (tasks.length() > 0) {
			tasks.append("\n");
		}
		tasks.append(task);
	}

	public void updateTask(String oldTask, String newTask) {
		int start = tasks.indexOf(oldTask);

		if (start != -1) {
			int end = start + oldTask.length();
			tasks.replace(start, end, newTask);
		}
	}

	public void removeTask(String task) {
		int start = tasks.indexOf(task);

		if (start != -1) {
			int end = start + task.length();

			if (end < tasks.length() && tasks.charAt(end) == '\n') {
				end++;
			} else if (start > 0 && tasks.charAt(start - 1) == '\n') {
				start--;
			}

			tasks.delete(start, end);
		}
	}

	public void displayTasks() {
		System.out.println(tasks);
	}
}
