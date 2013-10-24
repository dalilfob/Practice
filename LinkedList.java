public class LinkedList {

	/**
	 * This is a variable that is going to hold the value of the head, which is
	 * a sentinel node.
	 */
	private double value = -1;

	/**
	 * This is a variable that is going to hold the key of the head, which is a
	 * sentinel node.
	 */
	private int key = -1;

	int count = 0;

	/**
	 * This creates an instance of the Item class in order to keep track of the
	 * head of the list.
	 */
	private Item head = new Item(key, value);

	/**
	 * This method will remove the last element in the list and return the value
	 * of the last element.
	 * 
	 */
	// TODO Fix the problem that current is not truly null after setting to null
	public void remove_tail() {
		if (head.next != null) {
			Item current = head;
			while (current.next != null) {
				current = current.next;
			}
			//CRAZY NINJA INCEPTION BUG: current (which is the last item in the list)
			//is set to null here, but when print() is called, it can still 
			// access this item. No idea how when the item is suppose to be null.
			current = null;
			count--;
		}
	}

	public void print() {
		Item current = head;
		System.out.printf("%s\t%5s\n", "Node", "Value");
		while (current.next != null) {
			System.out.printf("%d\t%.2f\n", current.next.key,
					current.next.value);
			current = current.next;
		}
	}
}
