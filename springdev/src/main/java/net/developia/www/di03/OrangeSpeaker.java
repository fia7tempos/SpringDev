package net.developia.www.di03;

import org.springframework.stereotype.Component;

@Component("speaker")
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
