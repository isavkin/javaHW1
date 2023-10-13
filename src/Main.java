public class Main {
    public static void main(String[] args) {

        int ticketPrice = 1640;
        int bonusCost = 20;
        int accruedBonuses = ticketPrice / bonusCost;

        System.out.print("Вам начисленно следующее колличество бонусов " + accruedBonuses);

    }
}