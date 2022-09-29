import java.util.Scanner;

public class Ex11_Statement {

	public static void main(String[] args) {
		//반복문 (while, do~while)
		int i=0;
		while(i >= 10) {
			//반드시 
			//증가감을 명시
			i--;
			System.out.println("i : " + i);
		}
		
		//while 1~100 합
		int sum = 0;
		int j = 1;
		while(j <= 100) {
			sum++;
			j++;
		}
		System.out.println("sum : " + sum);
		
		//while로 구구단 출력
		i=2;
		j=1;
		while(i<=9) {
			j=1;
			while(j<=9) {
				System.out.printf("[%d]*[%d]=[%d]\n", i, j, i*j);
				j++;
			}
			System.out.println();
			i++;
		}
		
		//for(;;) { }
		//while(true) { if(조건)break; }
		//do ~ while : 일단 한번은 강제적으로 수행 .. 그리고 조건을 보고 판단
		//do {실행문 ... 값을 받아요} while (조건 판단)
		//메뉴 구성
		//점심 메뉴 선택
		//1. 짜장
		//2. 짬뽕
		//계속 3 입력, 메뉴가 다시 나오게 다시입력 받게...
		
		//프로그램 동작
		//당신이 원하는 메뉴 번호를 선택하세요 >> do .. 선택값 받아서
		//while(input > 2) 다시 입력하세요
		
		Scanner scan = new Scanner(System.in);
		int inputdata = 0;
		do {
			System.out.print("숫자를 입력해 (0~9) : ");
			inputdata = Integer.parseInt(scan.nextLine());
		}while(inputdata >= 10); //true가 되면 계속 do문을 실행
		
		
	}

}
