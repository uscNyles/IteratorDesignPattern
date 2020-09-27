import java.util.ArrayList;

/**
 * Defines the shape and functions of todos
 * @author nylesgeiger
 *
 */
public class ToDo {

	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies;
	
/**
 * creates a todo object
 * @param title
 * @param description
 * @param price
 * @param contact
 * @param supplies
 */
	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
		this.contact = contact;
		this.supplies = supplies;
	}
	
	/**
	 * returns the price of the todo
	 * @return
	 */
	public double getPrice(){
		return price;
	}
	
	/**
	 * returns the characteristics of the todo in a string form.
	 */
	public String toString() {
		String suppliesString = "";
		
		for (String supply: supplies) {
			suppliesString += "-"+supply+"\n";
		}
		
		return  title +"\n"+ description +"\n"+"Business Contact: "+ contact +"\n"+ "Supply List:\n" + suppliesString +"\n"+ price;
	}
}
