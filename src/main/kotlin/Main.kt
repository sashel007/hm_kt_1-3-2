import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Какой картой вы пользуетесь? Введите номер:")
    println("1. Maestro")
    println("2. MasterCard")
    println("3. Visa")
    println("4. МИР")
    println("5. VK Pay")

    var selectedCard = scanner.nextInt()
    if ((selectedCard < 1) && (selectedCard > 5)) {
        print("Введите номер корректно: ")
        selectedCard = scanner.nextInt()
    }

    println("Введите предыдущих переводов в этом месяце:")
    val totalSum = scanner.nextDouble()
    if (totalSum <= 0.0) {
        print("Введите корректную сумму:")
        scanner.nextDouble()
    }


    println("Введите сумму совершаемого перевода: ")
    val inputAmount = scanner.nextDouble()
    if (inputAmount <= 0.0) {
        print("Введите корректную сумму:")
        scanner.nextDouble()
    }

    calculateCommission(selectedCard,totalSum,inputAmount)
}

fun calculateCommission(selectedCard: Int, totalSum: Double, inputAmount: Double) {
    val MAX_SUM_DAY = 150000.0
    val MAX_SUM_MONTH = 600000.0
    var commission = 0.0

    when (selectedCard) {
        1 -> {
            if (inputAmount < MAX_SUM_DAY && (totalSum + inputAmount) < MAX_SUM_MONTH) {
                commission = 0.0
                println("Комиссия составляет: ${commission.toInt()}")
            } else {
                println("Лимит превышен")
            }
        }

        2 -> {
            if (inputAmount < MAX_SUM_DAY && (totalSum + inputAmount) < MAX_SUM_MONTH) {
                commission = 0.0
                println("Комиссия составляет: ${commission.toInt()}")
            } else {
                println("Лимит превышен")
            }
        }

        3 -> {
            if (inputAmount < MAX_SUM_DAY && (totalSum + inputAmount) < MAX_SUM_MONTH) {
                if (commission < 35.0) {
                    print("Ваша комиссия составляет: ${(commission).toInt()}")
                }
            } else {
                println("Лимит превышен")
            }
        }

        4 -> {
            if (inputAmount < MAX_SUM_DAY && totalSum < MAX_SUM_MONTH) {
                if (commission < 35.0) {
                    print("Ваша комиссия составляет: ${(commission).toInt()}")
                }
                print("Комиссия составляет: ${(commission).toInt()}")
            } else {
                println("Лимит превышен")
            }
        }

        5 -> println("Комиссия отсутствует")
    }
}