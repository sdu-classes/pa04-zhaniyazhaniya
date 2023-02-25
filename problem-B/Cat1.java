public class Cat1 extends Animal1 implements Pet{
    String name;

    public Cat1(String name){
        super(4);
        this.name = name;
    }

    public Cat1(){
        this(" ");
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setName(String name){
       this.name = name;
    }

    @Override
    public void play(){
        if(name.isEmpty()) 
            System.out.println("Cat plays");
        else System.out.println("Cat " + name + " plays");
    }
    
    @Override
    void eat(){
        if(name.isEmpty())
            System.out.println("Cat eats");
        else System.out.println("Cat " + this.name + " eats");
    }
}
