public class Mainclass
{
    public static void main(String[] args) {
        
        Dog d1 = new Dog(); // Error here
        d1.age = 15;
        d1.name = "Tommy";
        d1.bark();

    }
}

    class Dog
    {
        int age;
        String name;
        

        void bark()
        {
            System.out.println("Dog is Barking");
        }

    }

