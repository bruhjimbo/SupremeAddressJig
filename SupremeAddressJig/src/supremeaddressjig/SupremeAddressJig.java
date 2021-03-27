package supremeaddressjig;
import java.util.*;

public class SupremeAddressJig {
	
	static Random random = new Random();
	
	public static String[] address(String address, int amount) {
		
		ArrayList<String> addressesList = new ArrayList<>();
		
		for (int i=0; i<amount; i++) {
			
			int num = random.nextInt(900) + 100;
			addressesList.add("AB" + num + " " + address);
			
		}
		
		return addressesList.toArray(new String[addressesList.size()]);
	}

}
