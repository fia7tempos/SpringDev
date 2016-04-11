package net.developia.www.adapter1;

public class SampleLibImpl implements SampleLib{
	Adaptee adaptee = new Adaptee();
	@Override
	public void request() {
		adaptee.specificRequest();		
	}

}
