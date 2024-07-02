package org.example.Generics;

import java.util.TreeSet;

public class ComparableTeste {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(1);
        nums.add(4);
        nums.add(5);
        nums.add(-1);
        nums.add(10);
        nums.add(999);

        for (Integer num : nums) {
            System.out.println(num);
        }

    }
}
