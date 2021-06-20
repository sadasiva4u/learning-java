package com.algoexpert.arrays;

import java.util.*;

public class A04TournamentWinner {
    public static void main(String[] args) {
        List<List<String>> competitions1 = List.of(
                List.of("HTML", "C#"),
                List.of("C#", "Python"),
                List.of("Python", "HTML"));


        List<List<String>> competitions = Arrays.asList(
                Arrays.asList("HTML", "C#"),
                Arrays.asList("C#", "Python"),
                Arrays.asList("Python", "HTML"));

        List<Integer> results = List.of(0,0,1);

        System.out.println(tournamentWinnerBruteForce(competitions, results));
        System.out.println(tournamentWinner(competitions, results));
        System.out.println(tournamentWinnerUsingHashTable(competitions, results));
    }

    private static String tournamentWinnerUsingHashTable(List<List<String>> competitions, List<Integer> results) {
        Map<String, Integer> teamPointsTable = new Hashtable<>();

        for(int idx = 0; idx < competitions.size(); idx++){
            List<String> match = competitions.get(idx);
            String matchWinner = results.get(idx)==1 ? match.get(0) : match.get(1);

            if(teamPointsTable.containsKey(matchWinner)){
                teamPointsTable.put(matchWinner,teamPointsTable.get(matchWinner)+3);
            }else{
                teamPointsTable.put(matchWinner,3);
            }

        }
        return "";
    }

    private static String tournamentWinner(List<List<String>> competitions, List<Integer> results) {
        Map<String, Integer> teamPointsTable = new HashMap<String, Integer>();
        String finalWinner="";
        teamPointsTable.put(finalWinner,0);
        for(int idx = 0; idx < competitions.size(); idx++){
            List<String> match = competitions.get(idx);
            String matchWinner = results.get(idx)==1 ? match.get(0) : match.get(1);

            if(teamPointsTable.containsKey(matchWinner)){
                teamPointsTable.put(matchWinner,teamPointsTable.get(matchWinner)+3);
            }else{
                teamPointsTable.put(matchWinner,3);
            }

            if(teamPointsTable.get(matchWinner) > teamPointsTable.get(finalWinner)){
                finalWinner = matchWinner;
            }
        }
        return finalWinner;
    }



    private static String tournamentWinnerBruteForce(List<List<String>> competitions, List<Integer> results) {
        Map<String, Integer> teamPointsTable = new HashMap<String,Integer>();
        for(int i = 0;i<competitions.size();i++){
            List<String> match = competitions.get(i);
            if(results.get(i) ==0){
                if(!teamPointsTable.containsKey(match.get(0))){
                    teamPointsTable.put(match.get(0) , 0 );
                }
                if(teamPointsTable.containsKey(match.get(1))){
                    teamPointsTable.put(match.get(1) , teamPointsTable.get(match.get(1))+3 );
                }else{
                    teamPointsTable.put(match.get(1) , 3 );
                }
            }else {
                if(teamPointsTable.containsKey(match.get(0))){
                    teamPointsTable.put(match.get(0) , (Integer) teamPointsTable.get(match.get(0)) +3 );
                }else{
                    teamPointsTable.put(match.get(0) , 3 );
                }
                if(!teamPointsTable.containsKey(match.get(1))){
                    teamPointsTable.put(match.get(1) , 0 );
                }
            }
        }
        System.out.println(teamPointsTable);
        String winner="";
        int winningScore=0;

        for(Map.Entry<String, Integer> entry : teamPointsTable.entrySet()){
            if(entry.getValue() > winningScore) {
                winningScore = entry.getValue();
                winner = entry.getKey();
            }
        }

        return winner;
    }
}