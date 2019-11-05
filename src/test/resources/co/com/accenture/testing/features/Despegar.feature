#Jennyfer Fuentes

@smoketest
Feature: Book fligth
  As an end user, I want go to Despegar.com,
  enter the date and search a fligth.

  Scenario Outline: search a fligth and book it
    Given that Jennyfer wants go to Despegar.com
    When enter the date for make the book
    | nombre | apellido| cedula 	 | direccion| email| area | numero | 
    |<nombre>|<apellido>|<cedula>| <direccion>|<email>|<area>|<numero>|
    Then she should verify the data entered with the data on screen
    Examples:
      | nombre | apellido| cedula 	 | direccion | email               | area | numero    |
      |Jennyfer| Fuentes | 1098803664| calle12   | jfuentes@unac.edu.co| 57  | 3183257883|
