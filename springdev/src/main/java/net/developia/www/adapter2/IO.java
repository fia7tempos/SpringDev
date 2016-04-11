package net.developia.www.adapter2;

import java.util.ArrayList;
import java.util.List;

public class IO {
	List list = new ArrayList();
	
	
	public void addItem(String str){
		list.add(str);
	}
	public String output(){
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<list.size();i++){
			sb.append("***"+list.get(i)+"***\n");
		}
		return sb.toString();
	}
}
