// Felix Angell - fa302

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Main {

	// quick dirty stupid bug prone wrapper
	// around a hashmap, not sure if there is
	// something like this in the std library
	private class CountedHashMap<K> {
		// use a linked hashmap because order 
		// is important when we iterate to print out as a string
		private LinkedHashMap<K, Integer> instances = new LinkedHashMap<>();
		private int numAdds = 0;
		
		public void add(K key) {
			numAdds++;
			
			if (instances.containsKey(key)) {
				int lastValue = instances.get(key);
				instances.put(key, ++lastValue);
			} else {
				instances.put(key, 1);
			}
		}
		
		public int get(K key) {
			return instances.get(key);
		}
		
		public int count() {
			return numAdds;
		}
	}
	
	// this is basically a hack because
	// im too lazy to make classes
	// genius.
	
	// note the order is INCREDIBLY
	// important here because we iterate
	// over the value set in order
	private enum Coin {
		Two_Pounds(200),
		One_Pound(100),
		Fifty_Pence(50),
		Twenty_Pence(20),
		Ten_Pence(10),
		Five_Pence(5),
		Two_Pence(2),
		Penny(1),
		;
		
		int value;
		Coin(int value) {
			this.value = value;
		}
	}
	
	// 100p, 200p, 50p, 20p, 10p, 5p, 2p, 1p
	// print "1 coin" if 1 coin is needed.
	public CountedHashMap<Integer> calculateChange(final int amount) {
		int balance = amount;
		
		CountedHashMap<Integer> numCoins = new CountedHashMap<>();
		
		Coin[] coins = Coin.values();
		while (balance > 0) {
			for (int i = 0; i < coins.length; i++) {
				Coin curr = coins[i];
				while (balance - curr.value >= 0) {
					balance -= curr.value;
					numCoins.add(curr.value);
				}
			}
		}

		return numCoins;
	}
	
	public static void main(String[] args) {
		System.out.println("Amount Coins");

		ArrayList<Integer> amounts = new ArrayList<>();
		
		// little hack because i cant be bothered
		// to add input all the time
		if (!System.getProperty("user.name").equals("Felix")) {
			for (;;) {
				final int amount = BIO.getInt();
				if (amount == 0) {
					break;
				}
				if (amount < 1 || amount > 500) {
					System.out.println("Invalid amount " + amount +"p");
					continue;
				}
				amounts.add(amount);
			}
		} else {
			amounts.add(498);
		}
		
		// dont even run.
		if (amounts.size() == 0) {
			return;
		}
		
		final Main m = new Main();
		amounts.forEach(amt -> {
			CountedHashMap<Integer> change = m.calculateChange(amt);
			
			StringBuilder result = new StringBuilder();
			
			final int count = change.count();
			result.append(count + " coin" + (count > 1 ? "s " : ' '));
			
			change.instances.forEach((key, val) -> {
				if (val > 1) {
					result.append(val + "*");
				}
				result.append(key + "p");
				result.append(' ');
			});
			System.out.println(amt + "p\t" + result);
		});
	}
	
}


