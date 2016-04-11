package net.developia.www.di04;

import java.io.File;
import java.io.FileWriter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileOutputImpl implements FileOutput{
	@Value("${fileName}")
	private String fileName;
	
	@Override
	public void output(String msg) throws Exception {
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file);
		fw.write(msg);
		fw.close();
	}

}
