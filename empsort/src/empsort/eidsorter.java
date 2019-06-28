package empsort;
import java.util.Comparator;
public class eidsorter implements Comparator<Employ>{
		@Override
	public int compare(Employ o1, Employ o2) {
	return o1.getId().compareTo(o2.getId());
	}

	
	}

