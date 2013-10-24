public void add_to_head(int key, double value) {
		Item newHead = new Item(key, value);
		if (head.next != null) {
			Item current = head;
			while (current.next != null) {
				current.next.key += 1;
				current = current.next;
			}
			newHead.next = head.next;
			head.next = newHead;
		} else {
			head.next = newHead;
		}
		count++;
	}
	
	
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
