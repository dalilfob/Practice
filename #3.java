	public void quantityDistribution() {
		
		for (int i = 0; i < volun; ++i) {
			boolean exit = false;
			int count = 0;
			while (!exit) {
				if (quantity[i] != 0) {
					if (i == 0) {
						quant[i]--;
						quant[i + 1]--;
						count++;
						if (quant[i] == 0 || count == each) {
							exit = true;
						}
					} else if (i > 0 && i < (volun - 1)){
						if (quant[i-1] != 0) {
							quant[i]--;
							quant[i - 1]--;
							count++;
						} else if (quant[i + 1] != 0){
							quant[i]--;
							quant[i + 1]--;
							count++;
						}
						if (quant[i] == 0 || count == each) {
							exit = true;
						}
					} else if (i == (volun - 1)) {
						if (quant[i - 1] != 0) {
							quant[i]--;
							quant[i - 1]--;
							count++;
						}
						if (quant[i] == 0 || count == each) {
							exit = true;
						}
					}
				} 
			}
		}
	}
	
	public boolean distributionCheck() {
		for (int i = 0; i < volun; ++i) {
			if (quant[i] > 0) {
				return false;
			}
		}
		return true;
	}
