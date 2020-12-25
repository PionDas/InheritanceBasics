public class Bird extends Animal {

    private int wings;

    public Bird(String name, String color, int legs, boolean hasTail, int wings) {
        super(name, color, legs, hasTail);
        this.wings = wings;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("Eating Finished");
    }

    public void fly(){
        System.out.println(this.getName() + " is flying");
    }

    public void fly(int speed){
        System.out.println(getName() + " speed: "+ speed);
    }

    public void fly(String name){

    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
