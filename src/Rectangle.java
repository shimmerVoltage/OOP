class Rectangle extends Shape {
    //int width;
    //int height;

    //int area() {
    //    return width * height;
    //}

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Dimensions must be POSITIVE!");
        }
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    @Override
    public int area() {
        return width * height;
    }
}
