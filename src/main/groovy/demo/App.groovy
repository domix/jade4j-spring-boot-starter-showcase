package demo

@org.springframework.context.annotation.ComponentScan('demo')
@org.springframework.boot.autoconfigure.EnableAutoConfiguration
class App {

  static void main(String[] args) {
    org.springframework.boot.SpringApplication.run(App, args)
  }
}
