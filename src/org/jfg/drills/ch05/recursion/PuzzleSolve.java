package org.jfg.drills.ch05.recursion;

import java.util.*;

public class PuzzleSolve {

/*
    K should be the number of k-length sequence
*/
    public List permute(int k, ArrayList<Character> s, ArrayList<Character> u) {
        List<String> permutations = new ArrayList<String>();

        ArrayList<Character> universe = copyArrayList(u);

        Iterator<Character> iterator = u.iterator();
        while(iterator.hasNext() ) {

            Character e = iterator.next();
            s.add(e);
            u.remove(e);

            if (k == 1) {
                if(validNonRepeatedCharacterSequence(s)){
                    String str = convert(s);
                    permutations.add(str);
                }
            } else {
                permute(--k, s, u);
            }
            s.remove(e);
            u.add(e);
        }

        return permutations;
    }

    private boolean validNonRepeatedCharacterSequence(List<Character> s){

        //TODO: This should have the logic in which we validate for a sequence of characters that do not repeat and that s is not already in permutations (the output)
        return true;
    }

    private ArrayList copyArrayList(ArrayList arrayList){

        ArrayList copiedArrayList = new ArrayList();
        String a = new String();
//        a.get
        return copiedArrayList;
    }


    private String convert(List<Character> fromList)
    {
        StringBuffer sb = new StringBuffer();
        for (Character c : fromList)
            sb.append(c);

        return sb.toString();
    }

    public static void main(String[] args) {
        PuzzleSolve ps = new PuzzleSolve();

        int k = 3;
        ArrayList<Character> s = new ArrayList<Character>();
        ArrayList<Character> universe = new ArrayList();
        universe.add('a');
        universe.add('b');
        universe.add('c');

//        List<Character> s = new ArrayList<>(Arrays.asList('a', 'b', 'c'));
//        String str = ps.convert(s);
//        System.out.println(str);

        List<String> permutations = ps.permute(k, s, universe);

        for (String str : permutations) {
            System.out.println(str);
        }

    }

}
