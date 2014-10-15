package demo

import org.springframework.boot.autoconfigure.jade4j.JadeHelper

/**
 * Created by domix on 08/10/14.
 */
@JadeHelper
class Util {
  String format(double number) {
    "number ${number}"
  }
}
