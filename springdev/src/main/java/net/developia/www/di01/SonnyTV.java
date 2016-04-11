package net.developia.www.di01;

public class SonnyTV implements TV {
	private Speaker speaker;
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void powerOn() {
		System.out.println("소니TV 전원 킴");
		
	}

	@Override
	public void powerOff() {
		System.out.println("소니TV 전원 끔");
		
	}

	@Override
	public void channelUp() {
		System.out.println("소니TV 채널 올림");
		
	}

	@Override
	public void channelDown() {
		System.out.println("소니TV 채널 내림");
		
	}

	@Override
	public void soundUp() {
		if(speaker==null){
			System.out.println("소니TV 소리키움");
		}else{
			speaker.soundUp();
		}
			
		
	}

	@Override
	public void soundDown() {
		if(speaker==null){
			System.out.println("소니TV 소리낮춤");
		}else{
			speaker.soundDown();
		}
	}
	

}
