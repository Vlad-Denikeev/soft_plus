public class Test2 {

    public static void main(String[] args) {

        Discounter discounter = new Discounter();
        discounter.price[0] = 5;
        discounter.price[1] = 100;
        discounter.price[2] = 20;
        discounter.price[3] = 66;
        discounter.price[4] = 16;
        discounter.getDiscount(discounter.price, discounter.discount, discounter.offset, discounter.readLength);
    }


}
