import java.util.ArrayList;
/**
 * Defines the characteristics of a Contractor in Array form.
 * 
 * @author nylesgeiger
 *
 */
public class ContractorToDoList {

	private String address;
	private ToDo[] todos = new ToDo[2];
	private int count;
	
	/**
	 * Constructs a contract
	 * @param address
	 * THe address for the assignment
	 */
	public ContractorToDoList(String address) {
		this.address = address;
		
	}
	
	/**
	 * Adds ability for a todo to be added to the array of todos 
	 * @param title
	 * the title of the todo
	 * @param description
	 * what must be done 
	 * @param price
	 * the amount the customer will be charged 
	 * @param contact
	 * The point of contact for the assignment
	 * @param supplies
	 * What is needed to complete the assignment
	 */
	public void addToDo(String title, String description, 
			double price, String contact, 
			ArrayList<String> supplies) {
		
		if (count >= todos.length) {
			this.growArray(todos);
		
		} else {
			ToDo tempTodo = new ToDo( title,  description, 
				price,  contact,  supplies);
			todos[count] = tempTodo;
			count++; 
		}
	}
	
	/**
	 * creates an iterator to read through the array.
	 * @return
	 */
	public ToDoIterator createIterator() {
		return new ToDoIterator(todos);
		
	}
	
	/**
	 * returns address in string form
	 * @return
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * returns the total price of all todos
	 * @return
	 */
	public double getTotalCost() {
		int totalPrice = 0;
		
		for( int i =0; todos.length<=i; i++) {
			totalPrice += todos[i].getPrice();
		}
		
		return totalPrice;
	}
	
	/**
	 * doubles the size of the todo array once its 
	 * maximum capacity is reached
	 * @param todo
	 * a todo list whose legnth is to be doubled
	 * @return
	 */
	private ToDo[] growArray(ToDo[] todo) {
		
		 ToDo[] tempTodo = new ToDo[todo.length * 2];
		 
		    for(int i = 0; todo.length <=i; i++) {
		    	tempTodo[i] = todo[i];
		    }
		    todo = tempTodo;
		    return todo;
	}
		
}
