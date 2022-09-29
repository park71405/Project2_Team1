
/*

1. �ڹٰ� �����ϴ� �⺻ Ÿ��(�ý��� Ÿ��: ���� Ÿ��) >> 8����
2. 8���� �⺻ Ÿ�� [���� ����]�ϴ� Ÿ��

3. ���� 	> ���� > (���� ����, 0, ���� ����) byte (8bit = 1byte) -128 ~ 127
									char  �� ���ڸ� ǥ���ϴ� �ڷ��� (������, Ư������, ����) 1byte
											�ѱ� 1�� > 2byte
											����) char (2byte) : �ѱ�, ������, Ư������, ����.
												 ũ�⿡ ��� ���� 2byte�� ǥ�� >> unicode >> �ƽ�Ű �ڵ�ǥ
											ex) char c = 'A' , char c2 = '��'
									short (c��� ȣȯ��)
									int (-21 ~ 21�� ���� : 4byte) *** ������ �⺻ Ÿ�� ***
									long (8byte)
	   	
	   	> �Ǽ� (�ε��Ҽ���) float (4byte)
	   					double (8byte) >> ���е� ����(ǥ�� ������ ũ��) *** �Ǽ��� �⺻ Ÿ�� ***
	   		
	�� > ��, ���� > true, false	boolean
	
����� ����....
������ int Ÿ��... �Ǽ��� double Ÿ�� ����ϸ� �� ���� ����	

���� ���� ���� ������ : ���ڿ� >>> ȫ�浿, ������, �ȳ��ϼ��� ... 
*** ���ڿ��� ǥ�� *** "ȫ�浿", "�ȳ��ϼ���"

String name = "ȫ�浿"; >> String Ŭ���� (���� Ÿ��) String str = new String();

** ������ ��� ������ String�� ��Ÿ�� ó�� ��� (int, double)ó��

�⺻ Ÿ�� 8�� + String >> 9������ ������ ������ ǥ��

�ڹ�Ÿ��
1. ��Ÿ�� : 8���� �⺻ Ÿ�� > int i = 100; int j = 200;....			value type
2. ����Ÿ��(�ּҰ�) : Ŭ����, �迭 : ������ ���� ����Ǵ� ���� �ƴ϶� �ּҰ��� ���� 	ref type


 */


//class == ���赵 == Data Type
class Car2 { //Car2�� ������ ����, Car2���赵 �̴� >> ��üȭ >> �޸� (new)
	String color;
	int window;
}

public class Ex04_DataType {

