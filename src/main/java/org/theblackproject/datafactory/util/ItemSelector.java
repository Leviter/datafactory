package org.theblackproject.datafactory.util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ItemSelector {

	private Random random;

	protected ItemSelector() {
		random = new Random(System.nanoTime());
	}

	protected ItemSelector(long seed) {
		random = new Random(seed);
	}

	protected <T> T getItem(List<T> items) {
		return getItem(items, 0);
	}

	protected <T> T getItem(List<T> items, int probabilityOnEmpty) {
		if ((items == null) || (items.size() == 0)) {
			return null;
		}

		if ((probabilityOnEmpty != 0) && (random.nextInt(100) <= probabilityOnEmpty)) {
			return null;
		} else {
			return items.get(random.nextInt(items.size()));
		}
	}

	protected <T> T getItem(T[] items) {
		if (items == null) {
			return null;
		}

		return getItem(items, 0);
	}

	protected <T> T getItem(T[] items, int probabilityOnEmpty) {
		return getItem(Arrays.asList(items), probabilityOnEmpty);
	}
}
