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
	
	
	
