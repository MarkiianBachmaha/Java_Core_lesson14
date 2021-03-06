package task02;

import java.util.Comparator;

public class CommodityNameComparator implements Comparator<Commodity> {

	@Override
	public int compare(Commodity c1, Commodity c2) {
		if (c1.getName().compareTo(c2.getName()) > 0) {
			return 1;
		} else if (c1.getName().compareTo(c2.getName()) < 0) {
			return -1;
		}
		return 0;
	}

}