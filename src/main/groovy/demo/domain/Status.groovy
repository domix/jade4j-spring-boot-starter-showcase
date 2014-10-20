package demo.domain

enum Status {

  String name
  String icon
  Status(String name, String icon) {
    this.name = name
    this.icon = icon
  }
}