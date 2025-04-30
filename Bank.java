import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bank {
    Scanner sc = new Scanner(System.in);

    String name;
    String name1;
    String actype;
    long phno;
    float acmoney;
    float money; 
    float dmoney;
    int nam;
    int select;
    int del = 1; 
    int hel = 2;
    Random rand = new Random();
    int rand_int1 = rand.nextInt(100000000);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    Bank() {
        System.out.println("          ------ BANK MAINTAINANCE -----");
        System.out.println("  ");
        System.out.print("Enter your First name : ");
        name = sc.next();
        System.out.print("Enter your Last name : ");
        name1 = sc.next();
        System.out.println("Select Account type (Savings/Current) : ");
        actype = sc.next();
        System.out.println("Enter your Phone number : ");
        phno = sc.nextLong();
        System.out.println("Your Account Number is :SVI" + rand_int1);
        System.out.println("Enter Amount :");
        acmoney = sc.nextFloat();
        System.out.println("  ");
        System.out.println(dtf.format(now));
        System.out.println("------------Account is Successully Created --------------     ");
        System.out.println(
                "Select The Following Options : \n 1. Deposite Money \n 2. Withdrawl money \n 3. Show Account Details \n 4. Delete Account ");

        while (select < 4) {
            System.out.print(" Enter Number for select options : ");
            select = sc.nextInt();
            LocalDateTime now = LocalDateTime.now();
            switch (select) {
                case 1:
                    System.out.println("  ");
                    System.out.println("-------Deposite Money-------");
                    System.out.println(" Enter amount :");
                    money = sc.nextFloat();
                    System.out.println(" Current Account Status : ");
                    System.out.println("  ");
                    acmoney += money;
                    display();
                    percen();

                    System.out.println(dtf.format(now));

                    break;
                case 2:
                    System.out.println("-------Withdrawl Money-------");
                    System.out.println("Enter Amount : ");
                    dmoney = sc.nextFloat();
                    System.out.println(" ");
                    System.out.println(" Current Account Status : ");
                    System.out.println("  ");
                    display();
                    if (acmoney > dmoney) {
                        acmoney -= dmoney;
                        System.out.println(" Current Balance :" + acmoney);
                    } else {
                        System.out.println("Insufficient Balance");
                        System.out.println("Please Check the amount");
                    }
                    System.out.println(dtf.format(now));
                    break;
                case 3:
                    display();
                    System.out.println(" Current Balance :" + acmoney);
                    System.out.println(dtf.format(now));
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("Urgent Notice (Type 1/2) : ");
                    System.out.println("  1. Stay Account in this Bank");
                    System.out.println("  2. Delete Your account ");
                    System.out.println(" ");
                    System.out.println("Enter Valid no :");
                    nam = sc.nextInt();
                    System.out.println(" ");
                    if (del == nam) {
                        display();
                        System.out.println(" Current Balance :" + acmoney);

                    } else {
                        System.out.print("");

                    }
                    if (hel == nam) {
                        System.out.println("Your Account is Successfully deleted ");
                    } else {
                        System.out.println("");

                    }
                    System.out.println(dtf.format(now));
                    break;
                default:
                    System.out.println("Unavailable !!!!");
                    System.out.println(dtf.format(now));
            }

            System.out.println(" ");
        }
    }

    void display() {
        System.out.println(" Name : " + name + " " + name1);
        System.out.println(" Account type : " + actype);
        System.out.println(" Account Number :SVI" + rand_int1);

    }

    void percen() {
        acmoney += acmoney * 5 / 100;
        System.out.println(" Current Balance :" + acmoney);

    }

    void show() {
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.show();
    }
}
