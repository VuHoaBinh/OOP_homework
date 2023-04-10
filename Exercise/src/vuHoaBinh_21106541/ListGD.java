package vuHoaBinh_21106541;

import java.util.ArrayList;

public class ListGD<T> {
		private ArrayList<T> ls = new ArrayList<>();
		
		public boolean themGD(T gd) {
			if(gd instanceof T) {
				return ls.add(gd);			
			} else
				return false;
		}
		public T get(int index) {
	        if (index < 0 || index >= ls.size()) {
	            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
	        }
	        return ls.get(index);
	    }
		
		public int size() {
	        return ls.size();
	    }
		
}
