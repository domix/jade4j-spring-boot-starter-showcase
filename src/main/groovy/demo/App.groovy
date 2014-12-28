package demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.ReloadableResourceBundleMessageSource

@ComponentScan('demo')
@EnableAutoConfiguration
@Configuration
class App {

  static void main(String[] args) {
    SpringApplication.run App, args
  }

  @Bean
  ReloadableResourceBundleMessageSource messageSource() {
    ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource()
    messageSource.setBasename("classpath:messages")
    //messageSource.setCacheSeconds(10); //reload messages every 10 seconds
    messageSource
  }
}
