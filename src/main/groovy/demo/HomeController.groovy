package demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by domix on 08/10/14.
 */
@Controller
class HomeController {
  @Autowired
  PropertyService propertyService

  @RequestMapping('/')
  String index(Model model) {
    model.addAttribute 'properties', propertyService.findProperties()
    'index'
  }

  @RequestMapping('/th')
  String renderWithThymeleaf(Model model) {
    model.addAttribute 'user', 'domix'
    'th'
  }
}