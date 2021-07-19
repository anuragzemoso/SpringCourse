public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    public BaseBallCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Run 30km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
