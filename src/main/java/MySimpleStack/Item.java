package MySimpleStack;

public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }

    /**
     * modifié
     * @return
     */
    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
