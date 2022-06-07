package Basic_oops;

public class Shop {

	public static void main(String[] args) {
//		Store st1 = new Store("Vinay Fancy", "Choclate", "carbary");
//		
//		st1.items();
//		st1.choclates();
		
		Store ch = new Choclate("Vinay Fancy", "Choclate", "munch");
		
		System.out.println(ch.getStorename()  + " " + ch.getItemgroup() + " " + ch.getItemname());
		ch.choclates();
		ch.trail();
	}

}
