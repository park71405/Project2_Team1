
public class Ex07_Operation {
	public static void main(String[] args) {
		//대입 연산자
		// += , -= , *= . /=
		
		int sum = 0;
		sum += 1;
		sum -= 1;
		System.out.println("sum : " + sum);
		
		//간단한 학점 계산기
		//학점 : A+, A-, B+, B-, ....F
		//점수 : 94점
		
		//판단기준 90점 이상인지 >> A 부여
		//판단 95점 이상 >> A+
		//아니라면 >> A-
		
		//84 일단 80점 이상 > B부여
		//판단 85점 이상 >> B+ 
		//아니면 B-
		
		//if문을 사용해서 학점 계산을 하세요
		int score = 78;
		String grade = "";
		System.out.println("당신의 점수는 : " + score);
		
		//if문 동작
		if(score >= 90) {
			grade = "A";
			grade += (score >= 95) ? "+" : "-";
		}else if(score >= 80) {
			grade = "B";
			grade += (score >= 85) ? "+" : "-";
		}else if(score >= 70){
			grade = "C";
			grade += (score >= 75) ? "+" : "-";
		}else {
			grade = "F";
		}
		//
		System.out.println("당신의 학점은 : " + grade);
		
	}
}
