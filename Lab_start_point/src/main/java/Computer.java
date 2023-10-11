public class Computer {

    private int currentStorage;
    private String printerProperty;
//    private
//    private String printMessage;

    public Computer(int currentStorage){
        this.currentStorage=currentStorage;
        // Needed to define status of printer - printerProperty string
        this.printerProperty = "";
    }
    public int getCurrentStorage() {
        return this.currentStorage;
    }
    public String getCurrentPrinter() {
        return this.printerProperty;
    }



    public void addStorage(int newStorage) {
        this.currentStorage = newStorage;
    }

    public void printerProperty(String currentPrinter) {
        this.printerProperty = currentPrinter;
    }

    public void printMessage(String message) {
//        this.printMessage = message;
        System.out.println(message);
    }


    // EXTENSION SOLUTION
    // !this means if is connected?

    public void printerMessage(String message){
        if (!this.printerProperty.equals("")){
            System.out.println(message);
        }
    }

}
