package gildedRose;

public class AgedBrieStrategy extends UpdateStrategy {

    @Override
    void updateQualityAndSellIn(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
        item.sellIn--;
        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++;
        }
    }

}
