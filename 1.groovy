

enum Days { SUNDAY,MONDAY,TUESDAY,WEDNESDAT,THURSDAY,FRIDAY,SATURDAY
}

def dayRange = Days.SUNDAY..Days.SATURDAY

//for in loop
for ( day in dayRange) {
println day

}
/*
List Exerciseby

-----------------


    Create a list days (Sun - Sat)
    Print out the list
    Print the list size
    Remove Saturday from the list
    Add back Saturday by appending it to the list
    Printout wednesday suing its  index
    
    
    
    
    */
    
// Create a list days (Sun - Sat)  
 def days = ["Luni","Marti","Miercuri","Joi","Vineri","Sambata","Duminica"]
//Print out the list
 println days
 //remove "Luni"
 
 days.pop()
 println days
 //Add back luni
 
 days << "Luni"
  println days
  
  println days[5]
  
  
  /* Map Exercises
  
  
 
 
 
 
 