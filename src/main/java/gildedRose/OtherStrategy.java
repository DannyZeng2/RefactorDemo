package gildedRose;

public class OtherStrategy extends UpdateStrategy {

    @Override
    void updateQualityAndSellIn(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
        item.sellIn--;
        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality--;
            }
        }
    }
}
