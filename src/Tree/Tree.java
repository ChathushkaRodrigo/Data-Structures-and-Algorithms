public class Tree {

    private Node root;

    public Tree(){
        root=null;
    }
    public void insert(int id,double dd){
            


    }
    public boolean delete(int id){
        return true;
    }

    public Node find(int key){
     
        Node current =root;

        while(current.iData !=key){
            if(key < current.iData){

                current = current.leftChild;
            }
            else{
                current = current.rightChild;

            }
            if(current ==null){
                return null;
            }
            
        }
        return current;











    }
}
