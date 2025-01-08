package com.example.project;

public class HorseBarn {
    private Horse[] stalls;
    public HorseBarn(int numStalls) {
        stalls = new Horse[numStalls];
    }
    public HorseBarn(Horse[] sampleStalls) {
        stalls = sampleStalls; // Directly reference the provided array
    }

    public Horse[] getStalls() {
        return stalls;
    }

    public String horseBarnInfo() {
        StringBuilder info = new StringBuilder();
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] == null) {
                info.append("Stall ").append(i).append(": Empty\n");
            } else {
                info.append("Stall ").append(i).append(": ").append(stalls[i].horseInfo()).append("\n");
            }
        }
        return info.toString();
    }

    public void placeHorse(Horse horse, int stall) {
        stalls[stall] = horse; // Assign horse to the specified stall
    }

    public int findHorseStall(String name) {
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] != null && stalls[i].getName().equals(name)) {
                return i;
            }
        }
        return -1; // No horse with the specified name found
    }

    public void consolidate() {
        Horse[] consolidated = new Horse[stalls.length];
        int index = 0;
        for (Horse horse : stalls) {
            if (horse != null) {
                consolidated[index] = horse;
                index++;
            }
        }
        stalls = consolidated; // Update stalls with the consolidated array
    }
}
