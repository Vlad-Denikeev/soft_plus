public class Discounter {

    int[] price = new int[5];
    int discount = 50;
    int offset = 1;
    int readLength = 3;

    void getDiscount(int[] price, int discount, int offset, int readLength ) {
        double[] reader = new double[readLength];
        int k = 0;
        for(int i = 0; i <5; i++) {
            if (i >= offset && k < 3) {
                reader[k] = ( (double) price[i]/100)*discount;
                k++;

            }
            if(k == readLength) {
                break;
            }
        }
        for(int i = 0; i < reader.length; i++) {
            System.out.println((int)reader[i]);
        }
    }
}
