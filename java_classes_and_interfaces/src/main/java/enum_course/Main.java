package enum_course;

public class Main {
    public static void main(String[] args) {
        //FilghtJob test1 = FilghtJob.FIGHT_ATTENDANT;
        //FilghtJob test2 = FilghtJob.PILOT;
        CrewMember bob = new CrewMember(FilghtJob.COPILOT,"Bob");
        CrewMember john = new CrewMember(FilghtJob.PILOT,"John");
        whoIsInCharge(bob,john);
    }

    public static void whoIsInCharge(CrewMember member1, CrewMember member2){
        CrewMember theBoss = member1.getJob().compareTo(member2.getJob()) > 0
                ? member1 : member2;
        System.out.println(theBoss.getJob().getTitle() + " " + theBoss.getName() + " is boss");

    }

}
