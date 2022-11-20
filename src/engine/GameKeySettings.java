package engine;

/**
 * Implements an object that stores a single game's key settings.
 */
public class GameKeySettings {

    private int leftMovingKey;
    /** VK Value of the key setting moving left. */
    private int rightMovingKey;
    /** VK Value of the key setting moving right. */
    private int shootingKey;
    /** VK Value of the key setting shooting bullet. */

    /**
     * Constructor.
     *
     * @param leftVK
     *            VK Value of the key setting moving left.
     * @param rightVK
     *            VK Value of the key setting moving right.
     * @param shootingVK
     *            VK Value of the key setting shooting bullet.
     */

    public GameKeySettings(final int leftVK, final int rightVK, final int shootingVK) {
        this.leftMovingKey = leftVK;
        this.rightMovingKey = rightVK;
        this.shootingKey = shootingVK;
    }

    public final int getLeftMovingKey() { return leftMovingKey; }
    /**
     * @return the leftMovingKey
     */
    public boolean setLeftMovingKey(final int leftVK) {
        if (rightMovingKey == leftVK || shootingKey == leftVK) return false;

        this.leftMovingKey = leftVK;
        return true;
    }
    /**
     * set the leftMovingKey
     * @return FALSE if exist duplicate key else TRUE
     */

    public final int getRightMovingKey() { return rightMovingKey; }
    /**
     * @return the rightMovingKey
     */
    public boolean setRightMovingKey(final int rightVK) {
        if (leftMovingKey == rightVK || shootingKey == rightVK) return false;

        this.rightMovingKey = rightVK;
        return true;
    }
    /**
     * set the rightMovingKey
     * @return FALSE if exist duplicate key else TRUE
     */

    public final int getShootingKey() { return shootingKey; }
    /**
     * @return the shootingKey
     */
    public boolean setShootingKey(final int shootingVK) {
        if (leftMovingKey == shootingVK || rightMovingKey == shootingVK) return false;

        this.shootingKey = shootingVK;
        return true;
    }
    /**
     * set the shootingKey
     * @return FALSE if exist duplicate key else TRUE
     */

}