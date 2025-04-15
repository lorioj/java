package main;

public class Greedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(canCompleteCircuit(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4, 5, 1, 2 }));

	}

	static int canCompleteCircuit(int[] gas, int[] cost) {
		int start = 0;
		int totalGas = 0;
		int currentGas = 0;

		for (int i = 0; i < gas.length; i++) {
			int fuelGain = gas[i] - cost[i];
			totalGas += fuelGain;
			currentGas += fuelGain;

			if (currentGas < 0) {
				currentGas = 0;
				start = i + 1;
			}

		}

		return totalGas < 0 ? -1 : start;
	}

}
