class Person {

  // declare id and name in parent class
  int id;
  String name;

  //set 'id' and 'name' whenever the constructor is called
  Person(int id, String name) {
    this.id = id;
    this.name = name;
  }
}

class Emp extends Person {

  // declare salary in child class
  float salary;

  // get id and name from parent class and set salary when the constructor is called
  Emp(int id, String name, float salary) {
    super(id, name);
    this.salary = salary;
  }

  // display the values
  void display() {
    System.out.println(super.id + " " + super.name + " " + salary);
  }
}

class TestSuper5 {

  public static void main(String[] args) {
    Emp e1 = new Emp(1, "aryan", 45000);
    e1.display();
  }
}
