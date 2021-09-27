public class Car implements Tradable, Drivable{
    private int maxSpeed;

    public Car(){this.maxSpeed = 5;}

    @Override
    public void upgradeSpeed(){this.maxSpeed++;}

    @Override
    public void downgradeSpeed(){this.maxSpeed--;}

    @Override
    public int getMaxSpeed(){return this.maxSpeed;}

    @Override
    public int getPrice(){return 50;}


}
