package ioStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;
import java.util.Properties;
import com.nit.hk.ios.helper.AccTypeMap;

public class BankAccount implements  Comparable<BankAccount>,Serializable{
    private static String bankName;
    private static String branchName;
    private static String ifsc;

    private long accNum;
    private  String accHName;
    private double balance;
    transient private String username;// not participate in ser
    transient private String password;// not participate in ser
    private String accType;

    static {
        BufferedReader br = null;
        try (
                // br = new BufferedReader(new FileReader("Bank.txt"));
                FileReader reader = new FileReader("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\ioStream\\Bank.txt");
                )

            {
                Properties bankProperties = new Properties();
                bankProperties.load(reader);
//                bankName = br.readLine();
//                branchName = br.readLine();
//                ifsc = br.readLine();
               bankName= bankProperties.getProperty("BANK_NAME");
               branchName = bankProperties.getProperty("BRANCH_NAME");
               ifsc = bankProperties.getProperty("IFSC");
                System.out.println("BA SB is executed");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public BankAccount() {
        System.out.println("BA NPC is excuted");
    }

    public static String getIfsc() {
        return ifsc;
    }

    public static void setIfsc(String ifsc) {
        BankAccount.ifsc = ifsc;
    }

    public long getAccNum() {
        return accNum;
    }

    public String getAccHName() {
        return accHName;
    }

    public void setAccHName(String accHName) {
        this.accHName = accHName;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getBranchName() {
        return branchName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setBranchName(String branchName) {
        BankAccount.branchName = branchName;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String bankName) {
        BankAccount.bankName = bankName;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    //store collection

    public int hashCode(){
        return AccTypeMap.getAccTypeID(accType);
    }

    //equls method is acc present or not

    public boolean equals(Object obj){
        if(obj instanceof BankAccount) {
            BankAccount acc = (BankAccount) obj;
            return this.accType.equals(acc.accType) && this.accNum == acc.accNum;
        }
        return false;
    }

    //compareto method


    @Override
    public int compareTo(BankAccount acc) {
        int accTypeDiff = AccTypeMap.getAccTypeID(this.accType) - AccTypeMap.getAccTypeID(acc.accType);
        if(accTypeDiff == 0){
            long accNumDiff = this.accNum - acc.accNum;
            if(accNumDiff < 0){
                return -1;
            }else if(accNumDiff > 0){
                return 1;
            }else{
                return 0;
            }
        }
        return accTypeDiff;
    }

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();
        sb.append("\nBankName\t:"+bankName);
        sb.append("\nBranchName\t:"+branchName);
        sb.append("\nIFSC\t\t:"+ifsc);
        sb.append("\naccNum\t\t:"+accNum);
        sb.append("\naccHName\t\t:"+accHName);
        sb.append("\nbalance\t\t:"+balance);
        sb.append("\nusername\t\t:"+username);
        sb.append("\npassword\t\t:"+password);
        sb.append("\naccType\t\t:"+accType);
        return sb.toString();
    }
}
