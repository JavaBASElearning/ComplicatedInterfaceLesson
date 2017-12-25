
final class Rectangle implements Figure {
	
	private final double width;
    private final double height;
    
    public Rectangle(final double width, final double height) {
        this.width = width;
        this.height = height;
    } 
    
    @Override
    public double square() {
        return width * height;
    }	
	
    @Override
    public String toString() {
        return String.format("%s{ width = %f ; height = %f }",
                getClass().getSimpleName(), width, height);
    }
    
    
    
    
}
