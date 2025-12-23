class Square extends Shape{ //Rectangle {
    //void setSide(int side) {
    //    width = side;
    //    height = side;
    //}

    private Rectangle rectangle;

    public Square(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be POSITIVE!");
        }
        this.rectangle = new Rectangle(side, side);
    }

    public int getSide() {
        return rectangle.getWidth();
    }

    @Override
    public int area() {
        return rectangle.area();
    }
}