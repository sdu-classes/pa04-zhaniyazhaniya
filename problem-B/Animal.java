abstract class Animal1 {
    protected int legs;

    protected Animal1(int legs){
        this.legs = legs;
    }

    abstract void eat();
    
    protected void walk() {
        System.out.println("This animal walks with " + this.legs + " legs");
    }
}
