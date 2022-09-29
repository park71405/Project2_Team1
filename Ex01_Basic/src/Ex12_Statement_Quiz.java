import java.util.Scanner;

public class Ex12_Statement_Quiz {

	public static void main(String[] args) {
		
		
		boolean auto = true;
		int balance = 0; //잔액
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("*****************");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("*****************");
			
			System.out.print("선택하세요 : ");
			int input = Integer.parseInt(scan.nextLine());
			
			//판단
			switch(input) {
				case 1:
					System.out.println("예금처리..");
					balance += Integer.parseInt(scan.nextLine());
					break;
				case 2:
					System.out.println("출금처리..");
					balance -= Integer.parseInt(scan.nextLine());
					break;
				case 3:
					System.out.println("잔고..");
					break;
				case 4:
					System.out.println("종료합니다.");
					auto = false;
					break;
				default:
					System.out.println("올바른 메뉴를 선택하세요.");
			}
			
			if(auto == false) {
				break; 
			}
			
		}

	}

}
