# Monetary Kata :moneybag:
In diesem Kata wollen wir anhand eines Beispiels überlegen, welches der beste Datentyp für Geldwerte darstellt.

## Loss of Significance
Die Berechnung von Geldwerten (aber auch allen anderen Fließkommazahlen) ist in der Informatik problematisch und ist auch unter dem Namen `Loss of Significance` bekannt.
Im Grunde bedeutet das, dass einige Fließkommazahlen im Binärformat nur annähernd dargestellt werden können.

Ein Beispiel aus Wikipedia dazu:
>For example, the decimal number 0.1 is not representable in binary floating-point of any finite precision; the exact binary representation would have a "1100" sequence continuing endlessly.

## Die Konto-Klasse
Es gibt drei Konto-Klassen, die jeweils eine eigene Implementierung des `Account` Interfaces sind:
* DoubleAccount
* BigDecimalAccount
* JodaMoneyAccount

Dazu gehört jeweils ein Test, der grün zu machen ist.
