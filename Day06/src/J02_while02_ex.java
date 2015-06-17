import javax.swing.JOptionPane;


public class J02_while02_ex {
	public static void main(String[] args) {
		
		int data = 0;
		
		String showMenu = "1. 정수 입력\n"
					+ "2. 정수 출력\n"
					+ "3. 프로그램 종료\n\n"
					+ "번호 선택";
		
		while(true) {
			String rcvMenu = 
				JOptionPane.showInputDialog(
									showMenu);
			int menu 
				= Integer.parseInt(rcvMenu);
			
			if(menu==1) {
				String rcvNum = 
				JOptionPane.showInputDialog(
								"정수 입력");
				data = Integer.parseInt(rcvNum);
			
			} else if(menu==2) {
				JOptionPane.showMessageDialog(null, 
					"입력된 데이터 : " + data);
				
			} else if(menu==3) {
				break;
			}
			
		}
		
		
		
		aa : while(true) {
			String rcvMenu = 
				JOptionPane.showInputDialog(
									showMenu);
			switch(rcvMenu) {
			case "1" : 
				String rcvNum = 
				JOptionPane.showInputDialog(
						"정수 입력");
				data 
					= Integer.parseInt(rcvNum);
				break;
				
			case "2" :
				JOptionPane.showMessageDialog(null, 
						"입력된 데이터 : " + data);
				break;
				
			case "3" : 
				break aa;
				
				default : 
				JOptionPane.showMessageDialog(null, 
						"잘못된 입력입니다.");
			}
		}
		
	}
}










