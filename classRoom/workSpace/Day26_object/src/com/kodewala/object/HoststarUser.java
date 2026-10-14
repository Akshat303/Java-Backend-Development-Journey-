package com.kodewala.object;

public class HoststarUser {
	String userId;
	String userName;
	String type;

	public static int liveCount = 0;

	public HoststarUser(String userId, String userName, String type) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.type = type;
	}

	public HoststarUser(String userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public HoststarUser() {
		super();
	}

	{
		liveCount = liveCount + 1;
	}

}
