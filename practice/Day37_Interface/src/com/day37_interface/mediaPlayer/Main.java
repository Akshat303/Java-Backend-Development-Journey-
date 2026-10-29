package com.day37_interface.mediaPlayer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter song title: ");
		String title = scanner.nextLine();

		// Interface reference pointing to implementation object (Polymorphism)
		MediaPlayer player = new AudioPlayer();

		player.play(title);
		player.stop();

	}
}