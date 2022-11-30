package entity;

import engine.DrawManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void setSprite() {
        Item item1 = new Item(100, 100, 10, Item.ItemType.ExtraLifeItem);
        item1.setSprite();

        assertEquals(DrawManager.SpriteType.ExtraLife, item1.spriteType);
    }

    @Test
    void setSprite2() {
        Item item2 = new Item(100, 100, 10, Item.ItemType.ShieldItem);
        item2.setSprite();

        assertEquals(DrawManager.SpriteType.ShieldItem, item2.spriteType);
    }

    @Test
    void setSprite3() {
        Item item3 = new Item(100, 100, 10, Item.ItemType.SpeedUpItem);
        item3.setSprite();

        assertEquals(DrawManager.SpriteType.ItemGet, item3.spriteType);
    }
}