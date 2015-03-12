package regis;
// Generated Jul 28, 2014 1:47:11 PM by Hibernate Tools 3.6.0



/**
 * BillDetails generated by hbm2java
 */
public class BillDetails  implements java.io.Serializable {


     private String username;
     private Integer subscriptionPeriod;
     private Integer currentBalance;
     private Integer monthlyBill;
     private Integer lastRecharge;

    public BillDetails() {
    }

	
    public BillDetails(String username) {
        this.username = username;
    }
    public BillDetails(String username, Integer subscriptionPeriod, Integer currentBalance, Integer monthlyBill, Integer lastRecharge) {
       this.username = username;
       this.subscriptionPeriod = subscriptionPeriod;
       this.currentBalance = currentBalance;
       this.monthlyBill = monthlyBill;
       this.lastRecharge = lastRecharge;
    }
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }
    
    public void setSubscriptionPeriod(Integer subscriptionPeriod) {
        this.subscriptionPeriod = subscriptionPeriod;
    }
    public Integer getCurrentBalance() {
        return this.currentBalance;
    }
    
    public void setCurrentBalance(Integer currentBalance) {
        this.currentBalance = currentBalance;
    }
    public Integer getMonthlyBill() {
        return this.monthlyBill;
    }
    
    public void setMonthlyBill(Integer monthlyBill) {
        this.monthlyBill = monthlyBill;
    }
    public Integer getLastRecharge() {
        return this.lastRecharge;
    }
    
    public void setLastRecharge(Integer lastRecharge) {
        this.lastRecharge = lastRecharge;
    }




}


