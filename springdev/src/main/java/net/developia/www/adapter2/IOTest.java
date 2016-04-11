package net.developia.www.adapter2;

public class IOTest {
	public static void main(String[] args) {
		String[] arr = {
				"스티브 잡스",
				"리누스 토발즈",
				"리처드 스톨맨", //gnu
				"피터 샘슨",
				"빌 고스퍼",
				"리처드 그린블러트",
				"로드 브리티쉬"
		};
		
		Adapter adapter = new AdapterImpl();
		adapter.input(arr);
		adapter.output();
	}
}
