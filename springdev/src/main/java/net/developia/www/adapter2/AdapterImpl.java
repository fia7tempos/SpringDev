package net.developia.www.adapter2;

public class AdapterImpl implements Adapter{
	IO io = new IO();

	@Override
	public String output() {
		return io.output();
	}

	@Override
	public void input(String[] str) {
		for(int i=0;i<str.length;i++){
			io.addItem(str[i]);
		}
	}

}
