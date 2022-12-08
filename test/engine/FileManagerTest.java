package engine;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.net.URLDecoder;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {
    FileManager fm = FileManager.getInstance();

    @Test
    void savefile() {
        try {
            String jarPath = FileManager.class.getProtectionDomain()
                    .getCodeSource().getLocation().getPath();
            jarPath = URLDecoder.decode(jarPath, "UTF-8");

            fm.Savefile(new GameState(0, 0, 0, 0, 0));
            File file = new File(jarPath + "../save");
            assertTrue(file.exists());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void deletefile() {
        try {
            String jarPath = FileManager.class.getProtectionDomain()
                    .getCodeSource().getLocation().getPath();
            jarPath = URLDecoder.decode(jarPath, "UTF-8");

            fm.deletefile();
            File file = new File(jarPath + "../save");
            assertFalse(file.exists());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}