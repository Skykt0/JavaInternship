package Week4.inheritence;

public class Inheritence {
    public static void main(String args[]){
        MiniBankMachine obj = new MiniBankMachine();
        obj.balanceInquiry();
        obj.withdrawMoney(1000);
        obj.depositeMoney(10000);
    }
}

interface ATM{
    void withdrawMoney(int money);
    void balanceInquiry();    
}
interface DepositMachine{
    void depositeMoney(int money);  
}

class MiniBankMachine implements ATM,DepositMachine{
    int balance=1000;
    @Override
    public void withdrawMoney(int money) {
        if(money>balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance = balance-money;
            System.out.println(money+" deducted");
            System.out.println("remaining balance: "+balance);
        }
    }
    @Override
    public void balanceInquiry() {
        System.out.println("balance is: "+balance);
    }
    @Override
    public void depositeMoney(int money) {
        balance = balance + money;
        System.out.println("updated balance is: "+balance);
    }
}
