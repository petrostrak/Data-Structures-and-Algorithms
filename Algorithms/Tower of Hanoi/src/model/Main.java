package model;

public class Main {

	public static void main(String[] args) {
		
		//number of disks
		int n = 3;
		Hanoi.towerOfHanoi(n, 'A', 'B', 'C');
	}

}

class Hanoi{
	
	// Java recursive function to solve tower of hanoi puzzle
	static void towerOfHanoi(int n, char fromRod, char auxRod, char toRod) {
		if(n == 1) {
			System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
			return;
		}
		towerOfHanoi(n - 1, fromRod, toRod, auxRod);
		System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
		towerOfHanoi(n - 1, auxRod, fromRod, toRod);
	}
}