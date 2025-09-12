/*  an ecommere website needs to calculate the total bill amount depending on the number of item or item + discount .
 * calculate the bill (int price , int quantity)>> calculates total bill for  given price and quantity
 * /calculate the bill (int price , int quantity , double  discount)>> calculates bill after applying discount 
 * calculate bill (int price ) -- calculate bill for single item
 */

class ECommerceBill {
public double calculateBill(int price) {
        return price;
    }

    public double calculateBill(int price, int quantity) {
        return price * quantity;
    }

    public double calculateBill(int price, int quantity, double discount) {
        double total = price * quantity;
        double discountAmount = total * (discount / 100); // discount in %
        return total - discountAmount;
    }

    public static void main(String[] args) {
        ECommerceBill bill = new ECommerceBill();

        // Example usage
        System.out.println("Bill for single item: " + bill.calculateBill(500));
        System.out.println("Bill for multiple items: " + bill.calculateBill(500, 3));
        System.out.println("Bill with discount: " + bill.calculateBill(500, 3, 10));
    }
}

