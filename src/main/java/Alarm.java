public class Alarm {
    public boolean set = false;

    public boolean set(){
        if(this.set){
            return false;
        }
        this.set = true;
        return true;
    }

    public boolean unset(){
        if(!this.set){
            return false;
        }
        this.set = false;
        return true;
    }

    public boolean check(){
        boolean tem = this.set;
        this.set = false;
        return tem;
    }
}
