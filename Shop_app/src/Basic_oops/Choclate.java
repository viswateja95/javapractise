package Basic_oops;

public class Choclate extends Store{

	public Choclate(String storename, String itemgroup, String itemname) {
		super(storename, itemgroup, itemname);
		// TODO Auto-generated constructor stub
	}
	
	public void munch() {
		System.out.println(getItemname() + " belong to choclategroup");
	}
	
	public void choclates() {
		System.out.println(getStorename() + " Store has choclates");
	}

	@Override
	public void trail() {
		System.out.println("trail for abstract");
		
	}
}
