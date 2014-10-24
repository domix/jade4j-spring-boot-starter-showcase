package demo

import demo.domain.Property

import org.springframework.stereotype.Service

@Service
class PropertyService {
  List<Property> findProperties() {
    [
      build('1', 30000, 40, 2, 1, '14 Tottenham Court Road', 'Newly renovated stainless steel appliances with LARGE GRAND BEDROOMS. Located on beautiful tree-lined block', 'SOLD', '/condo1.jpg'),
      build('1', 3000.4, 40, 2, 1, '44-46 Morningside Road', ' It is large floor-thru, and offers plenty of sunlight, kitchen & dining area, 2 spacious bedrooms, and huge living room', 'SOLD', '/condo2.jpg'),
      build('1', 30000.657, 40, 2, 1, '27 Colmore Row', ' This apartment is surrounded by plenty of businesses and right next to McGorlick park.There are 2 large rooms, wood floors throughout, kitchen and baths.', 'SOLD', '/house1.jpg'),
      build('1', 3000.23, 40, 2, 1, '3 Edgar Building', 'All buildings feature elevators, central laundry facilities and spacious apartments with wood flooring throughout', 'SOLD', '/condo2.jpg'),
      build('1', 30199.99, 40, 1, 1, '91 Western Road', 'A Warm & Bright prewar 1 Bedroom, upgraded kitchen Marble Bath, Granite counter tops, Stainless Steel appliances and Oak Flooring', 'SOLD', '/house2.jpg'),
    ]
  }

  Property build(String id, BigDecimal price, BigDecimal squareFeet, 
    Integer bedrooms, Integer bathrooms, String address,
    String features, String status, String thumbnail) {
    new Property(
      id: id, 
      price: price, 
      squareFeet: squareFeet, 
      bedrooms: bedrooms,  
      bathrooms: bathrooms, 
      address: address, 
      features: features, 
      status: status, 
      thumbnail: thumbnail)
  }

}