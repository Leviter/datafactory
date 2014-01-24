Data Factory
============

This project enables a developer to generate 'real life' test data. It is possible to get data specific for a given country (right now only Dutch names are available). The data returned is a randomly picked name from a pre-defined list.

Usage
-----

To get a random last name which is a common one in The Netherlands, use the following code.

```
Locale locale = new Locale("nl", "NL");
DataFactory dataFactory = new DataFactory(locale);

String lastName = dataFactory.getNames().getLastName();
```
