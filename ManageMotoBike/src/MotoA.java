public class MotoA extends MotoBike{
    public MotoA() {
    }

    public MotoA(int id, String name, double price, int cc) {
        super(id, name, price, cc);
    }

    @Override
    public int getCc() {
        return super.getCc();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setCc(int cc) {
        super.setCc(cc);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }



}
