public class SportAndHobby implements PersonInterface, SportInterface, HobbyInterface{
    private String myName;
    private String sportName;
    private String hobby;
    private int myAge;

    public SportAndHobby(){
    }
    public SportAndHobby(String myName, int a, String s, String h){
        this.myName = myName;
        myAge = a;
        sportName = s;
        hobby = h;
    }

    @Override
    public String toString(){
        return String.format("%s , %d, %s, %s, %d", this.myName, this.myAge, this.sportName, this.hobby, (this.myAge * 10));
    }
    
    @Override
    public void setName(String myName){
        this.myName = myName;
    }
    @Override
    public void setAge(int myAge){
        this.myAge = myAge;
    }

    @Override
    public String getMyFavoriteSport(){
        return this.sportName;
    }

    @Override
    public void setMyFavoriteSport(String sportName){
        this.sportName = sportName;
    }

    @Override
    public int howMuchItCostToPlayThisSport(){
        return this.myAge*10;
    }

    @Override
    public String whatIsMyHobby(){
        return this.hobby;
    }

    @Override
    public void setMyHobby(String hobby){
        this.hobby = hobby;
    }
}
