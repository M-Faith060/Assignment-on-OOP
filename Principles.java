//Animal class (parent class)
public abstract class Animal{
    private String name;

    public Animal(string name){
        this.name = name;
    }
    public abstract void sound();

    public String getName();{
      return name;
    }
}

// Dog class(child class)
public class Dog extends Animal{
    public Dog(String name){
        super(name);
    } 

@Override
public void sound(){
    System.out.println("Woof!");
}
}  

//Cat class (child class)
public class Cat extends Animal{
    public Cat(String name){
        super(name;)
    }

@Override
public void sound(){
    System.out.println("Meow!");
}
}


// Main class
public class Main{
    public static void Main(String[]args){
        Animal dog = new Dog("Fido");
        Animal cat = new Cat("Whiskers");

        dog.sound();// Output:Woof!
        cat.sound();// Output:Meow!

        System.out.println(dog.getName());// Output:Fido
        System.out.println(cat.getName());// Output:Whiskers
    }
}
