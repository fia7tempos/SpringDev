package net.developia.www.di01;

public class MarshallSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("MarshallSpeaker 소리 키움");
		
	}

	@Override
	public void soundDown() {
		System.out.println("MarshallSpeaker 소리 낮춤");
		
	}

}
