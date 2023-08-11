package com.a.introduction.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GildedRoseBAgedBrieTest2Refactored {

	private static final String AGED_BRIE = "Aged Brie";
	private static final int EXPIRED_SELLIN = -1;
	private static final int UNEXPIRED_SELLIN = 4;
	private static final int DEFAULT_QUALITY = 3;
	private static final int MAX_QUALITY = 50;

	@Test
	public void unexpiredAgeBrie_qualityIncresesBy1() {

		GildedRose app = createGildedRoseWithOneItem(AGED_BRIE, UNEXPIRED_SELLIN, DEFAULT_QUALITY);

		app.updateQuality();

		Item expected = new Item(AGED_BRIE, UNEXPIRED_SELLIN - 1, DEFAULT_QUALITY + 1);
		assertItem(expected, app.items[0]);
	}

	@Test
	public void expiredAgeBrie_qualityIncresesBy2() {

		GildedRose app = createGildedRoseWithOneItem(AGED_BRIE, EXPIRED_SELLIN, DEFAULT_QUALITY);

		app.updateQuality();

		Item expected = new Item(AGED_BRIE, EXPIRED_SELLIN - 1, DEFAULT_QUALITY + 2);
		assertItem(expected, app.items[0]);
	}

	@Test
	public void unexpiredAgeBrie_qualityIncresesBy50() {

		GildedRose app = createGildedRoseWithOneItem(AGED_BRIE, UNEXPIRED_SELLIN, MAX_QUALITY);

		app.updateQuality();

		Item expected = new Item(AGED_BRIE, UNEXPIRED_SELLIN - 1, MAX_QUALITY);
		assertItem(expected, app.items[0]);
	}

	private GildedRose createGildedRoseWithOneItem(String agedBrie, int unexpiredSellin, int defaultQuality) {
		Item item = new Item(agedBrie, unexpiredSellin, defaultQuality);
		Item[] items = new Item[] { item };
		GildedRose app = new GildedRose(items);
		return app;
	}

	private void assertItem(Item expected, Item actual) {
		assertEquals(expected.name, actual.name);
		assertEquals(expected.sellIn, actual.sellIn);
		assertEquals(expected.quality, actual.quality);
	}
}
