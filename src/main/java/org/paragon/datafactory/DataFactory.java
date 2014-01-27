package org.paragon.datafactory;

import org.apache.commons.lang3.StringUtils;
import org.paragon.datafactory.factory.AddressesFactory;
import org.paragon.datafactory.factory.NamesFactory;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class DataFactory {

	private static Random random = new Random(System.nanoTime());

	private AddressesFactory addressesFactory;
	private NamesFactory namesFactory;

	public DataFactory(Locale locale) {
		addressesFactory = new AddressesFactory(locale);
		namesFactory = new NamesFactory(locale);
	}

	public DataFactory(Locale locale, long seed) {
		this(locale);
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

	public String getCity() {
		return getItem(addressesFactory.getAddresses().getCities());
	}

	public String getState() {
		return getItem(addressesFactory.getAddresses().getStates());
	}

	public String getFullName() {
		String firstName = getFirstName();
		String prefixName = getPrefixName();
		String lastName = getLastName();

		StringBuilder result = new StringBuilder();

		result.append(firstName).append(" ");
		if (StringUtils.isNotBlank(prefixName)) {
			result.append(prefixName).append(" ");
		}
		result.append(lastName);

		return result.toString();
	}

	public String getLastName() {
		return getItem(namesFactory.getNames().getLastNames());
	}

	public String getPrefixName() {
		return getItem(namesFactory.getNames().getPrefixNames(), 80);
	}

	public String getFirstNameFemale() {
		return getItem(namesFactory.getNames().getFirstNamesFemale());
	}

	public String getFirstNameMale() {
		return getItem(namesFactory.getNames().getFirstNamesMale());
	}

	public String getFirstName() {
		return getItem(ArrayUtils.addAll(namesFactory.getNames().getFirstNamesFemale(), namesFactory.getNames().getFirstNamesMale()));
	}
}
