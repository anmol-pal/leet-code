package leetcode;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Map;

//https://leetcode.com/problems/time-needed-to-buy-tickets/
public class TimeNeededToBuyTickets {
    public static void main(String[] args) {
        TimeNeededToBuyTickets timeNeededToBuyTickets = new TimeNeededToBuyTickets();
        int tick[] = {5,49,84,24,70,77,87,8};
        int k = 3; //154
//        int tick[] = {5,1,1,1};
//        int k = 0; //8
//        int tick[] = {2,3,2};
//        int k = 0; //6
        System.out.println(timeNeededToBuyTickets.timeRequiredToBuy(tick, k));

    }

    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0 ;
        int n = tickets.length ;

        for (int i = 0; i < n; i++)
            if (i <= k) time += Math.min(tickets[i], tickets[k]) ;
            else time += Math.min(tickets[k]-1, tickets[i]) ;

        return time ;
    }
}