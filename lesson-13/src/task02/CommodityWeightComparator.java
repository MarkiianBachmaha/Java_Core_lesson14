package task02;

import java.util.Comparator;

public class CommodityWeightComparator implements Comparator<Commodity> {

	@Override
	public int compare(Commodity c1, Commodity c2) {
		if (c1.getWeight() > c2.getWeight()) {
			return 1;
		} else if (c1.getWeight() < c2.getWeight()) {
			return -1;
		}
		return 0;
	}

}