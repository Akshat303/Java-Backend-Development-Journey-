package com.day37_interface.mediaPlayer;

public class AudioPlayer implements MediaPlayer {

	@Override
	public void play(String songTitle) {
		System.out.println("AudioPlayer: Now playing \"" + songTitle + "\"");
	}

	@Override
	public void stop() {
		System.out.println("AudioPlayer: Playback stopped.");
	}
}