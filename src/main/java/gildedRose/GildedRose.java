package gildedRose;

public class GildedRose {
    static final String AGED_BRIE = "Aged Brie";
    static final String BACKSTAGE_PASSES_TO_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case AGED_BRIE:
                    new AgedBrieStrategy().updateQualityAndSellIn(item);
                    break;
                case BACKSTAGE_PASSES_TO_CONCERT:
                    new BackstageStrategy().updateQualityAndSellIn(item);
                    break;
                case SULFURAS_HAND_OF_RAGNAROS:
                    new SulfurasHandRagnarosStrategy().updateQualityAndSellIn(item);
                    break;
                default:
                    new OtherStrategy().updateQualityAndSellIn(item);
            }

        }
    }
}