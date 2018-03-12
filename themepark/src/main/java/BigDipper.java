public class BigDipper extends Ride implements IRestrict{
    public BigDipper(String name, int price, int minHight, int maxHight) {
        super(name, price, minHight, maxHight);
    }

    @Override
    public boolean restrict(IRide rider) {
        if (this.heightOK(rider.getHeight()) && this.ageOK(rider.getPersonType())) {
            return false;
        }
        else {
            return true;
        }  // true means they are restricted!! fail to get on ride.
    }

    @Override
    public boolean heightOK(int height) {
        if (height <= this.getMaxHeight() && height >= this.getMinHeight()) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean ageOK(PersonType personType) {
        if (personType == PersonType.ADULT || personType == PersonType.OLD) {
            return true;
        }
        else {
            return false;
        }
    }
}
