
import java.lang.*;
import classes.*;
import interfaces.*;
import file.*;
import java.util.*;

public class Start {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Bank b = new Bank();
        FileWrite thf = new FileWrite();

        boolean choice = true;

        while (choice) {
            System.out.println("Program Running__________________ ");
            System.out.println("--------------------------------------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Customer Account Management");
            System.out.println("4. Account Transaction Management");
            System.out.println("5. Exit");
            System.out.println("--------------------------------------\n");

            System.out.print("Please select an option: ");
            int option = scan.nextInt();

            switch (option) {
                case 1:

                    System.out.println("");
                    System.out.println("Options for Employee Management:\n");
                    System.out.println("--------------------------------------");
                    System.out.println("1. Insert New Employee");
                    System.out.println("2. Remove an Existing Employee");
                    System.out.println("3. Show All Employees");
                    System.out.println("--------------------------------------\n");
                    System.out.print("Enter your option: ");
                    int input1 = scan.nextInt();

                    switch (input1) {
                        case 1:
                            try {

                                System.out.println("");
                                System.out.println("Insert New Employee");

                                System.out.print("Enter Employee ID: ");
                                String empId1 = scan.next();

                                System.out.print("Enter Employee Name: ");
                                String name1 = scan.next();

                                System.out.print("Enter Employee Salary: ");
                                double salary = scan.nextDouble();

                                Employee e1 = new Employee();
                                e1.setEmpId(empId1);
                                e1.setName(name1);
                                e1.setSalary(salary);

                                b.insertEmployee(e1);

                                System.out.println("");
                            } catch (Exception i) {
                                System.out.println("Please input correct value");
                            }

                            break;

                        case 2:
                            try {
                                System.out.println("");
                                System.out.println("Remove Existing Employee");

                                System.out.print("Enter Employee ID: ");
                                String empId3 = scan.next();

                                Employee e3 = b.getEmployee(empId3);
                                b.removeEmployee(e3);

                                System.out.println("");
                            } catch (Exception i) {
                                System.out.println("Please input correct value");
                            }
                            break;

                        case 3:

                            System.out.println("");
                            System.out.println("Show All Employees");

                            b.showAllEmployees();
                            System.out.println("");
                            break;

                        default:
                            System.out.println("");
                            System.out.println("Invaild Choice");

                            break;
                    }
                    System.out.println("********************");
                    break;

                case 2:

                    System.out.println("");
                    System.out.println("Options for Customer Management:\n");
                    System.out.println("--------------------------------------");
                    System.out.println("1. Insert New Customer");
                    System.out.println("2. Remove Existing Customer");
                    System.out.println("3. Show All Customers");
                    System.out.println("--------------------------------------\n");
                    System.out.print("Enter your option: ");
                    int input2 = scan.nextInt();

                    switch (input2) {
                        case 1:
                            try {
                                System.out.println("");
                                System.out.println("Insert New Customer");

                                System.out.print("Enter Customer Nid: ");
                                int nid1 = scan.nextInt();

                                System.out.print("Enter Customer Name: ");
                                String name1 = scan.next();

                                Customer c1 = new Customer();
                                c1.setNid(nid1);
                                c1.setName(name1);

                                b.insertCustomer(c1);

                                System.out.println("");
                            } catch (Exception i) {
                                System.out.println("Please input correct value");
                            }
                            break;

                        case 2:
                            try {
                                System.out.println("");
                                System.out.println("Remove Existing Customer");

                                System.out.print("Enter Customer NID: ");
                                int nid3 = scan.nextInt();

                                Customer c3 = b.getCustomer(nid3);
                                b.removeCustomer(c3);

                                System.out.println("");
                            } catch (Exception i) {
                                System.out.println("Please input correct value");
                            }
                            break;

                        case 3:

                            System.out.println("");
                            System.out.println("Show All Customers");

                            b.showAllCustomers();
                            System.out.println("");
                            break;

                        default:

                            System.out.println("Invaild Choice");
                            System.out.println("");
                            break;
                    }
                    System.out.println("********************");
                    break;

                case 3:

                    System.out.println("");
                    System.out.println("Options for Customer Account Management:\n");
                    System.out.println("--------------------------------------");
                    System.out.println("1. Insert New Account");
                    System.out.println("2. Remove an Existing Account");
                    System.out.println("3. Show All Accounts");
                    System.out.println("--------------------------------------\n");
                    System.out.print("Enter your option: ");
                    int input3 = scan.nextInt();

                    switch (input3) {
                        case 1:
                            try {
                                System.out.println("");

                                System.out.println("Which Type of Account Do you Want to Create?");
                                System.out.println("1. Savings Account");
                                System.out.println("2. Fixed Account");

                                System.out.print("Choose here: ");
                                int type = scan.nextInt();

                                Account a = null;

                                if (type == 1) {
                                    System.out.print("Enter Account Number: ");
                                    int an1 = scan.nextInt();
                                    System.out.print("Enter Account Balance: ");
                                    double balance1 = scan.nextDouble();
                                    System.out.print("Enter Interest Rate: ");
                                    double ir1 = scan.nextDouble();

                                    SavingsAccount sa = new SavingsAccount();

                                    sa.setAccountNumber(an1);
                                    sa.setBalance(balance1);
                                    sa.setInterestRate(ir1);

                                    a = sa;
                                } else if (type == 2) {
                                    System.out.print("Enter Account Number: ");
                                    int an1 = scan.nextInt();
                                    System.out.print("Enter Account Balance: ");
                                    double balance1 = scan.nextDouble();
                                    System.out.print("Enter Tenure Year: ");
                                    int ty1 = scan.nextInt();

                                    FixedAccount fa = new FixedAccount();

                                    fa.setAccountNumber(an1);
                                    fa.setBalance(balance1);
                                    fa.setTenureYear(ty1);

                                    a = fa;
                                }
                            
                            else {
                                System.out.println("Invalid choice");
                            }
							if(a != null)
							{
								System.out.print("Enter Customer NID: ");
								int nid1 = scan.nextInt();
								
								b.getCustomer(nid1).insertAccount(a);
							}
							
                            System.out.println("");
                            } catch (Exception i) {
                                System.out.println("Please input correct value");
                            }
                            break;

                        case 2:
                            try {
                                System.out.println("");
                                System.out.println("Remove an Existing Account");

                                System.out.print("Enter Customer NID: ");
                                int nid3 = scan.nextInt();
                                System.out.print("Enter Account Number: ");
                                int an3 = scan.nextInt();

                                b.getCustomer(nid3).removeAccount(b.getCustomer(nid3).getAccount(an3));

                                System.out.println("");
                            } catch (Exception i) {
                                System.out.println("Please input correct value");
                            }
                            break;

                        case 3:

                            System.out.println("");
                            System.out.println("Show All Accounts");
                            System.out.print("Enter Customer NID: ");
                            int nid4 = scan.nextInt();

                            b.getCustomer(nid4).showAllAccounts();

                            System.out.println("");
                            break;

                        default:

                            System.out.println("");
                            System.out.println("Invalid Option");
                            System.out.println("");
                            break;

                    }

                    System.out.println("********************");
                    break;

                case 4:

                    System.out.println("Options for Account Transaction");
                    System.out.println("--------------------------------------");
                    System.out.println("1. Deposit Money");
                    System.out.println("2. Withdraw Money");
                    System.out.println("3. Transfer Money");
                    System.out.println("--------------------------------------\n");

                    System.out.print("Enter your option: ");
                    int input4 = scan.nextInt();

                    switch (input4) {
                        case 1:
                            try {
                                System.out.println("");
                                System.out.println("Deposit Money\n");

                                System.out.print("Enter Customer NID: ");
                                int nid1 = scan.nextInt();
                                System.out.print("Enter Account Number: ");
                                int an1 = scan.nextInt();
                                System.out.print("Enter Deposit Amount: ");
                                double amount1 = scan.nextDouble();

                                if (amount1 > 0) {
                                    b.getCustomer(nid1).getAccount(an1).deposit(amount1);

                                    thf.writeInFile("Deposit	: TK" + amount1 + " in " + an1);
                                }

                                System.out.println("");
                            } catch (Exception i) {
                                System.out.println("Please input correct value");
                            }
                            break;

                        case 2:
                            try {
                                System.out.println("");
                                System.out.println("Withdraw Money");

                                System.out.print("Enter Customer NID: ");
                                int nid2 = scan.nextInt();
                                System.out.print("Enter Account Number: ");
                                int an2 = scan.nextInt();
                                System.out.print("Enter Withdraw Amount: ");
                                double amount2 = scan.nextDouble();

                                if (amount2 > 0 && amount2 <= b.getCustomer(nid2).getAccount(an2).getBalance()) {
                                    b.getCustomer(nid2).getAccount(an2).withdraw(amount2);

                                    thf.writeInFile("Withdraw	: TK" + amount2 + " from " + an2);
                                }

                                System.out.println("");
                            } catch (Exception i) {
                                System.out.println("Please input correct value");
                            }
                            break;

                        case 3:
                            try {

                                System.out.println("");
                                System.out.println("Transfer Money");

                                System.out.print("Enter From Customer NID: ");
                                int fromNid = scan.nextInt();
                                System.out.print("Enter From Account Number: ");
                                int fromAN = scan.nextInt();
                                System.out.print("Enter Transfer Amount: ");
                                double amount3 = scan.nextDouble();

                                System.out.print("Enter To Customer NID: ");
                                int toNid = scan.nextInt();
                                System.out.print("Enter To Account Number: ");
                                int toAN = scan.nextInt();

                                if (amount3 > 0 && amount3 <= b.getCustomer(fromNid).getAccount(fromAN).getBalance()) {
                                    b.getCustomer(fromNid).getAccount(fromAN).transfer(b.getCustomer(toNid).getAccount(toAN), amount3);

                                    thf.writeInFile("Transfer	: TK" + amount3 + " from " + fromAN + " to " + toAN);

                                }

                                System.out.println("");
                            } catch (Exception i) {
                                System.out.println("Please input correct value");
                            }
                            break;

                        default:

                            System.out.println("");
                            System.out.println("Invalid Option");
                            System.out.println("");
                            break;
                    }

                    break;

                case 5:

                    System.out.println("");
                    System.out.println("Program Closed");
                    choice = false;
                    System.out.println("********************************************************************");
                    break;

                default:

                    System.out.println("");
                    System.out.println("Invalid Option");
                    System.out.println("***********************");
                    break;
            }

        }

    }
}
