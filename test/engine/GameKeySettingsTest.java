package engine;

import org.junit.jupiter.api.Test;

import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.*;

class GameKeySettingsTest {
    @Test
    void getLeftMovingKey_Test() {
        GameKeySettings preSet1 = new GameKeySettings(KeyEvent.VK_2, KeyEvent.VK_RIGHT, KeyEvent.VK_ENTER);

        assertEquals(KeyEvent.VK_2, preSet1.getLeftMovingKey());
    }

    @Test
    void getRightMovingKey_Test() {
        GameKeySettings preSet2 = new GameKeySettings(KeyEvent.VK_LEFT, KeyEvent.VK_LEFT, KeyEvent.VK_ENTER);

        assertEquals(KeyEvent.VK_LEFT, preSet2.getRightMovingKey());
    }

    @Test
    void getShootingKey_Test() {
        GameKeySettings preSet3 = new GameKeySettings(KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT, KeyEvent.VK_AT);

        assertEquals(KeyEvent.VK_AT, preSet3.getShootingKey());
    }
}