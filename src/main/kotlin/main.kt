fun main(){
    var eq1num: Int = 5
    var eq1sum: Int = eq1num + eq1num
    println("$eq1num + $eq1num = $eq1sum: " + (eq1sum == 10))

    println("10 - 3 = " + (10 - 3) + ": " + (10 - 3 == 10 - 3))

    var eq3num: Int = 7
    println("$eq1num * $eq3num = " + (eq1num * eq3num) + ": " + (eq1num * eq3num == 5 * 7))

    var eq4num1 = 8
    var eq4num2 = 4
    var eq4quotient = eq4num1 / eq4num2
    println("$eq4num1 / $eq4num2 = $eq4quotient: " + (eq4quotient == 8 / 4))

    var eq5num = 3
    var eq5result: Int = eq1sum % eq5num
    println("$eq1sum % $eq5num = $eq5result: " + (eq5result == 1))
}