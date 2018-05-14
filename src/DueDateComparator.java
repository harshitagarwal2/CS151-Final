

import java.util.Comparator;
import java.util.Date;

public class DueDateComparator implements Comparator<Date> {

	public DueDateComparator() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("deprecation")
	@Override
	public int compare(Date o1, Date o2) {
		if(o1.before(o2))
			return -5;
		else if( o1.equals(o2))
			return 0;
		else return 5;
	}
	
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getTime());
	}

}
