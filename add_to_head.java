public void add_to_head(int key, double value) {
		Item newHead = new Item(key, value);
		if (head.next != null) {
			Item current = head;
			while (current.next != null) {
				current.next.key += 1;
				current = current.next;
			}
			System.out.println(head.next.key + " " + head.next.value);
			newHead.next = head.next.next;
			head.next = newHead;
			System.out.println(head.next.key + " " + head.next.value);
			System.out.println(head.next.next.key + " " + head.next.next.value);
		} else {
			head.next = newHead;
		}
		count++;
	}
	
	
	
