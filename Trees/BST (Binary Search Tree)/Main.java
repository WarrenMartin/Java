public class Main {
    public static void main(String[] args) {
        BST bst01 =new BST();

        bst01.insert(10);
        bst01.insert(5);
        bst01.insert(0);
        bst01.insert(90);
        bst01.insert(10);
        bst01.insert(10);
        bst01.insert(10);

        if(bst01.search(10)){
            System.out.printf("10 is there");
        }
        else {
            System.out.printf("Number not present");
        }



    }
}
