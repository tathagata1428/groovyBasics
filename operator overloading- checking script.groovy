class Account {

def balance 

Account plus (Account other) {

new Account ( balance: this.balance + other.balance )
}

String toString(){
"Account Balance:$balance"

}
}

Account savings = new Account(balance:100)
Account checking = new Account(balance:500)

println savings
println checking
println checking + savings