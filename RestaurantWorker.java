/**
 * this class represents a resturant worker
 * 
 * @author Omar Habib ID:3742418
 */
public class RestaurantWorker {
    /**
     * their name
     */
    private String name;
    /**
     * their job title
     */
    private String jobTitle;
    /**
     * their hour salary
     */
    private double hourlySalary;

    /**
     * this is a constructer to creat the worker object
     * 
     * @param name
     * @param jobTitle
     * @param hourlySalary
     */
    public RestaurantWorker(String name, String jobTitle, double hourlySalary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.hourlySalary = hourlySalary;
    }

    /**
     * retrives their name
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * retrievs their job title
     * 
     * @return jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * retrievs the hourly salary
     * 
     * @return hourlySalary
     */
    public double getSalary() {
        return hourlySalary;
    }

    /**
     * calculates the weekly pay
     * 
     * @param hours
     * @return weekpay
     */
    public double computePay(double hours) {
        double weekPay = hours * hourlySalary;
        return weekPay;
    }
}
