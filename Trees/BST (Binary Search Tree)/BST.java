public class BST {

    private BTNode root;

    public BST(){
        root=null;
    }

    public void insert(int element){

        //Make space for new element
        BTNode newNode=new BTNode(element);

        //is tree empty?
        if (root==null){
            root=newNode;
            return;
        }

        BTNode current=root;
        BTNode parent=null;//parent=previous

        while (current!=null){
            //to check not to allow duplicate elements
            if (current.data==element){
                return;
            }
            parent=current;
            if(element<current.data){
                current=current.leftchild;
            }
            else {
                current=current.rightchild;
            }
        }

        //make newnode as child of parent
        if (element< parent.data){
            parent.leftchild=newNode;
        }
        else{
            parent.rightchild=newNode;
        }



    }

    public boolean search(int element){

        BTNode current=root;

        while (current!=null){
            if(current.data==element){
                return true;
            }
            if (element<current.data){
                current=current.leftchild;
            }
            else{
                current=current.rightchild;
            }
        }

        return false;

    }

}
