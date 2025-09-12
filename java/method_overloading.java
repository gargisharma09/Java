/*function overloading */
class function_overloading{
    public double calculatebill(int price){
        return price;

    }

    public double calculatebill(int price , int quantity){
        return price * quantity;


    }

    public double calculatebill(int price , int quatity, int discount){
        double total = price* quantity;
        double discount = total * (discount/ 100);
        return total - discount;

    }

    public static void main(string[] args){
        System.out.println("bill for single item : " + calculatebill(200));
        System.out.println("bill for multiple item : " + calculatebill(200,4));
        System.out.println("bill with discount : " + calculatebill(200,4,10));

    }
}
