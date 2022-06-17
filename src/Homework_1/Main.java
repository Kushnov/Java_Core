package Homework_1;

public class Main {

    public static void main(String[] args) {
        Team myTeam = new Team("My Team",
                new TeamMember("One", 10),
                new TeamMember("Two", 5),
                new TeamMember("Three", 12),
                new TeamMember("Four" ,8));

        Course course = new Course(new Cross(10));

        course.doIt(myTeam);
        myTeam.showResults();
    }
}

