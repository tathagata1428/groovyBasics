
println "What is your name?"
println "Your name is ${System.in.newReader().readLine()}"

println "How much money did you save this month?"

def x = System.in.newReader().readLine() as Integer




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
checking.deposit(x)
println "You have " + checking.balance + " " + "Dollars"
try
{
  checking.deposit(x)


}catch (Exception e){
  print e.message
}
println "Your balance is  " + checking.balance