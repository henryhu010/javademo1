/*
 * @Author: your name
 * @Date: 2020-05-26 09:42:04
 * @LastEditTime: 2020-05-26 16:21:45
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\Hero\Account.java
 */ 
package com.example.demo.controller.Hero;

public class Account {
    public double balance;

       public Account(){
        balance = 0;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(final double m){
        balance += m;
    }
    
    public void withdraw(final double m) throws OverdraftException{
        if(m > balance) throw new OverdraftException("余额不足");
            else {
                balance -= m;
            }
        }

    static class OverdraftException extends Exception {
        
        public OverdraftException() {
        }
        
        public OverdraftException(final String msg){
            super(msg);
        }
    }

    static class CheckingAccount extends Account {

        double overdraftProtection;
        public CheckingAccount(){
            overdraftProtection = 100;
        }

    @Override
    public void withdraw(final double m) throws OverdraftException{
        if(m <= balance) balance -= m;
            else if(m > (balance + overdraftProtection)) 
            throw new OverdraftException("余额和可用额度不足");
                else {
                    overdraftProtection = overdraftProtection - (m-balance);
                    balance = 0;
                }
            }
        }
    public static void main(final String[] args){
//        Account account = new Account();
        final CheckingAccount checkingAccount = new CheckingAccount();
        System.out.println("余额为:" + checkingAccount.balance);

        checkingAccount.deposit(500);
        System.out.println("余额为:" + checkingAccount.balance);

        try {
            checkingAccount.withdraw(700);
//            System.out.println("余额为" + account.balance);
            }
        catch (OverdraftException e){
                e.printStackTrace();
            }
            finally {
            System.out.println("余额为:" + checkingAccount.balance);
            System.out.println("剩余额度为:" + checkingAccount.overdraftProtection);
        }
    }
}