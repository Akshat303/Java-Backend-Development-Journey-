package om.kodewala.sbQuery;

public class QueryGenerator {

	public StringBuilder generateQuery(int salary, String empId) {

		StringBuilder query = new StringBuilder("Select * from employee"); // create sb object

		if (salary > 0) {
			query.append(" Where salary = " + salary + ";"); // modifying existing object

		} else if (empId != null) {
			query.append(" Where empId = " + empId + ";"); // modifying existing object

		} else {
			query.append(";"); // modifying existing object
		}

		return query;
	}

}