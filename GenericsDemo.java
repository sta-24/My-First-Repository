
  class GenData<T> {
    T obj;

   
    GenData(T o) {
        obj = o;
    }

    
    T getObj() {
        return obj;
    }


    void showTypes() {
        System.out.println("Type: " + obj.getClass());
    }}
    
class GenericsDemo{
    public static void main(String[] args) {
    
        GenData<Integer> iob = new GenData<>(88);


        iob.showTypes();

      
        System.out.println("Value: " + iob.getObj());
    }
}

