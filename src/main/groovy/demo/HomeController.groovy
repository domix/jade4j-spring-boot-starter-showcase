package demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by domix on 08/10/14.
 */
@Controller
class HomeController {

  @RequestMapping('/')
  String index(Model model) {
    model.addAttribute 'user', 'domix'
    'index'
  }

  @RequestMapping('/th')
  String index2(Model model) {
    model.addAttribute 'user', 'domix'
    'th'
  }
}