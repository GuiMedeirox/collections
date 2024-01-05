package EpriorityQueue;

import java.util.Comparator;

public class TeamComparator implements Comparator<Team> {

    @Override
    public int compare(Team o1, Team o2) {

        if (o1.points < o2.points)
                return 1;
        else if (o1.points > o2.points)
                return -1;
        return 0;
    }
}
