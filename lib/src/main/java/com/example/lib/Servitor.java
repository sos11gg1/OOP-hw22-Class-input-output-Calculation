package com.example.lib;

import java.util.Scanner;

public class Servitor {
    private Scanner scanner = new Scanner(System.in);
    String a,b,c,d,e,f,g,h,i,j,k,l,m,n,o;
    private String Staffnumber[] ={a,b,c,d,e,f,g,h,i,j,k,l,m,n,o};
    private String Name[]={a,b,c,d,e,f,g,h,i,j,k,l,m,n,o};
    private String SalaryPerHour[]={a,b,c,d,e,f,g,h,i,j,k,l,m,n,o};
    private String WorkHour[]={a,b,c,d,e,f,g,h,i,j,k,l,m,n,o};
    private String MonthlyIncome[]={a,b,c,d,e,f,g,h,i,j,k,l,m,n,o};
    private int servitorNumber=0;

    public void setStaffnumber(int i,String setStaffnumber){
        Staffnumber[i] = setStaffnumber;
    }
    public void setName(int i,String setName){
        Name[i] = setName;
    }
    public void setSalaryPerHour(int i,String setSalaryPerHour){
        SalaryPerHour[i] = setSalaryPerHour;
    }
    public void setWorkHour(int i,String setWorkHour){
        WorkHour[i] = setWorkHour;
    }
    public void setMonthlyIncome(int i,String setMonthlyIncome){
        MonthlyIncome[i] = setMonthlyIncome;
    }

    public void setServitorNumber(){
        System.out.println("請輸入員工數量(最多15位)");
        servitorNumber = scanner.nextInt();
        while (servitorNumber>15){
            System.out.println("請重新輸入員工數量(最多15位)");
            servitorNumber = scanner.nextInt();
        }
    }
    public void setAllVariable(){
        for(int i=0;i<servitorNumber;i++){
            System.out.printf("請輸入第%d位員工編號\n",(i+1));
            setStaffnumber(i,scanner.next());
            System.out.printf("請輸入第%d位姓名\n",(i+1));
            setName(i,scanner.next());
            System.out.printf("請輸入第%d位時薪\n",(i+1));
            setSalaryPerHour(i,scanner.next());
            System.out.printf("請輸入第%d位工作時數\n",(i+1));
            setWorkHour(i,scanner.next());
        }
    }
    public void calc(){
        for(int i=0;i<servitorNumber;i++){
            setMonthlyIncome(i,String.valueOf(Integer.parseInt(SalaryPerHour[i])*Integer.parseInt(WorkHour[i])));
            System.out.printf("第%d位員工編號: %s 姓名: %s 時薪: %s 工作時數: %s 月收入: %s \n",(i+1),Staffnumber[i],Name[i],SalaryPerHour[i],WorkHour[i],MonthlyIncome[i]);
        }
    }
    public void printAllType(){
        System.out.printf("員工編號: %s 姓名: %s 時薪: %s 工作時數: %s 月收入: %s \n",Staffnumber,Name,SalaryPerHour,WorkHour,MonthlyIncome);
    }
}
