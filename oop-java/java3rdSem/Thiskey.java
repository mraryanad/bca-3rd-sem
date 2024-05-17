class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + this.name);
    }

    public static void main(String[] args) {
        Person person = new Person("John");
        person.introduce();
    }
}
