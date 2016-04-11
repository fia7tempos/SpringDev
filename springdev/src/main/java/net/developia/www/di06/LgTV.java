package net.developia.www.di06;

import org.springframework.beans.factory.annotation.Autowired;

public class LgTV implements TV {
	
	@Autowired
	private Speaker speaker;

	@Override
	public void powerOn() {
		System.out.println("LGTV : TV 켭니다");
	}

	@Override
	public void powerOff() {
		System.out.println("LGTV : TV 끕니다");
	}

	@Override
	public void channelUp() {
		System.out.println("LGTV : 채널 올림");
	}

	@Override
	public void channelDown() {
		System.out.println("LGTV : 채널 내림");
	}

	@Override
	public void soundUp() {
		if(speaker==null){
			System.out.println("LGTV : 소리키움");
		}else{
			speaker.soundUp();
		}
	}

	@Override
	public void soundDown() {
		if(speaker==null){
			System.out.println("LGTV : 소리낮춤");
		}else{
			speaker.soundDown();
		}
	}

}
