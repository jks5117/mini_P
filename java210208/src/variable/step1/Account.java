package variable.step1;

public class Account {
	double kor  = 0;
	double math = 0;
	double eng  = 0;
	/*********************************************
	 * 총점을 구하는 메소드 입니다.
	 * @param kor2 - 학생의 국어 점수
	 * @param math2 - 학생의 수학 점수
	 * @param eng2 - 학생의 영어 점수
	 * @return tot - 한 학생의 세 과목의 총점을 구하여 담는 변수
	 *********************************************/
	private double hap(double kor2, double math2, double eng2) {
		double tot = 0;
		//insert here
		
		return tot;
	}
	/**************************************************
	 * 평균을 구하는 메소드 구현
	 * @param tot - hap메소드를 호출하여 tot를 받아온다.
	 * @return
	 ***************************************************/
		private double avg(double tot) {
		//insert here
		return 0;
	}
	public static void main(String[] args) {
		Account ac = new Account();
		ac.kor = 70;
		ac.math = 80;
		ac.eng = 90;
		double tot = ac.hap(ac.kor, ac.math, ac.eng);
		double test_avg = ac.avg(tot);
		double test_avg2 = ac.avg(tot);		
	}

}