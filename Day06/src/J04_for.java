
public class J04_for {
	public static void main(String[] args) {
		
//		for : 반복문
//		- 자체적으로 멈추는 장치를 가지고 있음
//		- 일반적으로 int 변수 하나를 사용
//		- 이 변수에 대한 시작값~종료값 설정한 후
//			for문에 표현한다.
//		- 시작값과 종료값은 원하는 범위(또는 횟수)
//			에 따라 결정된다.
		
		for(int i=0; i<=5; i++) {
			System.out.println("i = " + i);
		}
//		=> 정수 범위 0~5를 출력하는 경우
//			(횟수로는 6번)
		
//		문제 : "안녕하세요"를 3번 출력
		
		for(int i=0; i<3; i++) {
			System.out.println("안녕하세요");
		}
	}
}










