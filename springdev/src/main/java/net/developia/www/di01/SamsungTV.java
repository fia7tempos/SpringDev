package net.developia.www.di01;

public class SamsungTV implements TV {
	private Speaker speaker;
//	public SamsungTV() {
//		System.out.println("삼성TV 생성");
//	}
//	
//	public void init(){
//		System.out.println("삼성TV init()");
//	}
//	
//	public void destroy(){
//		System.out.println("삼성TV destroy()");
//	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	@Override
	public void powerOn() {
		System.out.println("Samsung : TV 켭니다");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung : TV 끕니다");
	}

	@Override
	public void channelUp() {
		System.out.println("Samsung : 채널 올림");
	}

	@Override
	public void channelDown() {
		System.out.println("Samsung : 채널 내림");
	}

	@Override
	public void soundUp() {
		if(speaker==null){
			System.out.println("Samsung : 소리키움");
		}else{
			speaker.soundUp();
		}
	}

	@Override
	public void soundDown() {
		if(speaker==null){
			System.out.println("Samsung : 소리낮춤");
		}else{
			speaker.soundDown();
		}
	}

}
