package constructreDay12;

public class Driver {
	public static void main(String[] arg) {
		AccountHolder user1 = new AccountHolder("Akshat", 789925852, 741852963, 2560);
		AccountHolder user2 = new AccountHolder("Abhi", 745865, 562555, 36500);

		System.out.println(user1.name);
		System.out.println(user2.name);
	}
}