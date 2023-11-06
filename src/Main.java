public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.model = "IPHONE 15 PRO MAX";
        iphone.color = "blac";
        iphone.pamyat = 528;
        iphone.price = 220000;
        System.out.println("MODEL:" + iphone.model + "\n" + "COLOR : " + iphone.color + "\n" +
                "PRICE : " + iphone.price + "\n" + "PAMYAT : " + iphone.pamyat);
    }
}