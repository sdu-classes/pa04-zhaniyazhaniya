public class Main{
    public static void main(String[] args) {
        SportAndHobby p1 = new SportAndHobby();
        p1.setName("Zhaniya");
        p1.setAge(17);
        p1.setMyFavoriteSport("volleyball");
        p1.setMyHobby("reading");
        p1.howMuchItCostToPlayThisSport();
        System.out.println(p1.toString());
    }
}
