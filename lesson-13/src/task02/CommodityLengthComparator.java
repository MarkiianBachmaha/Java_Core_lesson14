package task02;

import java.util.Comparator;

public class CommodityLengthComparator implements Comparator<Commodity> {

	@Override
	public int compare(Commodity c1, Commodity c2) {
		if (c1.getLength() > c2.getLength()) {
			return 1;
		} else if (c1.getLength() < c2.getLength()) {
			return -1;
		}
		return 0;
	}

}