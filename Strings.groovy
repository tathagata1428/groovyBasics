//Working with Strings in Groovy

def c3 = 'c'
println c3.class

// strings interpolation

String name = "Bogdan"

String msg = "Hello  $name ..."
println msg
String msg3 = 'Hello  ${name}'
println msg3

String msg4 = "Calculating age: ${2022-1994}"
println msg4

//the difference between ' and " is that " is used to evaluate an expresion at runtime 


// multiline strings
// User ''' to define a multiline string
def alargeMsg = '''

Please check your to do
Setup your financial goals

'''

println alargeMsg

// multiline - evaluate strings

def alargeMsgtoeval ="""

Your Name is BOGDAN
Your are ${2022-1994} years old
"""
println alargeMsgtoeval

// dollar slashy

//use $/ ..../$ to escape a character

def folder = $/"C:\bogdan\Downloadss"/$

println folder



