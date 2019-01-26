package com.xavi.codility;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class AmazonIntervals {

    public int solution(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        } else if (a.length == 0 || b.length == 0) {
            return 0;
        } else if (a.length != b.length) {
            throw new IllegalArgumentException("Cannot create intervals because arrays have different size");
        } else if (a.length == 1) {
            return 1;
        } else {
            int length = a.length;
            List<Interval> intervalList = new ArrayList<Interval>();

            for (int i = 0; i < length; i++) {
                intervalList.add(new Interval(a[i], b[i]));
            }

            List<Interval> notJoin = new ArrayList<Interval>();
            Interval intervalUnion = intervalList.iterator().next();
            for (int i = 1; i < intervalList.size() - 1; i++) {
                Optional<Interval> union = union(intervalUnion, intervalList.get(i));
                if (union.isPresent()) {
                    intervalUnion = union.get();
                } else {
                    notJoin.add(intervalList.get(i));
                }
            }
            System.out.println("Not join: " + notJoin);
            return notJoin.size();

        }
    }

    private Optional<Interval> union(Interval first, Interval second) {
        int a = first.getMin();
        int b = first.getMax();
        int c = second.getMin();
        int d = second.getMax();

        if (a <= d && c <= b) {
            return Optional.of(new Interval(Math.min(a, c), Math.max(b, d)));
        } else {
            return Optional.empty();
        }

    }

    public static void main(String[] args) {
        int[] a = {1, 12, 42, 70, 36, -4, 43, 15};
        int[] b = {5, 15, 44, 72, 36, 2, 69, 24};

        List<Interval> intervalList = new ArrayList<Interval>();
        for (int i = 0; i < a.length; i++) {
            intervalList.add(new Interval(a[i], b[i]));
        }
        System.out.println(intervalList);
        AmazonIntervals amazonIntervals = new AmazonIntervals();
        System.out.println("----");
        System.out.println(amazonIntervals.solution(a, b));
    }

    private static class Interval {
        final int min;
        final int max;

        public Interval(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "min=" + min +
                    ", max=" + max +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Interval interval = (Interval) o;
            return min == interval.min &&
                    max == interval.max;
        }

        @Override
        public int hashCode() {
            return Objects.hash(min, max);
        }
    }
}
