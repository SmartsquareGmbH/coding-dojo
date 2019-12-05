package de.smartsquare.dojo.monetary

import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row
import java.util.Currency
import java.util.Locale

class BigDecimalAccountSpec : StringSpec({

    var bigDecimalAccount: BigDecimalAccount

    "calculate interest for a given number of days" {
        forall(
            row(5.5, 0.2, 401.5),
            row(100.0, 0.35, 12775.0),
            row(0.7, 0.2, 51.1)
        ) { balance, interestRate, expectedInterest ->
            bigDecimalAccount = BigDecimalAccount(balance, interestRate)
            val interest = bigDecimalAccount.calculateInterest(365)
            interest.shouldBe(expectedInterest)
        }
    }

    "format balance in given currency" {
        bigDecimalAccount = BigDecimalAccount(100.0)
        val moneyFormat = bigDecimalAccount.formatFor(Locale.GERMANY)
        moneyFormat.shouldBe("100,00 €")
    }


    "convert balance to given currency" {
        forall(
            row(23.12, 7.4716, 172.74, "DKK"),
            row(23.12, 1.1094, 25.65, "USD"),
            row(23.12, 1.6997, 39.3, "NZD")
        ) { balance, conversionRate, expectedBalance, currency ->
            bigDecimalAccount = BigDecimalAccount(balance)
            val balanceInCurrency = bigDecimalAccount.convertTo(Currency.getInstance(currency), conversionRate)
            balanceInCurrency.shouldBe(expectedBalance)
        }
    }
})