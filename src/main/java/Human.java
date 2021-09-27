public class Human implements Drivable, Domesticatable, Tradable{
    private int life_signals;
    public Human(){
        this.life_signals = 100;
    }
    @Override
    public String sound() {
        return "Hieeeeee";
    }

    @Override
    public void upgradeSpeed() {
        this.life_signals--;
    }

    @Override
    public void downgradeSpeed() {
        this.life_signals++;
    }

    @Override
    public int getMaxSpeed() {
        return this.life_signals;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (This person is dying in: " + this.life_signals +"secs)";
    }
}
