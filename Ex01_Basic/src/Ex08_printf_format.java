import java.util.Scanner;

public class Ex08_printf_format {

	public static void main(String[] args) {
		
		System.out.println(); //출력하고 줄바꿈(엔터)
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.println();
		System.out.print("C");
		System.out.println();

		int num = 100;
		System.out.println(num);
		System.out.println("num 같은" + num + " 입니다.");
		
		//형식 format
		System.out.printf("num 같은 %d 입니다.\n", num);
		System.out.printf("num 같은 [%d] 입니다 또 [%d]도 있어요 \n", num, 12345);
		//format 형식문자
		/*
		 %d 10진수 형식 정수
		 %f 실수
		 %s 문자열
		 %c 문자
		 \t tab , \n 줄바꿈  
		 */
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f변수값 %f 입니다. \n", f);
		
		//입력받기 (cmd) 사용자가 입력한 값을
		
		Scanner scan = new Scanner(System.in);
		String value = scan.nextLine(); 
		//입력하고 엔터를 칠때까지 대기 (프로그램 종료 되지않고 계속 대기)
		//입력한 값을 문자열 전달해주어요
		//System.out.println(value);
		
		//int number = scan.nextInt();
		//System.out.println("number : " + number);
		
		
		//float number = scan.nextFloat();
		//System.out.println("number : " + number);
		
		//권장 사항 : nextInt, nextFloat, 보다는 nextLine()으로 read하고 변환
		//Today Point
		
		//[문자를] => 숫자로 (정수, 실수)
		//Integer.parseInt("1111"); ->> 정수 ->> 1111
		//Float.parseFloat("3.14"); ->> 실수 ->> 3.14
		
		System.out.println("숫자를 입력하세요");
		int number = Integer.parseInt(scan.nextLine());
		System.out.println("정수값 : " + number);
		
		
	}

}
