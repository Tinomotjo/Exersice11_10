package Exersice11_10;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 Write a method removeOddLength that accepts a set of strings as a parameter and that
 removes all of the strings of odd length from the set.
 */
public class Run
{

    public static void main(String[] args)
    {

        Set<String> list1 = new HashSet<>();
        list1.add("He");
        list1.add("HEJ");

        System.out.println(removeOddLength(list1));


    }


    public static Set<String> removeOddLength (Set<String> list)
    {
        Set<String> copySet = new HashSet<>();

       copySet.addAll(list);

        for (String s : copySet)
        {
            if (s.length()%2 ==1)
            {
                list.remove(s);
            }

        }
        return list;
    }


}
