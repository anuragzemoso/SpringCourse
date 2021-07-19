public class HappyFortuneService implements FortuneService{

    public HappyFortuneService(){
        System.out.println("HappyFortuneService: inside no-arg constructor");
    }
    public String getFortune(){
        return "Today is your lucky day!";
    }
}
