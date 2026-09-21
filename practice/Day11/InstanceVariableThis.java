class InstanceVariable {
	 int balance ;
	 public InstanceVariable(){
	 this.balance = 100; 
	 }
	 
	 public static void main (String[] args) {
		 InstanceVariable instVar = new InstanceVariable();
		 
		 System.out.println("Balance : " + instVar.balance);
	 }
}