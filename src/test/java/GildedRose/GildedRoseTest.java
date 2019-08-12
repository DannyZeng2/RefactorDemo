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
    public void should_update_sellIn_when_name_is_sulfuras_hand_of_ragnaros_() {
        Item item = new Item("Other",-1,5);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Other, -2, 3",gildedRose.getItems()[0].toString());
    }

}
