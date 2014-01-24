import factory.AddressesFactory;
import factory.NamesFactory;
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

	protected <T> T getItem(List<T> items) {
		if ((items == null) || (items.size() == 0)) {
			return null;
		}

		return items.get(random.nextInt(items.size()));
	}

	protected <T> T getItem(T[] items) {
		if (items == null) {
			return null;
		}

		return getItem(Arrays.asList(items));
	}


	public String getCity() {
		return getItem(addressesFactory.getAddresses().getCities());
	}

	public String getFullName() {
		String firstName = getFirstName();
		String middleName = getMiddleName();
		String lastName = getLastName();

		StringBuilder result = new StringBuilder();

		result.append(firstName).append(" ");
		if (!middleName.isEmpty()) {
			result.append(middleName).append(" ");
		}
		result.append(lastName);

		return result.toString();
	}

	public String getLastName() {
		return getItem(namesFactory.getNames().getLastNames());
	}

	public String getMiddleName() {
		return getItem(namesFactory.getNames().getMiddleNames());
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
