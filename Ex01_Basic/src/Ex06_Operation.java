//import java.lang.*; 생략되어 있음
//쓰지 않아도 java.lang 폴더 안의 자원 그냥 사용가능


public class Ex06_Operation {
	public static void main(String[] args) {
		
		int result = 100 / 100;
		System.out.println(result);
		
		result = 13/2; //몫
		System.out.println(result);
		
		//나머지 연산자 : %
		result = 13 % 2;
		System.out.println(result);
		
		//증가, 감소 (증가감 연산자 : ++ 1씩 증가, -- 1씩 감소)
		int i = 10;
		++i; //전치증가
		System.out.println("전치 : " + i);
		
		i++; //후치증가
		System.out.println("후치 : " + i);
		//혼자는 전치, 후치의 의미가 없다.
		
		//Today Point (증가감 연산자 다른 연산자와 결합되면 전치, 후치)
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2;
		System.out.println("resut2 : " + result2 + " j2 : " + j2);
		//resut2 : 10 j2 : 5
		
		result2 = i2 + j2++;
		System.out.println("resut2 : " + result2 + " j2 : " + j2);
		//resut2 : 10 j2 : 6
		
		byte b = 100;
		byte c = 1;
		
		// byte d = b + c; 
		//  Type mismatch: cannot convert from int to byte
		//  java는 연산을 위해 기본 정수를 사용
		//  1번 해결 (연산시 4Byte 공간을 사용해 연산 int + int
		// byte d = (byte)(b + c); //손실이 나도 ....
		//  2번 해결
		int d = b + c; //결과의 타입 조정 (손실 발생x)
		System.out.println("d : " + d);
		
		//Today Point
		/*
		1. 정수의 모든 연산은 [int] 타입 변환 후 처리  
		    ex) byte + short => 컬파일러가 내부적으로 int + int 
		  		char + char  => 컴파일러가 내부적으로 int + int
		  	연산 처리 시
		  	정수 연산에서 int 보다 작은 타입은 int로 변환해 연산 (long 제외)
		  	
		  	char + int >> int + int
		  	int + long  >> long + long 예외적으로...
		  	
		  	정수 + 실수 >> 타입의 크기와 상관없이 >> 실수 승자
		 
		 */
		
		long ln = 10000000000L;
		float fl = 1.2f;
		//long lnresult = ln + fl;
		long lnresult = (long) (ln + fl); //손실발생
		System.out.println("lnresult : " + lnresult);
		//float lnresult = ln + fl;
		//System.out.println("lnresult : " + lnresult);
		
		float num2 = 10.45f;
		int num3 = 20;
		//num2 + num3
		float result5 = num2 + num3;
		System.out.println(result5);
		
		char c2 = '!';
		char c3 = '!';
		int result6 = c2 + c3;
		System.out.println(result6);
		
		//제어문
		//중소기업 시험문제 (구구단 출력) >> 삼각형 별찍기 >> 연습
		int sum = 0; //local variable
		for(int j=1; j<=100; j++) {
			//sum += j; //sum = sum + j;
			if(j % 2 == 0) { //짝수라면
				sum += j; //짝수의 합 (1~100)
			}
		}
		System.out.println("sum = " + sum);
		
		// == 연산자 (갑 비교하는 연산자)
		if(10 == 10.0f){ //타입을 비교하지 않고 값을 비교
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		// ! 부정 연산자
		if('A' != 65) {
			System.out.println("어 같지 않아 : true");
		}else {
			System.out.println("어 같은 값이야 : false");
		}
		
		//암기하자 (Today point)
		//연산자중에서 제어문 역할을 하는 ...녀석
		//삼항연산자
		int p = 10;
		int k = -10;
		int result8 = (p == k) ? p : k;
		
		//위 코드를 if문으로
		int result9 = 0;
		if(p == k) {
			result9 = p;
		}else {
			result9 = k;
		}
		
		//진리표
		//논리연산
		//0 : false
		//1 : true
		
		/*		OR 연산	, 	AND 연산
		 0 0	 0			 0			
		 0 1	 1			 0
		 1 0	 1			 0
		 1 1 	 1			 1
		  
		  비트 연산자
		  | or 연산자
		  & and 연산자
		  
		  논리 연산자
		  || or 연산
		  && and 연산
		 
		 */
		
		int x = 3;
		int y = 5;
		
		System.out.println("x|y : " + (x|y));
		/*
		 
		  십진수 -> 2진수(0, 1)
		  8bit
		  256 128 64 32 16 8 4 2 1
		  			  	   0 0 1 1 > 10진수 3을 -> 2진수
		  			  	   0 1 0 1 > 10진수 5를 -> 2진수
		  OR			   0 1 1 1 > 이진수 > 10진수 > 4+2+1 > 7
		  AND			   0 0 0 1 > 이진수 > 10진수 > 1
		 */
		System.out.println("x&y : " + (x&y));
		
		//Today Point( && (and) , || (or))
		//if(10 > 0 && -1 > 1 && 100 > 2 && 1> -1){ A }else{ B } *****
		//거짓이 나오는 순간 처리 됨
		//if(10 > 0 or -1 > 1 or 100 > 2 or 1 > -1){ A }else{ B }
		
		int data = 80;
		switch(data) {
			case 100 :
				System.out.println("100입니다.");
				break;
			case 90 :
				System.out.println("90입니다.");
				break;
			case 80 :
				System.out.println("80입니다.");
				break;
			default :
				System.out.println("해당하는 값이 없다.");
		}
		
		int month = 9;
		String res = ""; //빈 문자열 초기화
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				res = "31";
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				res = "30";
				break;
			case 2:
				res = "29";
				break;
			default:
				res = "월이 아닙니다.";
		}
		System.out.println(month + "월은 " + res + "일까지 입니다.");
		
		//난수 (랜덤값 : 임의의 추출값)
		//java (사용하고자하는 다양한 자원을 미리 생성해 둠 >> 찾아서 >> 사용 JAVA API)
		//도움말 (찾아서 ... 써라) api 문서
		//https://docs.oracle.com/javase/8/docs/api/index.html
		//원하는 자원을 찾아서 사용방법을 파악하고 처리 FM
		//java.lang.Math 클래스 찾음
		//public static double random()
		//equal to 0.0 and less than 1.0. 범위의 난수를 얻을 수 있음
		//결과 : double 실수 return 0.0 <= random < 1.0
		
		//원칙적 방법
		//쓰고자하는 자원이 있는 폴더를 open
		//import java.lang.* 	>> java 폴더 안에 lang 폴더 안에 있는 모든 자원 사용 가능
		
		System.out.println("Math.random() : " + Math.random());
		System.out.println("(Math.random() * 10) : " + (Math.random()*10));
		System.out.println("(int)(Math.random() * 10) : " + (int)((Math.random() * 10)+1));
		
		//1~10
		System.out.println("(int)(((Math.random() * 10)+1)*100) : " + (int)(((Math.random() * 10)+1)*100));
		System.out.println("");
		
		/*
		 우리는 백화점 경품 시스템을 만들려고 한다
   		경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
   		경품 추첨시 1000 점수가 나오면
   		경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지
   		경품 추첨시 900 점수가 나오면
   		경품으로  NoteBook , 냉장고 , 한우세트 , 휴지
   		경품 추첨시 800 점수가 나오면
   		경품으로  냉장고 , 한우세트 , 휴지
   		경품 추첨시 700 점수가 나오면
   		경품으로  한우세트 , 휴지
   		경품 추첨시 600 점수가 나오면
   		경품으로  휴지
   		그외 점수는 100 ~ 500 까지는 칫솔 
   		경품시스템의 점수 범위는 100 ~ 1000 점까지 한정되어 있다
   		사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다.
		 */
		
		int num10 =((int)(Math.random() * 1000)+1);
		//int num10 =((int)(Math.random() * 10)+1)*100;
		String st = "";
		switch(num10) {
			case 1000:
				st += "TV";
			case 900:
				st += " NoteBook";
			case 800:
				st += " 냉장고";
			case 700:
				st += " 한우";
			case 600:
				st += " 휴지";
				break;
			default:
				st += " 칫솔";
		}
		System.out.println(num10 + ", "+ st);
		
		//switch(조건) 
		//조건식은 문자열도 가능, 문자 가능
		
		String m = "F";
		String f = "";
		switch(m) {
			case "A":
			case "B":
			case "C":
			case "D":
			case "E":
			case "F":
			case "G": f = "ok";
				break;
			case "H":
			case "k": f = "no";
				break;
			default: f = "no data";
				break;
		}
		System.out.println("결과 : " + f);
		
	}
}
