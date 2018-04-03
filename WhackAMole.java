package basicjava;

import java.util.Arrays;

public class WhackAMole {

    // instance variables
    int score;
    int molesLeft;
    int attemptsLeft;
    int[][] moleGrid;// may need to come back to this
    int gridDimension;
    int numAttempts;

    // methods

    // specifies total number of whacks allowed
    // and grid dimension
    WhackAMole(int numAttempts, int gridDimension) {
	numAttempts = 10;
	gridDimension = 10;
    }

    // return true if you can place a mole at the given location
    boolean place (int x, int y) {
	if (x <= gridDimension + 1 && x > 0) {
	    if (y <= gridDimension + 1 && y > 0) {
		return true;
	    }
	    else {
		return false;
	    }
	} 
	else {
	    return false;
	}
    }

    // creates the action to whack and then updates
    // variables appropiately
    void whack(int x, int y) {
	if(moleGrid[x-1][y-1] == 'M') {
	    moleGrid[x][y] = 'W';
	    score = score + 1;
            attemptsLeft =  attemptsLeft - 1;
            molesLeft = molesLeft -1;
	}
	else {
	    attemptsLeft = attemptsLeft - 1;
	}	   
    }	
    
    //print out matrix for user with no moles
    void printGridToUser() {
	//int[][] userMoleGrid = 
	//System.out.println(Arrays.deepToString(moleGrid));
    }

    void printGrid() {
    }

    public static void main(String[] args) {

    }

}
