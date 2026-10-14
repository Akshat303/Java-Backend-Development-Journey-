package pdfKodewala.string;

public class StringBuilderPractice {

	public static void main(String[] args) {

		StringBuilder name = new StringBuilder("Java");
		name.append(" Developer");

		System.out.println(name);
//		------------------------------------------

		StringBuilder sb = new StringBuilder();

		System.out.println("Length: " + sb.length());
		System.out.println("Capacity: " + sb.capacity());

		sb.append("Java");

		System.out.println("Updated length: " + sb.length());
		System.out.println("Updated capacity: " + sb.capacity());

		sb.ensureCapacity(50);

		System.out.println("After ensureCapacity: " + sb.capacity());

//        -------------------------------------------------

		String user = "Akshat";
		StringBuilder response = new StringBuilder();

		response.append("Welcome, ");
		response.append(user);
		response.append("! Your Java session is ready.");

		System.out.println(response);
//		------------------------------------------------
		String department = "IT";
		int salary = 50000;
		String joiningDate = "2020-01-01";

		StringBuilder query = new StringBuilder("SELECT * FROM employees WHERE 1=1");

		if (department != null && !department.isBlank()) {
			query.append(" AND department = '");
			query.append(department);
			query.append("'");
		}

		if (salary > 0) {
			query.append(" AND salary > ");
			query.append(salary);
		}

		if (joiningDate != null && !joiningDate.isBlank()) {
			query.append(" AND joining_date >= '");
			query.append(joiningDate);
			query.append("'");
		}

		System.out.println(query);

	}

}
