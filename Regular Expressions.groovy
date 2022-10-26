/*  You may access the following link to find some interesting regular expression information 
    https://www.regular-expressions.info/refquick.html

 */
 
 /* Java Sample Pattern
 
 import java.util.regex.*;
 Pattern pattern =Pattern.compile("abc")
 
 println pattern
 println pattern.class
 
 */
 
 //What patterns will look like in Groovy
 
 String slashy = /a\b/
 String url = $/https://b4it.ro//$
 println slashy.class
 
 
 def pattern = ~/a\b/
 println pattern.class

 
 //Find | Match
 
 def text = "I will be a groovy master shortly" //true
 def text2 = "I will be a groovy master"
 def pattern1 = ~/I will be a groovy master/
 def finder = text =~ pattern1
 def matcher = text ==~ pattern
  def matcher2 = text2 ==~ pattern1
 
 println finder
 println finder.size()
 println matcher
 println matcher2
 
 //HOw to use in scripts
  //if ( matcher ) { //do something }
 
 def text94 = "I will be a groovy master shortly" //true
 def pattern2 = ~/master/
 
 text94 = text94.replaceFirst(pattern2,"expert") 
 println text94
 
 
 
 
 
 
 
 