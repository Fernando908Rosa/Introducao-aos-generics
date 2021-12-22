package Services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
		
		List<Integer> list = new ArrayList<>();
		
		public void addValue(Integer Value) {
			list.add(Value);
		}

		public Integer first() {
			if (list.isEmpty()) {
				throw new IllegalStateException("List is empty");
			}	
           return list.get(0);
		}	
		
	  public void print() {	
		  System.out.print("[");
		  if (!list.isEmpty()) {
	  }
	for (int i = 1;  i < list.size(); i++) {	
		System.out.print(", " + list.get(i));
		
	}
	System.out.println("]");
	  }	
}	