public class GenMethodDemo {

    public static <E> void printArray(E[] arr){
               for(E ele:arr){
                   System.out.println(ele+" ");
               }
    }

    public static void main(String[] args) {
        String[] cities ={"HYD","Nap","pune"};

        printArray(cities);
    }

}
