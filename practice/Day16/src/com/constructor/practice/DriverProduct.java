package com.constructor.practice;

public class DriverProduct {

	public static void main(String[] args) {

		GameProduct gameProductInfo = new GameProduct("GTA V", 140699.00, "GTA101", "Video Game",
				"Open-world action game", 25, 4.3, true, "Action", "PC");

//		Default all product attribute call sysoDefault() for print
		gameProductInfo.sysoDefault();
		
//		specific  product attribute call displayGame() for print 
		gameProductInfo.displayGame();
	}

}
