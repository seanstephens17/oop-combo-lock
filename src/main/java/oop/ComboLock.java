package oop;

/**
 * Combination Lock
 * The correct (opening) combination code must be set when constructing the ComboLock.
 * The correct sequence of digits making up the code must be entered in order
 * to open the ComboLock.
 * When entering a code, the first digit must be entered by
 * turning Right (clockwise), then Left, and finally Right.
 */

public class ComboLock {

    // Instance variables (fields)
    // Code combination required to open this lock

    //TODO - create instance fields to store three code digits required to open lock

    // constructor
    // initialize/set the correct combination code for the lock
    //TODO - constructor to initialize lock

    public void reset() {
        //TODO reset the lock to start state
    }

    public void turnRight(int number) {
        //TODO how will turning right to the number
        // change the state of the lock?
    }

    public void turnLeft(int number) {
        //TODO how will turning right to the number
        // change the state of the lock?
    }

    public boolean open() {
        //TODO logic for testing if lock is open
        /*if (   ???  )
                return true;

        */

        return false;
    }

    //TODO
    // Consider - can a user open this lock by entering the right sequence of
    // codes but with some incorrect ones in between the correct ones.
    // How might this be resolved?
}
