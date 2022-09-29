import java.util.Scanner;

//사칙연산(+, -, *, /)
/*
 화면
>입력값:숫자
>입력값(기호): +
>입력값:숫자 
>연산결과 :200
  
 */

public class Ex09_Operation_Ouiz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">입력값: ");
		int num = Integer.parseInt(scan.nextLine());
		
		System.out.print(">입력값(기호): ");
		String str = scan.nextLine();
		
		System.out.print(">입력값: ");
		int num1 = Integer.parseInt(scan.nextLine());
		
		int sum = 0;
		
		if(str.equals("+")) {
			sum = num + num1;
		}else if(str.equals("-"))
			sum = (num > num1) ? num-num1 : num1-num;
		else if(str.equals("*"))
			sum = num * num1;
		else if(str.equals("/"))
			sum = (num > num1) ? num/num1 : num1/num;
		
		System.out.println(">연산결과: " + sum);
	}

}
