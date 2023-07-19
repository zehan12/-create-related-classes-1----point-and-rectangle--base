public  class Point {
    // write the code of point class here
    int x;
    int y;

    //Create a class constructor for the Main class
    public Point(int num1, int num2) {
        this.x = num1;
        this.y = num2;
    }
    public int sum() {
        return this.x + this.y;
    }
    public static void main ( String[] args ) {
        Point myPoint = new Point(33,33);
        // myPoint.x = 2;
        // myPoint.y = 33333;
        System.out.println(myPoint.sum());
    }
}
