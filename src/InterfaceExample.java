// Interface
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

//Goat imlements Animal
class Goat implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The goat says: baa baa");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("bewww");
    }
}
class Cow implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The cow says: mooo");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class InterfaceExample {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();

        Goat newGoat = new Goat();
        newGoat.animalSound();
        newGoat.sleep();

        Cow newCow = new Cow();
        newCow.animalSound();
        newCow.sleep();
    }
}
