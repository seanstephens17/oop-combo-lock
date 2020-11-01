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
    int digit1;
    int digit2;
    int digit3;

    private LockStateEnum LockStateEnum;    // current state of the ComboLock

    // constructor
    // initialize/set the correct combination code for the lock
    public ComboLock(int digit1, int digit2, int digit3) {
        this.digit1 = digit1;
        this.digit2 = digit2;
        this.digit3 = digit3;
        this.LockStateEnum = LockStateEnum.NONE_CORRECT;
    }

    public void reset() {
        this.LockStateEnum = LockStateEnum.NONE_CORRECT;
    }

    public void turnRight(int number) {
        if (LockStateEnum == LockStateEnum.NONE_CORRECT && digit1 == number)
            LockStateEnum = LockStateEnum.FIRST_CORRECT;

        if (LockStateEnum == LockStateEnum.SECOND_CORRECT && digit3 == number)
            LockStateEnum = LockStateEnum.ALL_THREE_CORRECT;
    }

    public void turnLeft(int number) {

        if (LockStateEnum == LockStateEnum.FIRST_CORRECT && digit2 == number)
            LockStateEnum = LockStateEnum.SECOND_CORRECT;
    }

    public boolean open() {
        if (LockStateEnum == LockStateEnum.ALL_THREE_CORRECT)
            return true;
        else
            return false;
    }

    //TODO
    // Consider - can a user open this lock by entering the right sequence of
    // codes but with some incorrect ones in between the corect ones.
    // How might this be resolved?
}
