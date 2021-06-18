package model;
public class Kotik {
    private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private int fullness = 50;
    static private int catCount = 0;



    public Kotik() {
        catCount++;
    }

    public Kotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        catCount++;
    }


    //Setter


    public void setKotik(int prettiness, int weight, String name, String meow){
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }


    //Getter's


    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getMeow(){
        return this.meow;
    }

    public int getPrettiness(){
        return this.prettiness;
    }

    public static int getCount(){
        return catCount;
    }


    //liveAnotherDay


    public void liveAnotherDay() {
        int number;
        for (int i = 0; i < 24; i++) {
            number = (int) (Math.random() * 5 + 1);
            switch (number) {
                case 1: {
                    if (!play()) eat();
                    break;
                }
                case 2: {
                    if (!chaseMouse()) eat();
                    break;
                }
                case 3: {
                    if (!sleep()) eat();
                    break;
                }
                case 4: {
                    if (!sayMeow()) eat();
                    break;
                }
                case 5: {
                    if (!roll()) eat();
                    break;
                }
            }

        }
    }


    //liveActions


    public boolean play() {
        if (fullness <= 10) {
            System.out.print(this.name + " doesn't wanna play, it asks food");
            return false;
        }
        else {
            System.out.println(this.name + " plays");
            fullness -= 10;
            return true;
        }
    }

    public boolean chaseMouse() {
        if (fullness <= 20) {
            System.out.print(this.name + " doesn't wanna hunt, it asks food");
            return false;
        }
        else {
            System.out.println(this.name + " chases mouse");
            fullness -= 20;
            return true;
        }
    }

    public boolean sleep() {
        if (fullness <= 10) {
            System.out.print(this.name + " doesn't wanna sleep, it asks food");
            return false;
        }
        else {
            System.out.println(this.name + " sleeps");
            fullness -=10;
            return true;
        }
    }

    public boolean sayMeow() {
        if (fullness <= 10) {
            System.out.print(this.name + " doesn't wanna say meow, it asks food");
            return false;
        }
        else {
            System.out.println(this.name + " says " + meow);
            fullness -=10;
            return true;
        }
    }

    public boolean roll() {
        if (fullness <= 20) {
            System.out.print(this.name + " doesn't wanna roll, it asks food");
            return false;
        }
        else {
            System.out.println(this.name + " rolls");
            fullness -=20;
            return true;
        }
    }


    //food


    private void checkAndFeed(){
        if (this.fullness<=0) this.eat();
    }

    private void eat(int a){
        fullness+= a;
        System.out.println("..."+ this.name+"'s eating");
    }

    private void eat(int a, String food){
        fullness+= a;
        System.out.println("..."+ this.name+"'s eating "+food);
    }

    private void eat(){
        eat(60,"milk");
    }
}
