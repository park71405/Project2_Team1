//라인 주석
/*
 블럭 주석
 
 Ex02_Variable >> 클래스 >> 설계도 >> 데이터 타입
 
 클래스 종류
 1. class Car { } >> 독자적인 실행이 불가능 >> 다른 클래스(설계도) 참조하는 클래스 >> main함수 (x)
 2. class Car { public static void main(String[] args) { }} >> 독자적으로 실행가능한 클래스 
 2.1 static void main(String[] args) >> main 이름을 가지는 함수 >> 프로그램 시작점, 진입점 > 실행(약속)
 
 Tip)
 C# 언어 >> public static void Main(String[] args)
 
 변수 : variable
 	데이터(자료) 담을 수 있는 공간 이름 {메모리}
 	공간(크기) : 데이터 타입(자료형) >> 메모리 공간이 한정됨 >> 최소 공간 최대 데이터
 	
 데이터 타입 변수명 >> int i = 100

public class 클래스 이름 {
	public static void main(){ 
		안에 있는 변수를 (지역변수)
		int num = 100; //초기화 사용
	}
}


변수가 선언되는 위치 (scope : 유효범위)
1. instance variable : 객체 변수 >> class Car { int number = 2000; }
2. local variable 	 : 지역변수(함수 안에) >> class Car { public void run() { int speed = 0; } }
3. 함수 안에 제어 블럭(if, for) 안에 있는 변수(블럭) >> class Car { public void run() { for(int i=0... } }
4. static variable : 공유 자원(객체간) >> class Car { public static num=100; }

*/

//class 설계도이다 == class Type이다 (여러개의 의미있는 작은 타입을 가지는 큰 타입) : 사용자 정의 타입 

//자바는 하나의 물리적인 파일 안에 여러개의 클래스를 사용 가능... (연습용으로)
//실 개발할 때는 ... 하나의 파일에 하나의 클래스 사용이 일반적

class Car{ //설계도를 사용하기 위해서는 구체화 ... 메모리 위에 생성 (연산자 new)
	int iv = 100; 	//instance variable
	int window;		//instance variable은 초기화를 하지 않아도 됨
					//내부적으로 기본값(default)를 가짐 : 0 >> int window = 0
	/*
	 초기화 : 변수가 처음 값을 갖는 것(할당을 통해서)
	 질문 : why int window 이런 객체 변수는 초기화를 하지 않아도 문제가 생기지 않음
	 자동차를 만들때 int window=4개 창문 4개...
	 
	 Car 라는 설계도를 가지고
	 Car 쌍용차 = new Car(); 자동차를 만드는 행위
	 쌍용차.window = 10;
	 
	 Car 삼성차 = new Car();
	 삼성차.window = 2;
	 생산되는 자동차마다 창문의 개수를 달리할 수 있다.
	 
	 */
	
	public void stop() {
		//별도의 지역
		window = 100;
		//speed = 200; 선언시 문제점 파악 가능
	}
	public void start() {
		int speed = 100;
	}
}

public class Ex02_Variable {

	public static void main(String[] args) {
		// 시작점
		//main 함수 안에 코드가 있어야 실행된 결과를 볼 수 있다
		int lv = 100;
		System.out.println("lv 지역변수 : " + lv);
		
		int number = 0; // 선언과 동시에 초기화
		number = 100;
		number = 200;
		System.out.println("number : " + number);
		
		int a; //선언
		int b; //선언
		//System.out.println(a);
		//The local variable a may not have been initialized
		//main( ) { 함수 안에 있는 변수는 지역변수라 하는데 이 지역변수를 초기화하지 않으면 사용 불가}
		
		b = 200; // 초기화
		System.out.println("b 변수 초기화 : " + b);
		
		int c, d; //선호하진 않음 >> 개발자 >> Array(배열) >> int[] i...
		
		//key point
		//local variable (함수 안에 있는 변수 : main() { 안에 있는 변수 }
		//반드시 초기화 필요
		
		int k = 100; //지역변수는 선언과 동시에 초기화 하는 습관
		
		Car scar = new Car(); 	//scar라는 자동차 생산 ... (현실 아파트를 지은 것)
								//java가 OS에게 할당받은 메모리 영역에 만들어 진것
		
		//////////////////////////////////////
		// int k = 500; 같은 지역 내에서 같은 변수 명 존재x
		
		
		int f = 100; // f라는 변수는 100이라는 값을 가지고 있다
		int f2 = f;
		System.out.println("f : " + f);
		System.out.println("f2 : " + f2);
		//f변수의 값을 2000변경시  ... f2값은 영향x
		
	}

}
