package test.akhilesh.lucid;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class NaviParty {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().trim().split(" ");
    int n = Integer.parseInt(input[0]);
    int q = Integer.parseInt(input[1]);
    Set<String> invitedGuest = new HashSet<String>(n);
    for (int i = 0; i < n; i++) {
      invitedGuest.add(br.readLine().trim());
    }
    int unInvitedGuest = 0;
    for (int i = 0; i < q; i++) {
      String nameOrAge = br.readLine().trim();
      if (isContainsNumberOnly(nameOrAge)) {
        int age = Integer.parseInt(nameOrAge);
        if (age <= 20) unInvitedGuest++;
      } else {
        if (!invitedGuest.contains(nameOrAge)) unInvitedGuest++;
      }
    }
    System.out.println(unInvitedGuest);
  }

  private static boolean isContainsNumberOnly(String input) {
    String regex = "[0-9]+";
    boolean b = input.matches(regex);
    return b;
  }
}

/*
 * Navi's party is going on and there are many people that are in this party. Navi is very busy in attending his guests. He has no time to check if there is any non-invited guest or not. You are required to help him.

All the people with having their age more than 20 are surely his invited guests. For every one of them you can determine either the age or the name of the person. You can check any person, i.e. learn his/her age or his/her name at the same time. What minimal number of people you should check additionally to make sure that there are no non-invited guests.

Input

First line of the input will contain two space separated integers denoting N (No. of names of some invited guests) and Q (Total number of persons present in the party).
Next N lines will contain strings denoting the names of the persons(one name per line and can be repetitive).
Next Q lines will contain either an integer denoting the age or a string denoting the name of a person.
Output

Output the minimal number of people you should check as asked above.
Constraints

1 ≤ N ≤ 103
1 ≤ Q ≤ 105
1 ≤ Age ≤ 50
*/
