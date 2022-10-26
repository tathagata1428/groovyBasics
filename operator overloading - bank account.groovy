@groovy.transform.ToString
class Account {
    def balance = 0.0
    
    String type
    
    def amount 
    def deposit(amount){
    balance +=amount
    }
    
    def withdraw(amount){
    balance-=amount
    }
    def plus(Account account){
    this.balance + account.balance}
    
}

Account checking = new Account(type:"Checking")
checking.deposit(1777)

Account savings = new Account(type:"Savings")

savings.deposit(50)

println checking
println savings
def total = checking + savings

println "money in bank = " + total

