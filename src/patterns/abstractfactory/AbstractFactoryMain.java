package patterns.abstractfactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        StaffFactory soccerStaffFactory = new SoccerStaffFactory();
        Manager soccerManager = soccerStaffFactory.createManager();
        Player soccerPlayer = soccerStaffFactory.createPlayer();

        StaffFactory tennisStaffFactory = new TennisStaffFactory();
        Manager tennisManager = tennisStaffFactory.createManager();
        Player tennisPlayer = tennisStaffFactory.createPlayer();
    }
}
