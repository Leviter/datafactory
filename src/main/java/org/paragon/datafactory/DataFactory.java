package org.paragon.datafactory;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.paragon.datafactory.factory.AddressesFactory;
import org.paragon.datafactory.factory.NamesFactory;
import org.paragon.datafactory.factory.TextFactory;
import org.paragon.datafactory.util.ItemSelector;

import java.util.Locale;

public class DataFactory extends ItemSelector {

	private AddressesFactory addressesFactory;
	private NamesFactory namesFactory;
	private TextFactory textFactory;

	public DataFactory(Locale locale) {
		initializeFactories(locale);
	}

	public DataFactory(Locale locale, long seed) {
		super(seed);
		initializeFactories(locale);
	}

	private void initializeFactories(Locale locale) {
		addressesFactory = new AddressesFactory(locale);
		namesFactory = new NamesFactory(locale);
		textFactory = new TextFactory(locale);
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

	public String getText() {
		return textFactory.getText().getSentence();
	}
}
