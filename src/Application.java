import model.Kotik;
public class Application {
    public static void main(String[] args){
        Kotik kot1 = new Kotik(100,5,"Silly","meeeeeeeew");
        Kotik kot2 = new Kotik();
        kot2.setKotik(90,4,"Dilly","mew");
        System.out.println(kot1.getName());
        System.out.println(kot1.getWeight());
        kot1.liveAnotherDay();
        System.out.println(kot1.getMeow().equals(kot2.getMeow()));
        System.out.println(Kotik.getCount());
    }
}
