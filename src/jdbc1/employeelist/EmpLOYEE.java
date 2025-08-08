package jdbc1.employeelist;

public class EmpLOYEE {
    private String accountHolderName;
    private Long accountNumber;
    private Float balance;
    private Float overdraftLimit;
    private String kycVerified;
    private Float perDayWithdrawalLimit;

    public EmpLOYEE() {
    }

    public EmpLOYEE(String accountHolderName, Long accountNumber, Float balance, Float overdraftLimit,
                    String kycVerified, Float perDayWithdrawalLimit) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
        this.kycVerified = kycVerified;
        this.perDayWithdrawalLimit = perDayWithdrawalLimit;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Float getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(Float overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public String getKycVerified() {
        return kycVerified;
    }

    public void setKycVerified(String kycVerified) {
        this.kycVerified = kycVerified;
    }

    public Float getPerDayWithdrawalLimit() {
        return perDayWithdrawalLimit;
    }

    public void setPerDayWithdrawalLimit(Float perDayWithdrawalLimit) {
        this.perDayWithdrawalLimit = perDayWithdrawalLimit;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "AccountHolderName='" + accountHolderName + '\'' +
                ", AccountNumber=" + accountNumber +
                ", Balance=" + balance +
                ", OverdraftLimit=" + overdraftLimit +
                ", KYCVerified='" + kycVerified + '\'' +
                ", PerDayWithdrawalLimit=" + perDayWithdrawalLimit +
                '}';
    }
}