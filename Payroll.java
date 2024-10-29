
/**
*this class creats the resturant workers objects
*@author Omar Habib ID:3742418 
*/
import java.text.NumberFormat;
import java.util.Locale;

public class Payroll {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);

        RestaurantWorker jeffrey = new RestaurantWorker("Jeffrey Kingston", "Busser", 13.75);
        RestaurantWorker fiona = new RestaurantWorker("Fiona Grant-Long", "Busser", 13.95);
        RestaurantWorker roger = new RestaurantWorker("Roger Haines", "Dishwasher", 14.50);
        Server jonathan = new Server("Jonathan Gorman", "Server", 14.50, 0.12);
        Server tanya = new Server("Tanya Masterson", "Server", 13.75, 0.10);
        Server brittany = new Server("Brittany Phillips", "Server", 15.50, 0.15);
        Chef laura = new Chef("Laura Cox", "Executive Chef", 26.5, 67);
        Chef thomas = new Chef("Thomas Mclean", "Sous Chef", 21.50, 43.50);
        Chef nathaniel = new Chef("Nathaniel Paul", "Sous Chef", 22.75, 43.50);
        Chef eleanor = new Chef("Eleanor Ryan", "Pastry Chef", 20, 39);

        System.out.println("Worker's Name & Job Title \tRate of Pay \tPay this week"
                + "\n=========================\t" + "===========\t" + "=============\t"
                + "\n" + jeffrey.getName() + " (" + jeffrey.getJobTitle() + ")\t"
                + formatter.format(jeffrey.getSalary()) + "/hr\t"
                + formatter.format(jeffrey.computePay(18))
                + "\n" + fiona.getName() + " (" + fiona.getJobTitle() + ")\t" + formatter.format(fiona.getSalary())
                + "/hr\t"
                + formatter.format(fiona.computePay(14.5))
                + "\n" + roger.getName() + " (" + roger.getJobTitle() + ")\t" + formatter.format(roger.getSalary())
                + "/hr  \t"
                + formatter.format(roger.computePay(42))
                + "\n" + jonathan.getName() + " (" + jonathan.getJobTitle() + ")\t"
                + formatter.format(jonathan.getSalary()) + "/hr  \t"
                + formatter.format(jonathan.computePay(46.5))
                + "\n" + tanya.getName() + " (" + tanya.getJobTitle() + ")\t" + formatter.format(tanya.getSalary())
                + "/hr\t"
                + formatter.format(tanya.computePay(18))
                + "\n" + brittany.getName() + " (" + brittany.getJobTitle() + ")\t"
                + formatter.format(brittany.getSalary()) + "/hr  \t"
                + formatter.format(brittany.computePay(38.5))
                + "\n" + laura.getName() + " (" + laura.getJobTitle() + ")\t" + formatter.format(laura.getSalary())
                + "/hr  \t"
                + formatter.format(laura.computePay(46.5))
                + "\n" + thomas.getName() + " (" + thomas.getJobTitle() + ")\t" + formatter.format(thomas.getSalary())
                + "/hr \t"
                + formatter.format(thomas.computePay(18))
                + "\n" + nathaniel.getName() + " (" + nathaniel.getJobTitle() + ")\t"
                + formatter.format(nathaniel.getSalary()) + "/hr \t"
                + formatter.format(nathaniel.computePay(26))
                + "\n" + eleanor.getName() + " (" + eleanor.getJobTitle() + ")\t"
                + formatter.format(eleanor.getSalary()) + "/hr \t"
                + formatter.format(eleanor.computePay(42)));

    }
}
