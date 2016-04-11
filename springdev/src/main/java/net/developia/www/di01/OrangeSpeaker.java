package net.developia.www.di01;

public class OrangeSpeaker implements Speaker{

	@Override
	public void soundUp() {
		System.out.println("OrangeSpeaker 소리 키움");
	}

	@Override
	public void soundDown() {
		System.out.println("OrangeSpeaker 소리 낮춤");
	}

}
