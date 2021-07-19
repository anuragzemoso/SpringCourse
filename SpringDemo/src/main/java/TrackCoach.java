public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 40 Tracks";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: "+fortuneService.getFortune();
    }
}
