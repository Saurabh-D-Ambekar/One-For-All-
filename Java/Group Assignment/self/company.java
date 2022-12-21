class company1 {

}
class own1 extends company1 {
    own1() {
        System.out.println("Hello Owner");
    }
}

class own2 extends company1 {
    own2() {
        System.out.println("Hello Owner 2");
    }
}
public class company{
    
    public static void main (String[] args){
      own1 own1 = new own1();
      own2 own2 = new own2();
}
}