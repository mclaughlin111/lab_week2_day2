import java.util.ArrayList;



public class ShoppingTrolley {
    private ArrayList<String> items;

    public ShoppingTrolley(){
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        this.items.add(item);
    }

    public int countItems() {
        return this.items.size();
//        numItems == this.items.size();
    }

    public boolean itemInTrolley(){

        if (this.items.isEmpty() == true){
            return false;
        }
        else {
            return true;
        }
    }

}
