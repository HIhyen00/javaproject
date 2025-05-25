package orchard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PurchaseSystem {
	
	Scanner key = new Scanner(System.in);
	static ArrayList<String> purchaselist = new ArrayList<String>(); // 구매내역
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
	public void purchase(User user) {
		Fruits fruit;
				
		System.out.print("1. 수박\n2. 사과\n3. 복숭아\n4. 샤인머스캣\n");
		System.out.print("구매할 과일을 고르고 개수를 적어주세요.(ex.\"수박 5\") : ");
		
		try {
			String[] line = br.readLine().split(" ");
			int number = Integer.parseInt(line[1]);
			if(line[0].equals("수박")) {
				fruit = new Watermelon(number);
				purchaselist.add(user.getId()+"님이 수박 "+number+"개를 구매하였습니다.");
				System.out.println(purchaselist.get(purchaselist.size()-1));
			}else if(line[0].equals("사과")) {
				fruit = new Watermelon(number);
				purchaselist.add(user.getId()+"님이 사과 "+number+"개를 구매하였습니다.");
				System.out.println(purchaselist.get(purchaselist.size()-1));
			}else if(line[0].equals("복숭아")) {
				fruit = new Watermelon(number);
				purchaselist.add(user.getId()+"님이 복숭아 "+number+"개를 구매하였습니다.");
				System.out.println(purchaselist.get(purchaselist.size()-1));
			}else if(line[0].equals("샤인머스캣")) {
				fruit = new Watermelon(number);
				purchaselist.add(user.getId()+"님이 샤인머스캣 "+number+"개를 구매하였습니다.");
				System.out.println(purchaselist.get(purchaselist.size()-1));
			}else {
				System.out.println("잘못입력되었습니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void receipt(User user) {
		System.out.println("----"+user.getName()+"님의 구매내역----");

		for(int i=0; i<purchaselist.size(); i++) {
			System.out.println(purchaselist.get(i));
			
		}
	}
}
