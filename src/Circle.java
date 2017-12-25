
final class Circle implements Figure {
	
private final double radius;

public Circle(final double radius) {
    this.radius = radius;
}


@Override
public double square() {
    return Math.PI * radius * radius;
}

@Override
public String toString() {
    return String.format("%s{ radius = %f }",
            getClass().getSimpleName(), radius);
}



	
	

}
