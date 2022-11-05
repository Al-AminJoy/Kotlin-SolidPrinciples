interface LoanEligibility{
    fun hasLoanPermission():Boolean
}

class SavingAccount: LoanEligibility{
    override fun hasLoanPermission(): Boolean {
        return true
    }
}

class FixedAccount: LoanEligibility{
    override fun hasLoanPermission(): Boolean {
        return true
    }
}

class DPSAccount: LoanEligibility{
    override fun hasLoanPermission(): Boolean {
        return true
    }
}

class InterestCalculator{
    fun calculate(loanEligibility: LoanEligibility){
        if (loanEligibility.hasLoanPermission()){
            print("Interest 7.8%")
        }
    }
}