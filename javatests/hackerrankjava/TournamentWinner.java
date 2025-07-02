package javatests.hackerrankjava;

import java.util.*;

public class TournamentWinner {

  /* INPUT
    competitions = [["HTML", "C#"], 
                    ["C#", "Pyhton"],
                    ["Pyhton", "HTML"],
    ] 

    results = [0, 0, 1]

    OUTPUT

    "Python" 
    C# beats Html team, Python beats C# and Python beats HTML team

    HTML   - 0 points
    C#     - 3 points
    Python - 6 points

   */

  public static void main(String args []) {

    ArrayList<String> c1 = new ArrayList<String>(
      Arrays.asList("HTML", "C#") 
    );

    ArrayList<String> c2 = new ArrayList<String>(
      Arrays.asList( "C#", "Python")
    );
    ArrayList<String> c3 = new ArrayList<String>(
      Arrays.asList( "Python", "HTML")
    );

    ArrayList<ArrayList<String>> compets = new ArrayList<ArrayList<String>>() ;
      
    compets.add(c1);
    compets.add(c2);
    compets.add(c3);

    ArrayList<Integer> res = new ArrayList<Integer>( Arrays.asList(0, 0, 1));

    System.out.println(tournWinner(compets, res));
  }


  public static String tournWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

    Map<String, Integer> scores = new HashMap<>();
    String team, winner = "";

    for ( int i = 0; i < competitions.size(); i++ ){

      team = competitions.get(i).get(results.get(i) == 0 ? 1 : 0 );
      scores.put(team, scores.getOrDefault(team, 0) + 3);
      winner = scores.get(team) > scores.getOrDefault(winner, 0) ? team: winner;

    }
    
    return winner;
  }
}
