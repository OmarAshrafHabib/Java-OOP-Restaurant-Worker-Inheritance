/**
 * represents the chef from the resturant worker class
 * 
 * @author Omar Habib ID:3742418
 */
public class Chef extends RestaurantWorker {
    /**
     * the union fees of the chef
     */
    public double unionFees;

    /**
     * adds the union fee for the chef from the restaurant worker class
     * 
     * @param name
     * @param jobTitle
     * @param hourlySalary
     * @param unionFees
     */
    public Chef(String name, String jobTitle, double hourlySalary, double unionFees) {
        super(name, jobTitle, hourlySalary);
        this.unionFees = unionFees;
    }

    /**
     * retrives the chefs weekly pay
     * 
     * @return chefpay
     */
    public double computePay(double hours) {
        if (hours > 40) {
            double left = hours - 40;
            double extra = left * super.getSalary() * 1.5;
            double chefpay = super.computePay(40) + extra - unionFees;
            return chefpay;
        }
        double chefpay = super.computePay(hours) - unionFees;
        return chefpay;

    }

}
