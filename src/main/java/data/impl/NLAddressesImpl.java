package data.impl;

import data.Addresses;

public class NLAddressesImpl implements Addresses {

	private static String[] cities = {
			"Aa en Hunze", "Aalburg", "Aalsmeer", "Aalten", "Achtkarspelen", "Alblasserdam", "Albrandswaard", "Alkmaar",
			"Almelo", "Almere", "Alphen aan den Rijn", "Alphen-Chaam", "Amersfoort", "Amstelveen",
			"Amsterdam", "Apeldoorn", "Appingedam", "Arnhem", "Assen", "Asten", "Baarle-Nassau", "Baarn", "Barendrecht",
			"Barneveld", "Bedum", "Beek", "Beemster", "Beesel", "Bellingwedde", "Bergambacht", "Bergeijk", "Bergen",
			"Bergen", "Bergen op Zoom", "Berkelland", "Bernheze", "Bernisse", "Best", "Beuningen", "Beverwijk",
			"Binnenmaas", "Bladel", "Blaricum", "Bloemendaal", "Boekel",
			"Borne", "Borsele", "Boxmeer", "Boxtel", "Breda", "Brielle", "Bronckhorst", "Brummen", "Brunssum", "Bunnik",
			"Bunschoten", "Buren", "Bussum", "Capelle aan den IJssel", "Castricum", "Coevorden", "Cranendonck",
			"Cromstrijen", "Cuijk", "Culemborg", "Dalfsen", "Dantumadiel", "De Bilt",
			"Delft", "Delfzijl", "Den Haag", "Den Helder", "Deurne", "Deventer",
			"Diemen", "Dinkelland", "Doesburg", "Doetinchem", "Dongen", "Dongeradeel", "Dordrecht", "Drechterland",
			"Drimmelen", "Dronten", "Druten", "Duiven", "Ede", "Eemnes", "Eemsmond",
			"Eersel", "Eindhoven", "Elburg", "Emmen", "Enkhuizen", "Enschede", "Epe", "Ermelo", "Etten-Leur",
			"Ferwerderadiel", "Franekeradeel", "Geertruidenberg", "Geldermalsen", "Gennep", "Giessenlanden", "Goes",
			"Goirle", "Gorinchem", "Gouda", "Grave", "Groesbeek", "Groningen", "Grootegast", "Haaksbergen", "Haaren",
			"Haarlem", "Halderberge", "Hardenberg", "Harderwijk",
			"Hardinxveld-Giessendam", "Haren", "Harlingen", "Hattem", "Heemskerk", "Heemstede", "Heerde", "Heerenveen",
			"Heerhugowaard", "Heerlen", "Heeze-Leende", "Heiloo", "Hellendoorn", "Hellevoetsluis", "Helmond",
			"Hendrik-Ido-Ambacht", "Hengelo", "het Bildt", "Heumen", "Heusden", "Hillegom", "Hilvarenbeek", "Hilversum",
			"Hoogeveen", "Hoogezand-Sappemeer", "Hoorn", "Horst aan de Maas", "Houten", "Huizen", "Hulst",
			"IJsselstein", "Kampen", "Kapelle", "Katwijk", "Kerkrade", "Koggenland", "Korendijk",
			"Krimpen aan den IJssel", "Laarbeek", "Landerd", "Landgraaf", "Landsmeer", "Langedijk", "Lansingerland",
			"Laren", "Leek", "Leerdam", "Leeuwarden", "Leeuwarderadeel", "Leiden", "Leiderdorp", "Lelystad", "Leudal",
			"Leusden", "Lingewaal", "Lingewaard", "Lisse", "Littenseradiel", "Lochem", "Loon op Zand", "Lopik",
			"Loppersum", "Losser", "Maasdonk", "Maasdriel", "Maasgouw", "Maassluis", "Maastricht", "Marum", "Medemblik",
			"Meerssen", "Menameradiel", "Menterwolde", "Meppel", "Middelburg", "Millingen aan de Rijn", "Moerdijk",
			"Molenwaard", "Montfoort", "Muiden", "Naarden", "Nederlek", "Nederweert", "Neerijnen", "Nieuwegein",
			"Nieuwkoop", "Nijkerk", "Nijmegen", "Noordwijk", "Noordwijkerhout", "Nunspeet", "Nuth", "Oegstgeest",
			"Oirschot", "Oisterwijk", "Oldambt", "Oldebroek", "Oldenzaal", "Ommen", "Onderbanken", "Oosterhout",
			"Opmeer", "Opsterland", "Oss", "Ouderkerk", "Oudewater", "Overbetuwe", "Papendrecht", "Purmerend", "Putten",
			"Raalte", "Reimerswaal", "Renkum", "Renswoude", "Rheden", "Rhenen", "Ridderkerk", "Rijnwaarden", "Rijswijk",
			"Roerdalen", "Roermond", "Roosendaal", "Rotterdam", "Rozendaal", "Rucphen", "Schagen", "Schermer",
			"Scherpenzeel", "Schiedam", "Schijndel", "Schinnen", "Schoonhoven", "'s-Hertogenbosch", "Simpelveld",
			"Sint Anthonis", "Sint-Michielsgestel", "Sint-Oedenrode", "Sittard-Geleen", "Sliedrecht", "Slochteren",
			"Sluis", "Soest", "Someren", "Son en Breugel", "Spijkenisse", "Stadskanaal", "Staphorst", "Stede Broec",
			"Steenbergen", "Steenwijkerland", "Stein", "Stichtse Vecht", "Strijen", "Ten Boer", "Terneuzen",
			"Teylingen", "Tiel", "Tilburg", "Tubbergen", "Tynaarlo", "Tytsjerksteradiel", "Ubbergen", "Uden",
			"Uitgeest", "Uithoorn", "Urk", "Utrecht", "Vaals", "Valkenburg aan de Geul", "Valkenswaard", "Veendam",
			"Veenendaal", "Veere", "Veghel", "Veldhoven", "Velsen", "Venlo", "Venray", "Vianen", "Vlaardingen",
			"Vlagtwedde", "Vlissingen", "Vlist", "Voerendaal", "Voorschoten", "Voorst", "Vught", "Waalre", "Waalwijk",
			"Waddinxveen", "Wageningen", "Wassenaar", "Waterland", "Weert", "Weesp", "Werkendam", "Westerveld",
			"Westervoort", "Westland", "Westvoorne", "Wierden", "Wijchen", "Wijdemeren", "Wijk bij Duurstede", "Winsum",
			"Winterswijk", "Woensdrecht", "Woerden", "Wormerland", "Woudenberg", "Woudrichem", "Zaanstad", "Zaltbommel",
			"Zandvoort", "Zederik", "Zeevang", "Zeewolde", "Zeist", "Zevenaar", "Zoetermeer", "Zoeterwoude", "Zuidhorn",
			"Zundert", "Zutphen", "Zwartewaterland", "Zwijndrecht", "Zwolle"
	};

	@Override
	public String[] getCities() {
		return cities;
	}

	private static String[] states = {
			"Friesland", "Groningen", "Drenthe", "Overijssel", "Gelderland", "Noord-Brabant", "Utrecht", "Zuid-Holland",
			"Noord-Holland", "Zeeland", "Flevoland", "Limburg"
	};

	@Override
	public String[] getStates() {
		return states;
	}

}
