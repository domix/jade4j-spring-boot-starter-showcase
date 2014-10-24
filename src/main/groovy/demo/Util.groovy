package demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.jade4j.JadeHelper
import org.springframework.context.MessageSource

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols

/**
 * Created by domix on 08/10/14.
 */
@JadeHelper
class Util {
  @Autowired
  MessageSource messageSource

  String message(String code) {
    messageSource.getMessage(code, null, null)
  }

  //TODO: implement i18n with params
  /*String message(String code, Object[] args) {
    ""
  }*/

  String formatNumber(BigDecimal number, String format) {
    //TODO: add support for localization (locale)
    //def dcfs = locale ? new DecimalFormatSymbols(locale) : new DecimalFormatSymbols()
    def dcfs = new DecimalFormatSymbols()
    def decimalFormat = new DecimalFormat(format, dcfs)
    decimalFormat.setParseBigDecimal(true)
    decimalFormat.format(number)
  }
}
