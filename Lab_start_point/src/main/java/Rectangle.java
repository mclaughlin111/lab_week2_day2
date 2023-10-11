
public class Rectangle {
    private int length;
    // should never really have public variables under a class
    // as you're using OOP Java because some methods rely on getters and setters
    private int width;
    private int area;


    //class begins with capital letter, and file name has to match
    public Rectangle(int length, int width){
        this.length = length;

        // why this.length = length;?
        // we have class "blueprint"
        // but blueprint doesn't supply enough specificity
        // so need to specify what length is for SPECIFIC OBJECT
        // makes intentions clear
        this.width = width;
    }
    // when instantiating classes, you need to feed the class some parameter for each variable it has

    //methods use Camel Case!
    public int getArea(){
        return this.length * this.width;
    }
    // method does need this.
    // good practice to specify anyway.

    public boolean isSquare(){
        // ALTERNATE SOLUTION: return this.length == this.width;
        // as ternary operator ? true : false

         if (this.length==this.width){
             return true;
         }
         else {
             return false;
         }
    }

    }


