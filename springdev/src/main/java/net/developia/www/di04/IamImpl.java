package net.developia.www.di04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IamImpl implements Iam {
	@Value("${name}")
	private String name;
	@Value("${nick}")
	private String nick;
	
	@Autowired
	@Qualifier("fileOutputImpl")
	private FileOutput fileOutput;
	
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
