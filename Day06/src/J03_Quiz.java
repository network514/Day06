import javax.swing.JOptionPane;


public class J03_Quiz {
	public static void main(String[] args) {
		
//		계산기 프로그램 작성
//		메뉴 : 	0. 두 정수 입력
//				1. 더하기
//				2. 빼기
//				3. 곱하기
//				4. 프로그램 종료
//		두 정수를 입력한 후,
//		메뉴에서 번호를 선택하면 
//		해당 결과가 나오도록 작성
		
		int data1=0, data2=0;
		
		String showMenu = "0. 두 정수 입력\n"
				+ "1. 더하기\n"
				+ "2. 빼기\n"
				+ "3. 곱하기\n"
				+ "4. 프로그램 종료\n\n"
				+ "번호 선택";
		
		aa : while(true) {
			String menu
				= JOptionPane.showInputDialog(
									showMenu);
			
			String showMsg = null;
			
			switch(menu) {
			case "0" :
				data1 
				 = Integer.parseInt(
					JOptionPane.showInputDialog(
						"첫번째 정수 입력"));
				String rcv = 
					JOptionPane.showInputDialog(
						"두번째 정수 입력");
				data2 = Integer.parseInt(rcv);
				break;
			case "1" : 
				showMsg 
					= data1 + " + " + data2
						+ " = " + (data1+data2);
				break;
			case "2" : 
				showMsg
				 = data1 + " - " + data2
				  + " = " + (data1-data2); 
				break;
			case "3" : 
				showMsg 
				 = data1 + " * " + data2
				  + " = " + (data1*data2);
				break;
			case "4" : 
				break aa;
			default : 
				showMsg = "잘못된 입력입니다.";
			}
			
			JOptionPane.showMessageDialog(null, 
									showMsg);
		}
	}
}










