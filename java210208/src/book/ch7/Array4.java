package book.ch7;
/* 배열과 메소드 오버로딩 확인
 * 1. 반드시 파라미터의 개수가 달라야 한다.
 * 2. 반드시 파라미터의 타입이 달라야 한다.
 * 
 * 주의사항
 * 1.리턴타입이 있고 없고는 영향이 없다.
 * 2.접근제한자가 있고 없고 또는 다른 것은 영향이 없다.
 */
public class Array4 {
	
	double ds[], d2;
	double[] d3, d4;
	void methodA() {
		ds = new double[3];
		ds = 3.16;
		d2 = 2.12;
		d2 = 3.14;
		//d3 = new double[2];
		d4 = 5.1;
		d3 = 3.15;
	}

	public static void main(String[] args) {
		Array4 a4 = new Array4();
		a4.methodA();
	}

}
