package orchard;

class Watermelon extends Fruits {
	static int amount = 2000;
	static String name = "수박";
	private int price = 25000;
	
	public Watermelon() {
		
	}
	public Watermelon(int count) {
		amount -= count;
	}
}

class Apple extends Fruits {
	static int amount = 5000;
	static String name = "수박";
	private int price = 25000;

	
	public Apple() {
		
	}
	public Apple(int count) {
		amount -= count;
	}
	
}

class Peach extends Fruits {
	static int amount = 3000;
	static String name = "수박";
	private int price = 25000;
	
	public Peach() {
		
	}
	public Peach(int count) {
		amount -= count;
	}
	
}

class Shinemuscat extends Fruits {
	static int amount = 4000;
	static String name = "수박";
	private int price = 25000;
	
	public Shinemuscat() {
		
	}
	public Shinemuscat(int count) {
		amount -= count;
	}
	
}
