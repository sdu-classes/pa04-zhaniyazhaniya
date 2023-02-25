public class Fish extends Animal1 implements Pet {
    String name;

    public Fish(String name){
        super(0);
        this.name = name;
    }

    public Fish(){
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
    public void walk(){
        System.out.println("Unfortunately, fish only swim, they don't walk!");
    }

    @Override
    public void eat(){
        if(name.isEmpty())
            System.out.println("Fish eats");
        else System.out.println("Fish " + this.name + " eats");
    }
    
    @Override
    public void play(){
        if(name.isEmpty())
            System.out.println("Fish plays");
        else System.out.println("Fish " + this.name + " plays");
    }
}
