
public class J01_switch01 {
	public static void main(String[] args) {
		
//		switch-case
//		- 입력된 값과 동일한 값을 가진 case를
//			선택한 후 해당 명령을 실행하는 구문
		
		int n1 = 50;
		
		switch(n1) {
		
		case 10 :
			System.out.println("10이 입력됨");
			break;
		case 20 : 
			System.out.println("20이 입력됨");
			break;
		case 30 : 
			System.out.println("30이 입력됨");
			break;
			
			default : 
			System.out.println(
					"입력된 수는 10, 20, 30이 아닌"
					+ " 정수입니다.");	
		}
//		=> switch는 기본적으로 동일한 값을 가진
//			case를 실행한 후, 이후의 모든 명령을
//			실행시키는 특징이 있는데,
//			원하는 case만 실행하고자 하는 경우
//			break 키워드를 이용한다.
//		=> default는 해당 case가 존재하지
//			않는 경우, 반드시 실행되는 구문이다.
//			(마지막에 명시한다.)
		
		
		double d = 1.1;
		
		/* 에러 : 실수에 대해서는 실행되지 않음
		switch(d) {
		
		}
		*/
		
		
		char c = 'B';
		switch(c) {
		
		case 'A' : 
			System.out.println("A가 입력됨");
			break;
		case 'B':
			System.out.println("B가 입력됨");
			break;
		case 'C':
			System.out.println("C가 입력됨");
		}
		
		
		String str = "길동이";
		switch(str) {
		case "둘리" : 
			System.out.println("둘리 선택됨");
			break;
		case "길동이" : 
			System.out.println("길동이 선택됨");
			break;
		}
		
		
		int n2 = 2;
		switch(n2) {
		
		case 2: case 4: case 6: case 8:
			System.out.println("입력된 수는 "
				+ "10보다 작은 짝수");
			break;
		case 1: case 3: case 5: case 7: case 9:
			System.out.println("입력된 수는 "
				+ "10보다 작은 홀수");
		}
	}
}














