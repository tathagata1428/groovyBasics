for ( int x =1; x<=10; ++x){

print x
}
println ""
for ( def y= 10 ; y>=1 ;y--){
print y
}
println ""
def letters = ['a','b','c']
for (int i=0; i< letters.size();++i) {
print letters[i]
}

println ""
//create a Range


def r = 1..10
Range b = 1..100
println r
print r.class.name
// print class Name
println ""
print b.class.name

//print start and end of the list
println ""
print b.from
print b.to
println ""
Date today = new Date()
Date oneWeekAway = today + 7
println oneWeekAway


Range days = today..oneWeekAway
println days





