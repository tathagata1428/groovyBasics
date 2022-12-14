
//per Instance
class Developer{
}
Developer bogdan = new Developer()
bogdan.metaClass.name = 'Bogdan'
bogdan.metaClass.writeCode = {->println "$name love to write code.."}
bogdan.writeCode()

//every instance
String.metaClass.tipa = {-> toUpperCase()}
println "salut bogdan".tipa()
