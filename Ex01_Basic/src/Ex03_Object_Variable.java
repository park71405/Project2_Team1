
//아파트 설계도
class Apt{ //설계도 == 데이터 타입(작은 타입을 모아 넣은 큰타입)
	int window;
	
}

//데이터 타입 변수명 ex) int number; > number 라는 변수는 타입에 맞는 값을 가짐
//Apt apt;

public class Ex03_Object_Variable {

	public static void main(String[] args) {
		
		int number = 100;
		
		//4byte 공간을 할당함
		Apt apt; 	//선언 Apt 타입 apt 변수
					//apt변수는 Apt타입의 값으로 주소값을 가짐
					//실제로 아파트를 메모리에 올려야 아파트 생성 그 주소가 생성됨
		apt = new Apt();	//heap 메모리에 아파트가 한채 만들어지고 그리고 주소가 생성되고
							//생성된 주소값을 apt 변수가 가짐
		
		System.out.println("apt 변수의 값 : " + apt);
		//apt 변수의 값 : Apt@626b2d4a
		//Apt + @ + 626b2d4a >> 설계도이름 + @ + 주소값 

		Apt apt2 = new Apt();
		
		System.out.println(apt == apt2);
		
		Apt apt3 = apt2; //주소값 할당
		System.out.println(apt3 == apt2);
		apt2.window = 20;
		
		System.out.println("apt3 : 창문의 수 : " + apt3.window);
		
		//값 타입과 주소 타입 증명
		/*
		 >>>>>>>
		 Ex03_Object_Variable 소스파일
		 javac Ex03_Object_Variable.java >> Ex03_Object_Variable.class 실행파일
		 java Ex03_Object_Variable 엔터
		 
		  JVM 동작 >> OS >> JAVA 메모리 구성 (구획정리) >> 자원 할당 (메모리) >> 프로그램 종료
		  >> 사용했던 메모리 OS반환 ... end
		  >>>>>>>>>
		  이클립스 통합 개발 툴 CTRL + f11 >>>>>>> 사이를 실행
		  
		  1. main 함수 안에 지역 변수는 반드시 초기화 하고 사용
		  2. 약속 >> main 함수 >> 시작점 >> 영역이 먼저 실행
		 */
	
	}

}
