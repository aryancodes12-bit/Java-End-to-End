package Day5;
interface bicycle {
   void applyBreak(int dec);
   int a=45;
    void speedUp(int inc);
}
interface  horn{
    void applyHorn();
    void applyHorn2();
}
class avoncycle implements bicycle,horn {
    @Override
    public void speedUp(int inc) {
        System.out.println("speeding up");
    }

    @Override
    public void applyBreak(int dec) {
        System.out.println("applying break");
    }

    @Override
    public void applyHorn() {
        System.out.println(" pe pe pe ");
    }

    @Override
    public void applyHorn2() {
        System.out.println("po po po");
    }

    public static class interfaces {
        public static void main(String[] args) {
            avoncycle c = new avoncycle();
           c.speedUp(8);
           c.applyBreak(8);
           c.applyHorn();
           c.applyHorn2();
            System.out.println(bicycle.a);
        }


    }
}