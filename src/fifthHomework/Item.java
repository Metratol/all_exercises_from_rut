package fifthHomework;

public class Item implements Thing{
    protected int count;

    protected Item(int count) throws IllegalArgumentException {
        this.setCount(count);
    }

    protected void setCount(int count) {
        if(count < 1 || count > 5) throw new IllegalArgumentException("Incorrect value for amount");
        else this.count = count;
    }

    @Override
    public int use() {
        int saveCount = this.count;
        this.count = count;
        return saveCount;
    }

    @Override
    public boolean isUsed() {
        return count == 0;
    }
}
