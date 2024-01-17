package adapter.exercise2.delegate

import adapter.exercise2.Banner
import adapter.exercise2.Printer

class PrintBannerAdapter(val banner: Banner): Printer {
    override fun print() {
        println(banner.decorate())
    }
}

class PrintBannerAdapterBy(val banner: Banner): Printer, Banner by banner {
    override fun print() {
        println(decorate())
    }
}