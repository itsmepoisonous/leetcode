package com.array.gasstation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    // Assume the actual solution method is in a class called Solution
    Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int expected = 3;
        assertEquals(expected, solution.canCompleteCircuit(gas, cost), "Example 1 failed");
    }

    @Test
    public void testExample2() {
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        int expected = -1;
        assertEquals(expected, solution.canCompleteCircuit(gas, cost), "Example 2 failed");
    }

    @Test
    public void testSingleStationEnoughGas() {
        int[] gas = {5};
        int[] cost = {4};
        int expected = 0;
        assertEquals(expected, solution.canCompleteCircuit(gas, cost), "Single station with enough gas failed");
    }

    @Test
    public void testSingleStationNotEnoughGas() {
        int[] gas = {2};
        int[] cost = {3};
        int expected = -1;
        assertEquals(expected, solution.canCompleteCircuit(gas, cost), "Single station without enough gas failed");
    }

    @Test
    public void testAllStationsExactGas() {
        int[] gas = {2, 3, 4};
        int[] cost = {2, 3, 4};
        int expected = 0;
        assertEquals(expected, solution.canCompleteCircuit(gas, cost), "All stations with exact gas failed");
    }

    @Test
    public void testStartAtDifferentIndex() {
        int[] gas = {3, 1, 2, 5, 4};
        int[] cost = {2, 2, 2, 2, 2};
        int expected = 0;
        assertEquals(expected, solution.canCompleteCircuit(gas, cost), "Starting index test failed");
    }

    @Test
    public void testNoSolution() {
        int[] gas = {1, 2, 3};
        int[] cost = {4, 5, 6};
        int expected = -1;
        assertEquals(expected, solution.canCompleteCircuit(gas, cost), "No solution case failed");
    }
}

