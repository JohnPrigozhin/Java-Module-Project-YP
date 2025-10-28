public class Race {
    String leaderName = "";
    int leaderDistance = 0;

    public void checkLeader(Car car) {
        int distance = car.speed * 24;

        if (distance > leaderDistance) {
            leaderName = car.name;
            leaderDistance = distance;
        }
    }

    public String getWinner() {
        return leaderName;
    }
}