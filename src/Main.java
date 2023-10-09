public class Main {
    public static void main(String[] args) {

        int ticketprice = 1640;
        int bonuscost = 20;
        int accrued_bonuses = ticketprice / bonuscost;

        System.out.print("Вам начисленно следующее колличество бонусов " + accrued_bonuses);

    }
}