
public class J02_while01 {
	public static void main(String[] args) {
		
//		while : 반복문
//		- 소괄호 안의 내용이 맞는말(참)이면
//			중괄호 안의 내용을 반복하라는 구문
		
		
//		1. 소괄호 안의 조건식이 거짓이 되는 상황
//			으로 반복문을 이용하기
		int n = 1;
		while(n < 5) {
			System.out.println("n : " + n);
			n++;
		}
		
//		2. if문과 break로 while문 이용하기
		int p = 1;
		while(true) {	// 무조건 반복
			System.out.println("p : " + p);
			
			if(p == 5) {
				break;
			}
			
			p++;
		}
//		=> break 키워드가 영향을 주는 대상 3가지
//			: switch-case, while, for
//		=> 대상이 여러개일 때에는 가장 가까이
//			위치한 대상에 영향을 준다.
		
		aa : while(true) {
			
			int c = 1;
			while(true) {
				System.out.println("c = " + c);
			
				if(c==5) {
					break aa;
				}
				c++;
			}
		}
//		=> while에 이름(레이블)을 붙일 수 있으며
//			break를 통해서 이름을 지정할 수 있다.
	}
}











