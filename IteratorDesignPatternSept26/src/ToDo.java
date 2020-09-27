import java.util.ArrayList;

public class ToDo {

	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies;
	

	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
		this.contact = contact;
		this.supplies = supplies;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String toString() {
		String suppliesString = "";
		
		for (String supply: supplies) {
			suppliesString += "-"+supply+"\n";
		}
		
		return  title +"\n"+ description +"\n"+"Business Contact: "+ contact +"\n"+ "Supply List:\n" + suppliesString +"\n"+ price;
	}
}
