package net.developia.www.di01;

public class LgTV implements TV {

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
		System.out.println("LGTV : 소리키움");
	}

	@Override
	public void soundDown() {
		System.out.println("LGTV : 소리낮춤");
	}

}