	public static void main(String[] args) {
		String str = "ȫ�浿"; //���ڿ� �����͸� ���� �� �ִ� Ÿ��
		int age = 100;
		
		Car2 c; //c�� main �Լ� �ȿ� �ִ� ���� ����
		//System.out.println(c); //�������� �ʱ�ȭ ���� �Ұ���
		//c��� ������ �ʱ�ȭ�� >> �ּҰ��� ������ �ϴ� �� >> new �����ڸ� ���ؼ� �޸𸮿� �ּ� �Ҵ�
		c = new Car2();
		System.out.println("c�� �ּҰ� ��� : " + c); //Car2@626b2d4a
		
		//����� �ʱ�ȭ
		Car2 c2 = new Car2();
		c2.window = 100;
		c2.color = "gold";
		
		int i = 10;
		
		int j;
		j = 20;
		
		int k;
		k = j; //POINT (�� �Ҵ�, j������ ������ ���� k���� �Ҵ�)
		System.out.println("k: " + k); // 20
		k = 300;
		System.out.println("k: " + k); // 300
		System.out.println("j���� ��ȭ ���� : " + j); // 20
		
		//int p, q, g; //���� ����
		//�̷� ���� Array : int[] arr = new int[3];
		
		//int (-21�� ~ 21��)
		int p = 100000000;
		//int p2 = 10000000000;
		//The literal 10000000000 of type int is out of range *literal : �Է���
		//�����ڰ� ���� �Է��ϴ� �� (�ִ� �״��) ���� ���� int�� ��� ó��
		//���� 4byte�� ���� ��� �ִµ� ū���� �Է��ϸ� ���� �� ����
		// 1. �ذ���
		long l = 10000000000l; //���ͷ� ���� long ��� �Ҵ�
		long l2 = 100; //100 ���Ͱ��� int �׸��ȿ�
		//���� Ÿ�԰��� ū Ÿ�Կ� �ִ� �� ����x
		
		int p2 = (int) 10000000000l; //ĳ���� >> Ÿ�� ��ȯ
		System.out.println(p2);
		//������ �ذ� ����� �ƴ� >> ������ �� ����
		
		//int p3 = 1000l;
		int p3 = (int)1000l; // ĳ������ ���ؼ� Ÿ�� ��ġ
		System.out.println(p3);
		
		//char 2byte ������
		//�� ���ڸ� ǥ���ϱ� ���� ���� �ڷ���
		//������, Ư������, ����, �ѱ��� �ѹ��ڷ� ǥ��
		//���ڿ� : ������ ���� : "ȫ�浿" 	String name = "ȫ�浿";
		//���� : �� ���� : 'a'			char ch = "ȫ";
		
		char single = 's';
		System.out.println(single);
		//char s = 'AB';  //����, ������ �Ұ�
		//Invalid character constant
		
		//char ���� Ÿ��
		//char ���ڸ� ���������� ���������� �������� ������ ����
		//�������� �ƽ�Ű �ڵ�ǥ�� ������� ��
		//���� ȣȯ ����
		int intch = 'A'; //int intch = (int)'A';
		//���������� �ڵ� ����ȯ �߻� >> �Ͻ���(������) ����ȯ
		System.out.println("intch : " + intch);
		
		char ch2 = 'a';
		System.out.println(ch2);
		int intch2 = (int)ch2;
		System.out.println(intch2);
		//A = 65, a = 97
		
		int intch3 = 65;
		char ch3 = (char)intch3; //char�� 2byte�� intch3�� 4byte
		System.out.println(ch3);
		
		//���� ���� (�Ҵ翡 �־ ���� ��������, ���� ��� �ִ� Type�� ����
		//������ ����ȯ, �Ͻ��� ����ȯ ����
		//����, ����� ����ȯ�� �������� ��
		//key point : ����ȯ�� �ս� ������ ���
		//���� �ߴ� ��ó��....
		//ū ���� ���� ������ ����ȯ �� ������ �ս� 
		
		/*
		 
		  Today point
		  1. �Ҵ��ؼ� ������ ������ �ִ� ���� ���� ���� ������ Ÿ���� ����
		  2. ������ Ÿ�� ũ�⸦ Ȯ������
		  3. ū Ÿ�Կ��� ���� Ÿ�� ���� ���� �� �ִ�
		  4. ���� Ÿ�Կ� ū Ÿ���� �ְ� �ʹٸ�, ���� casting
		  		������ �ս��� �����ؾ� ��
		  		char << int ������ char << (char) int
		  		int << char ���� x, ���������� �����Ϸ��� int << (int)char�� ó��
		 
		 */
		
		//String ���ڿ��� ���� �� �ִ� Ÿ��
		//���� ��� : int, double ó�� ���
		String name = "hello world";
		System.out.println(name);
		
		String name2 = name + "�氡�氡";
		System.out.println(name2);
		//syso ctrl+space
		
		// + > �������, ���� ����
		//Tip) Oracle DB (���)	> + ��� ����, || ���� ����
				//ex) '�ȳ�' || '�氡'
		
		//Tip) Java���� Ư�� ���� ó��
		//�̽������� ���� : Ư�� ���� �տ� \
		//char sing = '''; //���� �߻�
		char sing = '\''; // \ �� ���ؼ� ' �� ������ ���� ǥ��
		System.out.println(sing);
		
		// ȫ"��"�� 
		String name3 = "ȫ\"��\"��";
		System.out.println(name3);
		
		String str3 = "1000";
		String str4 = "10";
		String result = str3 + str4;
		System.out.println(result);	//100010
		
		System.out.println("100" + 100);
		System.out.println(100 + "100");
		System.out.println(100 + 100 + "100");
		System.out.println(100 + (100 + "100"));
		System.out.println(100 + "100" + 100);
		
		String path = "C:\\Temp";
		System.out.println(path);
		
		//\t >> tab, 	\n >> �ٹٲ�
		
		//�Ǽ��� (�ε��Ҽ���)
		//float 4byte
		//double 8byte, �Ǽ� ���ͷ��� �⺻ Ÿ���� double
		
		//float f = 3.14; //Type mismatch: cannot convert from double to float
		//float f = (float) 3.14; ������ �ս� �߻� ����
		//float f = 3.14f;
		
		double f = 3.14; //���� �׸��� ũ��
		
		float f2 = 1.123456789f; //float Ÿ�Կ� ��� �ʹٸ� ������ ���̻� f, F
		//�뷫 7�ڸ� �Ҽ� ǥ�� ����
		//�ݿø� default
		System.out.println("f2 : " + f2);
		//1.1234568
		
		double d = 1.123456789123456789;
		//�뷫 16�ڸ� �Ҽ� ǥ�� ����
		//�ݿø� default
		System.out.println("d : " + d);
		//1.1234567891234568
		
	
		System.out.println((byte)128); //128 byte ǥ�� �ȵ�
		//byte Ÿ�� : -128 ~ 127 //overflow ��ȯ
		
		//������ �Ǽ�
		double d2 = 100; //���������� �����Ϸ��� ����ȯ
		System.out.println(d2); //100.0
		
		double d3 = 100;
		int i5 = 100;
		//int result2 = (int) (d3 + i5); ������ �ս� �߻� ����
		double result2 = d3 + i5; //������ �ս� �߻� x
		//Today point
		//1. ū Ÿ�� + ���� Ÿ�� >> ū Ÿ��
		//2. Ÿ�� ���� ��ȯ >> ������ ������ ���� ���� ���� ������ Ÿ���� ���� �Ǵ�
		//3. ����� ����ȯ �� �ս� ������ ���
		
		int i6 = 100;
		byte b2 = (byte)i6; //������ ����ȯ
		
		byte b3 = 20;
		int i7 = b3; //�����Ϸ��� ���������� �ڵ� ����ȯ
		
		
	}

}
