package enum_course;

public enum FilghtJob {
    FIGHT_ATTENDANT("Flight Attendant"),
    COPILOT("First Officer"),
    PILOT("Captain");

    private String title;

    public String getTitle() {
        return title;
    }

    FilghtJob(String title) {
        this.title = title;
    }
}