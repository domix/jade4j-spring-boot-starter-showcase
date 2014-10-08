package demo

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by domix on 08/10/14.
 */
@Controller
@CompileStatic
@TypeChecked
class HomeController {
  @RequestMapping('/')
  String index(Model model) {
    model.addAttribute("user", "domix")
    'index'
  }
}