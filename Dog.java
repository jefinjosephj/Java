public class Dog {
    String name;
    String breed;
    int age;
    String color;

    public Dog(String name, String breed, int age, String color){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.color=color;
    }
    public String get_name(){
        return name;
    }
    public String get_breed(){
        return breed;
    }
    public int get_age(){
        return age;
    }
    public String get_color(){
        return color;
    }
    public String toString(){
        return("Hi! My Name is: "+this.get_name()+" and I am a "+this.get_breed()+
                ". I am "+this.get_age()+" years old and my color is "+this.get_color());
    }
    public static void main(String[] args){
        Dog bruno = new Dog("Bruno","Puggle Dog",5,"White");
        System.out.println(bruno.toString());
    }
}