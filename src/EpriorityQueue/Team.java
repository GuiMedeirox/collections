package EpriorityQueue;

public class Team {
    String name;
    int points;

    public Team(String name, int points){
        this.points = points;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[EQUIPE " +name +" | PONTOS " +points +"]";
    }
}
