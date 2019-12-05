package de.smartsquare.dojo.monetary

import java.util.Currency
import java.util.Locale

interface Account {

    val balance: Double

    val interestRate: Double

    fun calculateInterest(days: Int): Double

    fun formatFor(locale: Locale): String

    fun convertTo(currency: Currency, conversionRate: Double): Double
}
