package book.ch7;

public class TwoArray6 {

	public static void main(String[] args) {
		//2는 로우를 말함
		//3은 컬럼을 말함.
		int is[][] = new int[2][3];
		for(int i=0;i<is.length;i++) {
			for(int j=0;j<is[i].length;j++) {
				System.out.println("si["+i+"]["+j+"]="+is[i][j]);
			}////////////////////end of inner for
		}////////////////////////end of outter for
	}

}
