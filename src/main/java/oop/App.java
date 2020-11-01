package oop;
/**
 * Combination Lock - Combo Lock App
 * (Solution to Exercise P8.9 from Big Java Book)
 */
public class App {
    public static void main(String[] args) {
        System.out.println("\n*** Combo Lock App ***");
        App app = new App();
        app.start();
    }

    public void start() {
        ComboLock lock = new ComboLock( 30,15,35 ); // create with code

        lock.reset();   // reset/clear any previous codes entered


        // simulate turning wheel left and right to open combo lock
        lock.turnRight( 11 );
        lock.turnLeft( 22 );
        lock.turnRight( 33 );

        // If we entered the right sequence of codes then
        // we should be able to open the lock.
        if ( lock.open() )
            System.out.println("Combo Lock opened successfully");
        else
            System.out.println("Combo Lock NOT opened, incorrect sequence of codes entered");

        // Try opening with correct code this time.
        lock.turnRight( 30 );
        lock.turnLeft( 15 );
        lock.turnRight( 35 );

        // If we entered the right sequence of codes then
        // we should be able to open the lock.
        if ( lock.open() )
            System.out.println("Combo Lock opened successfully");
        else
            System.out.println("Combo Lock NOT opened, incorrect sequence of codes entered");

        // Try opening with correct code this time.
        lock.turnRight( 30 );
        lock.turnLeft(99);  // not part of combination code!
        lock.turnRight(99); //not part of combination code!
        lock.turnLeft( 15 );
        lock.turnRight( 35 );

        // Above, some incorrect digits are interleaved with the correct sequence.
        // Will the lock open? Should it open?
        if ( lock.open() )
            System.out.println("Combo Lock opened successfully");
        else
            System.out.println("Combo Lock NOT opened, incorrect sequence of codes entered");

    }
}
