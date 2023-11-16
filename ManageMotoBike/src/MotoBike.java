public class MotoBike {
    private int id;
    private String name;
    private double price;
    private int cc;
    static int idIncrement = 1;

    public MotoBike(int id, String name, double price, int cc) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cc = cc;
    }

    public MotoBike() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public static int getIdIncrement() {
        return idIncrement;
    }

    public static void setIdIncrement(int idIncrement) {
        MotoBike.idIncrement = idIncrement;
    }

    @Override
    public String toString() {
        return "MotoBike{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", cc=" + cc +
                '}';
    }
}
