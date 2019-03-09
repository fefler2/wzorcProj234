package WzorceProj.FactoryPatternTutorialsPoint;

public class ShapeFactory {
    public  Shape getShape(String shapeType){
        if (shapeType== null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("Kwadrat")){
            return new Kwadrat();
        }
        if (shapeType.equalsIgnoreCase("Prostokat")){
            return new Prostokat();
        }
        if (shapeType.equalsIgnoreCase("Okrag")){
            return new Okrag();
        }
        return null;
    }
}
