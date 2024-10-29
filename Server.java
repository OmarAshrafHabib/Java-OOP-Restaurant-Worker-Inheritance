/**
 * represents a server from the resturant worker class
 * 
 * @author Omar Habib ID:3742418
 */
public class Server extends RestaurantWorker {
    /**
     * their footwearAllowence
     */
    public double footwearAllowence;

    /**
     * adds footwear allownce to the resturant worker class
     * 
     * @param name
     * @param jobTitle
     * @param hourlySalary
     * @param footwearAllowence
     */
    public Server(String name, String jobTitle, double hourlySalary, double footwearAllowence) {
        super(name, jobTitle, hourlySalary);
        this.footwearAllowence = footwearAllowence;
    }

    /**
     * retrieves the week pay for the server
     */
    public double computePay(double hours) {
        double pay = super.computePay(hours);
        double footwear = (int) hours * footwearAllowence;
        double total = pay + footwear;
        return total;
    }
}
