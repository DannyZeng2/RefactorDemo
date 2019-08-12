package GildedRose;

import gildedRose.GildedRose;
import gildedRose.Item;
import org.junit.Assert;
import org.junit.Test;

public class GildedRoseTest {
    @Test
    public void should_update_other_when_sellIn_is_5_and_quality_is_5() {
        Item item = new Item("Other",5,5);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Other, 4, 4",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_update_other_when_sellIn_is_minus_1_and_quality_is_5() {
        Item item = new Item("Other",-1,5);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Other, -2, 3",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_update_other_when_sellIn_is_minus_1_and_quality_is_minus_1() {
        Item item = new Item("Other",-1,-1);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Other, -2, -1",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_update_other_when_sellIn_is_5_and_quality_is_minus_1() {
        Item item = new Item("Other",5,-1);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Other, 4, -1",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_update_aged_brie_when_sellIn_is_5_and_quality_is_5() {
        Item item = new Item("Aged Brie",5,5);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Aged Brie, 4, 6",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_update_aged_brie_when_sellIn_is_5_and_quality_is_51() {
        Item item = new Item("Aged Brie",5,51);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Aged Brie, 4, 51",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_update_aged_brie_when_sellIn_is_5_and_quality_is_minus() {
        Item item = new Item("Aged Brie",5,-1);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Aged Brie, 4, 0",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_update_sulfuras_hand_of_ragnaros_when_sellIn_is_5_and_quality_is_5() {
        Item item = new Item("Sulfuras, Hand of Ragnaros",5,5);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Sulfuras, Hand of Ragnaros, 5, 5",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_update_sulfuras_hand_of_ragnaros_when_sellIn_is_51_and_quality_is_51() {
        Item item = new Item("Sulfuras, Hand of Ragnaros",51,51);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Sulfuras, Hand of Ragnaros, 51, 51",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_update_sulfuras_hand_of_ragnaros_when_sellIn_is_minus_1_and_quality_is_5() {
        Item item = new Item("Sulfuras, Hand of Ragnaros",-1,5);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Sulfuras, Hand of Ragnaros, -1, 5",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_update_sulfuras_hand_of_ragnaros_when_sellIn_is_minus_1_and_quality_is_minus_1() {
        Item item = new Item("Sulfuras, Hand of Ragnaros",-1,-1);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Sulfuras, Hand of Ragnaros, -1, -1",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_update_backstage_hand_of_ragnaros_when_sellIn_is_5_and_quality_is_5() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",5,5);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 8",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_update_backstage_hand_of_ragnaros_when_sellIn_is_5_and_quality_is_7() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",7,5);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 6, 7",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_update_backstage_hand_of_ragnaros_when_sellIn_is_5_and_quality_is_12() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",12,5);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 11, 6",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_update_backstage_hand_of_ragnaros_when_sellIn_is_5_and_quality_is_51() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",5,51);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 51",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_update_backstage_hand_of_ragnaros_when_sellIn_is_7_and_quality_is_51() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",7,51);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 6, 51",gildedRose.getItems()[0].toString());
    }
}
