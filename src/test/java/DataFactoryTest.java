import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DataFactoryTest {

	private DataFactory dataFactory = new DataFactory(null);

	@Test
	public void testConstructorWithSeedReturnsAlwaysTheSameItem() {
		String[] data = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

		DataFactory dataFactory = new DataFactory(null, 1);
		String result1 = dataFactory.getItem(data);

		dataFactory = new DataFactory(null, 1);
		String result2 = dataFactory.getItem(data);

		assertEquals(result1, result2);
	}

	@Test
	public void testGetItemListReturnsItemWhenListContainsOnlyOneElement() {
		final String expected = "Single item";
		final List<String> items = new ArrayList<String>();
		items.add(expected);

		assertEquals(expected, dataFactory.getItem(items));
	}

	@Test
	public void testGetItemListReturnsNullWhenListContainsNoElements() {
		final List<String> items = new ArrayList<String>();

		assertEquals(null, dataFactory.getItem(items));
	}

	@Test
	public void testGetItemListReturnsNullWhenListIsNull() {
		final List<String> items = null;

		assertEquals(null, dataFactory.getItem(items));
	}

	@Test
	public void testGetItemListReturnsItemWhenArrayContainsOnlyOneElement() {
		final String expected = "Single item";
		final String[] items = {expected};

		assertEquals(expected, dataFactory.getItem(items));
	}

	@Test
	public void testGetItemListReturnsNullWhenArrayContainsNoElements() {
		final String[] items = {};

		assertEquals(null, dataFactory.getItem(items));
	}

	@Test
	public void testGetItemListReturnsNullWhenArrayIsNull() {
		final String[] items = null;

		assertEquals(null, dataFactory.getItem(items));
	}
}
