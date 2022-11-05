open class Interest{
    open fun interestAmount():Int{
        return 0
    }
}
class Savings(private val amount:Int): Interest(){
    override fun interestAmount(): Int {
        return amount*interestPercent()
    }
    private fun interestPercent(): Int{
        return 2
    }
}

class Fixed(private val amount:Int): Interest(){
    override fun interestAmount(): Int {
        return amount*interestPercent()
    }
    private fun interestPercent(): Int{
        return 3
    }
}

class DPS(private val amount:Int): Interest(){
    override fun interestAmount(): Int {
        return return amount*interestPercent()
    }
    private fun interestPercent(): Int{
        return 4
    }
}
