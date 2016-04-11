package net.developia.www.di08;

public class IamImpl implements Iam {
	private String name;
	private String nick;
	private FileOutput fileOutput;

	public void setFileOutput(FileOutput fileOutput) {
		this.fileOutput = fileOutput;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public IamImpl(){
	}

	public IamImpl(String name, String nick, FileOutput fileOutput) {
		super();
		this.name = name;
		this.nick = nick;
		this.fileOutput = fileOutput;
	}

	@Override
	public void sayIam() {
		System.out.println("그래, 난 " + name + ", " + nick + "이지");
		try {
			fileOutput.output("그래, 난 " + name + ", " + nick + "이지");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
