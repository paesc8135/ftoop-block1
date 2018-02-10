public class Backend {
    private int x;
    private int y;

    public Backend(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public long rechneXminusY() {
        return x - y;
    }

    public long rechneXmalY() {
        return x * y;
    }

    public long rechneXmoduloY() {
        return x % y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
