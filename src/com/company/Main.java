package com.company;

public class Main {

    public static void main(String[] args) {
        CommisionEmployee employee=new CommisionEmployee("Jan","Nowak",5000,0.9);
        System.out.println("First name is " + employee.getFirstName());
        System.out.println("Gross sales is " + employee.getGrossSales());
        System.out.println("Commision rate is " + employee.getCommisionRate());

        employee.setGrossSales(5000);
        employee.setCommisionRate(0.1);

        System.out.println("First name is " + employee.getFirstName());
        System.out.println("Gross sales is " + employee.getGrossSales());
        System.out.println("Commision rate is " + employee.getCommisionRate());
        System.out.println("Earnings employee " + employee.earnings());

        employee.setGrossSales(-5000);
        employee.setCommisionRate(-0.1);


        System.out.println("First name is " + employee.getFirstName());
        System.out.println("Gross sales is " + employee.getGrossSales());
        System.out.println("Commision rate is " + employee.getCommisionRate());

        BaseEmployee baseEmployee=new BaseEmployee("Jane", "Fonda", 666, 0.2, 2000);

        CommisionEmployee employee2=baseEmployee;
        System.out.println("earnings "+employee2.earnings());

        Payable[] payableObjects=new Payable[4];
        payableObjects[0]=new Invoice(01, 1,100,"chair");
        payableObjects[1]=new Invoice(02, 2,200,"sofa");
        payableObjects[2]=new SalariedEmployee("Jan","Kowalski",2000);
        payableObjects[3]=new SalariedEmployee("Jane","Fonda",20000);

        for(Payable currentPayable:payableObjects){
            System.out.println(currentPayable.getPaymentAmount());
        }
    }

}
