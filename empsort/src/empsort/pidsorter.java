package empsort;
import java.util.Comparator;
public class pidsorter  implements Comparator<Projec> {
	@Override
	public int compare(Projec p1, Projec p2) {
	return p1.getpId().compareTo(p2.getpId());
	}


}
