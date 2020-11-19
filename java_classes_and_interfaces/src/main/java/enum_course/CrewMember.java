package enum_course;

public class CrewMember {
    FilghtJob job;
    String name;

    public CrewMember(FilghtJob job, String name) {
        this.job = job;
        this.name = name;
    }

    public FilghtJob getJob() {
        return job;
    }

    public void setJob(FilghtJob job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
