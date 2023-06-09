fun main(){



    val password = "mypassword1"
    val Valid = validPassword(password)
    if (Valid) {
        println("Password is valid")
    } else {
        println("Password is not valid")
    }

    printMultiples()

    val myAccount = CurrentAccount(125, "cynthia", 9000.0)
    myAccount.deposit(900.0)
    myAccount.withdraw(800.0)
    myAccount.details()

   randoms("happiness")
}

//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit

//Your function should determine whether the password provided is valid or not.
//The function returns true/false

fun validPassword(password: String): Boolean {
    if (password.length < 8 || password.length > 16) {
        return false
    }
    if (password == "password") {
        return false
    }

   else(return true)
}

//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”

fun printMultiples() {
    for (i in 1..1000) {
        if (i % 6 == 0 && i % 8 == 0) {
            println("Bingo!")
        } else if (i % 6 == 0) {
            println(i)
        } else if (i % 8 == 0) {
            println(i)
        }
    }
}

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”

class CurrentAccount(val accountNumber: Int, val accountName: String, var balance: Double) {
    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double) {
        if (balance >= amount) {
            balance -= amount
        }
    }

    fun details() {
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
}

//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal


open class Account(val accountNumber: Int, val accountName: String, var balance: Double) {
        open fun deposit(amount: Double) {
            balance += amount
        }

        open fun withdraw(amount: Double) {
            if (balance >= amount) {
                balance -= amount

            }
        }

        open fun details() {
            println("Account number $accountNumber with balance $balance is operated by $accountName")
        }
    }

//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.

fun randoms( words: String) {

        val firstcharacter = words.first()
        val lastcharacter = words.last()
       val length = words.length

  println(firstcharacter)
    println(lastcharacter)
println(length)
    }

