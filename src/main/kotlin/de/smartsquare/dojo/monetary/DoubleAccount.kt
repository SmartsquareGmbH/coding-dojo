package de.smartsquare.dojo.monetary

import java.util.Currency
import java.util.Locale

class DoubleAccount(
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
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}