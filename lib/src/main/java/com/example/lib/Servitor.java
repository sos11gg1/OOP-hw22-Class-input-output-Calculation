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
        System.out.println("�п�J���u�ƶq(�̦h15��)");
        servitorNumber = scanner.nextInt();
        while (servitorNumber>15){
            System.out.println("�Э��s��J���u�ƶq(�̦h15��)");
            servitorNumber = scanner.nextInt();
        }
    }
    public void setAllVariable(){
        for(int i=0;i<servitorNumber;i++){
            System.out.printf("�п�J��%d����u�s��\n",(i+1));
            setStaffnumber(i,scanner.next());
            System.out.printf("�п�J��%d��m�W\n",(i+1));
            setName(i,scanner.next());
            System.out.printf("�п�J��%d����~\n",(i+1));
            setSalaryPerHour(i,scanner.next());
            System.out.printf("�п�J��%d��u�@�ɼ�\n",(i+1));
            setWorkHour(i,scanner.next());
        }
    }
    public void calc(){
        for(int i=0;i<servitorNumber;i++){
            setMonthlyIncome(i,String.valueOf(Integer.parseInt(SalaryPerHour[i])*Integer.parseInt(WorkHour[i])));
            System.out.printf("��%d����u�s��: %s �m�W: %s ���~: %s �u�@�ɼ�: %s �리�J: %s \n",(i+1),Staffnumber[i],Name[i],SalaryPerHour[i],WorkHour[i],MonthlyIncome[i]);
        }
    }
    public void printAllType(){
        System.out.printf("���u�s��: %s �m�W: %s ���~: %s �u�@�ɼ�: %s �리�J: %s \n",Staffnumber,Name,SalaryPerHour,WorkHour,MonthlyIncome);
    }
}
