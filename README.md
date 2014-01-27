Data Factory
============

This project enables a developer to generate 'real life' test data. It is possible to get data specific for a given
country. The data returned is a randomly picked name from a pre-defined list.

Supported countries:
- Germany
- The Netherlands

For Germany it is possible to:
- Get a city
- Get a state

For The Netherlands it is possible to:
- Get a first name (mix from male/female names)
- Get a first name (female)
- Get a first name (male)
- Get a full name (combination of first, middle and last name)
- Get a last name
- Get a middle name
- Get a city
- Get a state

Usage
-----

To get a random last name which is a common one in The Netherlands, use the following code.

```
Locale locale = new Locale("nl", "NL");
DataFactory dataFactory = new DataFactory(locale);

String lastName = dataFactory.getLastName();
```

For testing purposes it is also possible to add a random seed to the constructor.