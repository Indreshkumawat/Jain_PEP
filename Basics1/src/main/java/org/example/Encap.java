package org.example;
class Account{
    private int accountNo;
    private int balance;
    private String name;


    public int getAccountNo(){
        return accountNo;
    }
    public int getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int withDraw(int acc,int amount){
        if(accountNo == acc){
            balance -= amount;
            return balance;
        }else{
            System.out.println("Give correct account no ");
            return 0;
        }
    }
//    public void deposit(){
//
//    }

}
public class Encap {
    public static void main(String[] args){
        Account a1 = new Account();

        a1.setName("Indresh");
        a1.setAccountNo(12345678);
        a1.setBalance(10000);

        System.out.println(a1.getAccountNo());
        System.out.println(a1.getName());
        System.out.println(a1.getBalance());

        System.out.println(a1.withDraw(1234567,2000));

    }
}
