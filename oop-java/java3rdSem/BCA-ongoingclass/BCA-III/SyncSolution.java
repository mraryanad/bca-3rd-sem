public class SyncSolution extends Thread {
    RefClass reference;

    SyncSolution(RefClass r){
        reference = r;
    }
    
    public void run(){
       reference.syncBlock();
    }

    public static void main(String args[]){
        RefClass r = new RefClass();
        SyncSolution s1 = new SyncSolution(r);
        s1.start();

        SyncSolution s2 = new SyncSolution(r);
        s2.start();
    }
}

class RefClass {
    synchronized public void syncBlock(){
        // synchronized(this){
        //    for(int i=0; i<10; i++){
        //     System.out.println(i);
        //    } 
        // }
        for(int i=0; i<5; i++){
            System.out.println(i);
        }
    }
}