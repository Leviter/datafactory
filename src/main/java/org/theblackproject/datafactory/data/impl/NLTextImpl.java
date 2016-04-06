package org.theblackproject.datafactory.data.impl;

import org.theblackproject.datafactory.data.Text;
import org.theblackproject.datafactory.util.ItemSelector;

import static org.apache.commons.lang3.StringUtils.capitalize;

public class NLTextImpl extends ItemSelector implements Text {

	private static String[] articles = {
			"de", "het", "een"
	};

	private static String[] prepositions = {
			"van", "op", "tot", "over", "door", "achter", "voor", "naast", "in", "buiten", "tegen", "onder", "vanaf",
			"met", "bij"
	};

	private static String[] nouns = {
			"aambeeld", "aandeel", "aandeelhoudersvergadering", "auto",
			"bier", "boek", "broek", "brood",
			"caravan",
			"droom",
			"eenwieler",
			"fiets",
			"paard",
			"zus", "zwaard"
	};

	private static String[] verbs = {
			"kan", "is", "wordt", "verbindt", "liep", "benadert", "achterhaalde", "vervangt", "loopt"
	};

	@Override
	public String getSentence() {
		String sentence = "";

		sentence += getItem(articles) + " ";
		sentence += getItem(nouns) + " ";
		sentence += getItem(verbs) + " ";
		sentence += getItem(prepositions) + " ";
		sentence += getItem(articles) + " ";
		sentence += getItem(nouns) + ".";

		return capitalize(sentence);
	}
}
