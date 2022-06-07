package Basic_oops;

public abstract class Store {
	
	private String Storename;
	private String Itemgroup;
	private String Itemname;
	
	public Store(String storename, String itemgroup, String itemname) {
		super();
		this.Storename = storename;
		this.Itemgroup = itemgroup;
		this.Itemname = itemname;
	}
	public String getStorename() {
		return Storename;
	}
	public void setStorename(String storename) {
		Storename = storename;
	}
	public String getItemgroup() {
		return Itemgroup;
	}
	public void setItemgroup(String itemgroup) {
		Itemgroup = itemgroup;
	}
	public String getItemname() {
		return Itemname;
	}
	public void setItemname(String itemname) {
		Itemname = itemname;
	}
	
	public void items() {
		System.out.println("Store has lot of items");
	}
	public void choclates() {
		System.out.println(getStorename() + " Store has varities of choclates");
	}
	
	public abstract void trail();
	
	
	}
