package de.smartsquare.dojo.monetary

import org.joda.money.CurrencyUnit
import org.joda.money.Money
import java.math.BigDecimal
import java.math.RoundingMode
import java.util.Currency
import java.util.Locale

class JodaMoneyAccount(
    override val balance: Double,
    override val interestRate: Double = 0.0
) : Account {
    override fun calculateInterest(days: Int): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun formatFor(locale: Locale): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun convertTo(currency: Currency, conversionRate: Double): Double {
        val money = Money.of(CurrencyUnit.EUR, balance)
        return money.convertedTo(CurrencyUnit.of(currency), BigDecimal.valueOf(conversionRate), RoundingMode.HALF_UP).amount.toDouble()
    }
}