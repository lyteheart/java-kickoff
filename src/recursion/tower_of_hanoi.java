package recursion;

public class tower_of_hanoi {

    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        // base case
        if (disks==1){
            System.out.println("Move disk 1 from "+auxiliary+" to "+destination);
            return;
        }

        // Step 1 — move n-1 disks from source to helper
        towerOfHanoi(disks-1,source,destination,auxiliary);

        // Step 2 — move biggest disk from source to dest
        System.out.println("Move disk "+disks+" from "+source+" to "+destination);

        // Step 3 — move n-1 disks from helper to dest
        towerOfHanoi(disks - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        towerOfHanoi(3,'a','b','c');
    }
}
