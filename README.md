# Java OOP: Restaurant Worker Payroll System

## Overview
This project demonstrates Java inheritance by modeling a restaurant payroll system with various employee roles. It includes base and subclass implementations to calculate weekly pay for different worker types, incorporating unique pay rules and allowances for each role.

### Classes
1. **RestaurantWorker**: Base class with properties for worker name, job title, and hourly pay. Includes a method to calculate weekly pay based on hours worked.
2. **Server**: Inherits from `RestaurantWorker`, with an added footwear allowance per full hour worked.
3. **Chef**: Inherits from `RestaurantWorker`, with a union fee deduction and overtime pay for hours worked over 40.

### Features
- **Inheritance and "is-a" Relationship**: Demonstrates inheritance by creating subclasses `Server` and `Chef` with specific payment rules.
- **Formatted Output**: Outputs a neatly formatted table with workers' names, job titles, hourly pay rates, and weekly pay, using `NumberFormat` for currency display.
- **Polymorphism**: Uses a single test driver, `Payroll`, to compute pay for all types of `RestaurantWorker`.

## Usage
1. Compile `RestaurantWorker.java`, `Server.java`, `Chef.java`, and `Payroll.java`.
2. Run `Payroll.java` to display a payroll report for the provided test employees, showing each worker’s weekly pay based on hours worked.

## Documentation
Javadoc comments are included in each class, describing properties and methods with `@param` and `@return` tags.

## Project Files
- `RestaurantWorker.java`: Base class for all restaurant workers.
- `Server.java` and `Chef.java`: Subclasses with specific pay rules.
- `Payroll.java`: Driver to test and display payroll information.
- Sample output is included for reference.
