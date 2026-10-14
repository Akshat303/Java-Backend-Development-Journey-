package com.kodewala.object;

public class DriverHoststarUser {

	public static void main(String[] args) {
		
		for(int  i = 0; i<10; i++) {
			HoststarUser user1 = new HoststarUser("Guest","001");
		}
		
		System.out.println(HoststarUser.liveCount);

	}

}
