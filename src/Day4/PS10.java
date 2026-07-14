package Day4;
// problem 1
//class circle{
//    int radius;
//
//  public circle(int r){
//      radius=r;
//  }
//  public double area() {
//        return Math.PI * this.radius * this.radius;
//    }
//}
//class cylinder extends circle {
//    int height;
//  public cylinder(int radius, int height){
//    super(radius);
//    this.height=height;
//}
//    public double volume() {
//        return Math.PI * this.radius * this.radius * this.height;
//    }
//}
//public class PS10 {
//    public static void main(String[] args) {
//        circle o=new circle(5);
//        System.out.println(o.area());
//        cylinder c=new cylinder(4,6);
//        System.out.println(c.volume());
//    }

    // problem 2
class Rectangle {
    int side;
    int length;
        public Rectangle(int s,int l) {
            side=s ;
            length=l;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }


        public int getSide() {
            return side;
        }
        public void setSide(int side) {
            this.side = side;
        }


        public int area() {
            return length*side;
        }

    }

//    class cubiod extends Rectangle {
//    int height;
//        public cubiod(int length, int side, int height) {
//            super(length,side);
//           this.height=height;
//
//        }
//        int area1(){
//          return 2*height*(length+side);
//        }
//int vol(){
//            return length*side*height;
//}
//        public int getHeight() {
//            return height;
//        }
//
//        public void setHeight(int height) {
//            this.height = height;
//        }
//    }
//
//
//   class PS10 {
//       public static void main(String[] args) {
//   Rectangle r=new Rectangle(5,7);
//   cubiod c=new cubiod(4,5,7);
//           System.out.println(  c.area());
//           System.out.println(  c.area1());
//
//       }
// problem 3

       class PS10 {
           public static void main(String[] args) {

           }
   }


