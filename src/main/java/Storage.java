public class Storage {
    public int amount = 0;

    public boolean withdraw(){
        if(this.amount <= 0){
            return false;
        }
        this.amount--;
        return true;
    }
    public void fill(int i){
        this.amount += i;
    }


}
