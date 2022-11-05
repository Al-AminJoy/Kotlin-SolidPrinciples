fun main(args: Array<String>) {
    /**
     * O,D -> Open & Close Principle , Dependency Inversion Principle
     */
   /* val savingAccount: LoanEligibility = SavingAccount()
    val calculate = InterestCalculator()
    calculate.calculate(savingAccount)*/

    /**
     * L - Lescov's Substitution
     */

    val accounts: List<Interest> = arrayListOf(Savings(20),Fixed(10),DPS(30))
    accounts.forEach {
        println(it.interestAmount())
    }
    println(accounts.sumOf { it.interestAmount() })
}

