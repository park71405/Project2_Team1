
public class Ex10_Statement {

	public static void main(String[] args) {
		//제어문
		//조건문 : if(3가지), switch(조건) (case값 ... break)
		//반복문 : for(반복횟수가 명확), while(진위), do{ }~while()
		//분기문 : break(블록탈출), continue(아래 구문 skip)
		
		int count = 0;
		if(count < 1)
			System.out.println("true");
		
		char data = 'A';
		switch(data) {
			case 'A':
				System.out.println("문자 비교 같아요");
				break;
			case 'B':
				break;
			default:
				System.out.println("나머지 처리...");
		}
		
		//for문
		//1~100 누적합
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			System.out.println("i : " + i);
			sum += i;
		}
		System.out.printf("1~100 누적합 : %d\n", sum);
		
		//1~5까지 합
		int num = 5*((1+5)/2);
		System.out.println(num);
		
		//for문을 사용해 1~10까지 홀수 합 구하기
		//1 3 5 7 9
		int sum2 = 0;
		for(int i=1; i<10; i+=2) {
			sum2 += i;
		}
		System.out.println("sum1 홀수합 : " + sum2);

		//for 안에 if문을 사용해서 1~1000까지의 합을 구하기(짝수)
		int sum3 = 0;
		for(int i=1; i<= 1000; i++) {
			if(i%2 == 0) {
				sum3 += i;
			}
		}
		System.out.println("sum3 : " + sum3);
		
		//입사시험(구구단)
		//중첩 for ...
		//한개의 값을 고정 ... 반복 (2 1~9, 3 1~9, ....)
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j);
			}
			System.out.println();
		}
		
		//for + (분기문) continue, break
		//Today Point : continue(아래 구문 skip), break(for, while 블럭 탈출)
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i == j)
					break;
				System.out.printf("%s", "*");
			}
			System.out.println();
		}
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		//100부터 0까지 출력 .. 증가감 --i
		for(int i=100; i>=0; i--) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println();
		
		//피보나치 수열
		System.out.println("피보나치 수열");
		int a1 = 1;
		int a2 = 1;
		System.out.printf("%d %d ", a1, a2);
		int a3 = 0;
		
		for(int i=3; i<20; i++) {
			a3 = a1 + a2;
			System.out.print(a3 + " ");
			a1 = a2;
			a2 = a3;
			if(i%10 == 0) {
				System.out.println();
			}
		}
		
	}

}
