package net.developia.www.di02;

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

	@Override
	public void sayIam() {
		if(fileOutput==null){
			System.out.println("그래, 난 "+name+", "+nick+"이지");
		}else{
			try {
				fileOutput.output("그래, 난 "+name+", "+nick+"이지");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
