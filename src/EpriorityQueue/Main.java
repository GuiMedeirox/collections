package EpriorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Team> priorityQueue = new PriorityQueue<>(5, new TeamComparator());
        Team a = new Team("A", 100);
        Team b = new Team("B", 120);
        Team c = new Team("C", 130);
        Team d = new Team("D", 140);
        Team e = new Team("E", 110);
        priorityQueue.add(a);
        priorityQueue.add(b);
        priorityQueue.add(c);
        priorityQueue.add(d);
        priorityQueue.add(e);

        for (Team team:  priorityQueue) {
            System.out.println(team);
        }
    }
}
