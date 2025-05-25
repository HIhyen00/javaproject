package orchard;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrchardSystem {
	
	static boolean power = false;
	Scanner key = new Scanner(System.in);
	
	public static void main(String[] args) {

		// person객체 만들기
		User[] user = new User[3];
		user[0]= new User("홍길동", "hong1234", "password1");
		user[1]= new User("임꺽정", "lim0913", "password2");
		user[2]= new User("장길산", "jang0629", "password3");
		
		OrchardSystem obj = new OrchardSystem();
		obj.login(user);
	
		
	}
	
	public void login(User[] user) {
//		Scanner key = new Scanner(System.in);
		
		System.out.println("========로그인========");
		System.out.print("ID : ");
		String inputId = key.next();
		System.out.print("비밀번호 : ");
		String inputPassword = key.next();
		
		boolean run = false;
		for(User person : user) {
			if((person.getId()).equals(inputId) & (person.getPassword()).equals(inputPassword)) {
				run = true;
				System.out.println("로그인에 성공하였습니다.");
				power = true; 
				while(power) {
					try {
						execution(person);
					}catch(InputMismatchException e) {
						System.out.println("숫자를 입력해 주세요.");
					}
				}
				break;
			}
		}
		if(run == false) {
			System.out.println("로그인에 실패하였습니다.");
		}
	}
	
	public void execution(User user) throws InputMismatchException {
//		Scanner key = new Scanner(System.in);
		PurchaseSystem ps = new PurchaseSystem();
		
		System.out.println("==========실행==========");
		System.out.println("1. 과일구매");
		System.out.println("2. 구매내역");
		System.out.println("3. 로그아웃");
		System.out.print("실행할 동작(번호)을 선택해 주세요 : ");
		int num = key.nextInt();
		
		switch(num) {
			case 1:
				ps.purchase(user);
				break;
			case 2:
				ps.receipt(user);
				break;
			case 3:
				System.out.println("로그아웃 되었습니다.");
				power = false;
				break;
			default :
				System.out.println("1~3에서 선택해주세요.");
				
		}
		
		
	}

}
