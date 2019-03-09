package DemoUsunac;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (shapeType.equalsIgnoreCase("Kwadrat")){
            return new Kwadrat();
        }
        if (shapeType.equalsIgnoreCase("Prostokat")){
            return new Prostokat();
        }
        if (shapeType.equalsIgnoreCase("okrag")){
            return new Okrag();
        }
        return null;
    }
}
