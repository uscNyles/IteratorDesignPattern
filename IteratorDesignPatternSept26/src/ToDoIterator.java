import java.util.Iterator;

public class ToDoIterator implements Iterator{

	private ToDo[] todos;
	private int position;
	
	/**
	 * assigns the iterator to the given todo array
	 * @param todos
	 */
	public ToDoIterator(ToDo[] todos) {
		this.todos = todos;
	}
	
	/**
	 * if todo array is not at the last position with a value it 
	 * will return the next position, else null
	 */
	@Override
	public ToDo next() {
		if(!hasNext())return null;
		ToDo todo = todos[position];
		position += 1;
		return todo;
	}

	/**
	 * returns true or false  according to wether there is a valued position 
	 * the the right on the given array
	 */
	@Override
	public boolean hasNext() {
		if(position >= todos.length || todos[position] == null) {
			return false;
		} else {
		return true;
		}
	}
}
