package net.developia.www.di02;

import java.io.File;
import java.io.FileWriter;

public class FileOutputImpl implements FileOutput{
	private String fileName;
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void output(String msg) throws Exception {
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file);
		fw.write(msg);
		fw.close();
	}

}
