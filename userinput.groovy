def name = System.console().readLine 'What is your name? '
println "Hello" + name

def money = System.console().readLine 'How much money you want to deposit? '
def money = System.in.newReader().readLine() as Integer

class Account {

    BigDecimal balance = 0.0

    def deposit(BigDecimal amount) {
        if ( amount < 0 ){
            throw new Exception("Deposit amount must be grater than 0")
        }
        balance +=amount

    }
    def deposit (List amounts) {
        for (amount in amounts) {
            deposit(amount)

        }
    }
}
Account checking =new Account()
checking.deposit(money)
print checking.balance