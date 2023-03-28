package homework_week8_niks.poolarea;

/**
 * 2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field
 * (instance variable) with name height of type double.
 * The class needs to have one constructor with three parameters width, length, and height all of type
 * double. It needs to call the parent constructor and initialize a height field.
 * In case the height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getHeight without any parameters, it needs to return the value of height
 * field.
 * ● Method named getVolume without any parameters, it needs to return the calculated volume.
 * To calculate volume, multiply the area with height.
 */
public class Cuboid extends Rectangle{
    double heigth;
    public Cuboid (double length, double heigth, double width){
        super(width,length);
        if (heigth <0){
            this.heigth = 0;
        }else{
            this.heigth =heigth;
        }

    }
        public double getHeigth(){
        return heigth;
        }
        public double getVolume(){
        double volume = getArea() * heigth;
        return volume;
    }
}
