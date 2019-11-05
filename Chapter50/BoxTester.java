class BoxTester {

    public static void main ( String[] args ) {

        Box box = new Box( 2.5, 5.0, 6.0 );

        System.out.println( "Area: " + box.area() + " volume: " + box. volume() );

        System.out.println( "length: " + box.getLength() + " height: " + box.getHeight() + " width:  " + box.getWidth() + " top area: " + box.getTopArea() + " face area: " + box.getFaceArea() + " side area: " + box.getSideArea()) ;
        
        Box newBox = new Box( box );

        System.out.println( "length: " + newBox.getLength() + " height: " + newBox.getHeight() + " width:  " + newBox.getWidth() + " top area: " + box.getTopArea() + " face area: " + box.getFaceArea() + " side area: " + box.getSideArea()) ;

        Box biggerBox = box.biggerBox( box );

        System.out.println( "length: " + biggerBox.getLength() + " height: " + biggerBox.getHeight() + " width:  " + biggerBox.getWidth() ) ;
        
        Box smallerBox = box.smallerBox( box );

        System.out.println( "length: " + smallerBox.getLength() + " height: " + smallerBox.getHeight() + " width:  " + smallerBox.getWidth() ) ;

        System.out.println(box.nests(biggerBox));
    }
}