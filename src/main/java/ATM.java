public class ATM extends Storage {
    public String state = "LOGOUT";

    public Boolean getinput(char input){
        switch (this.state) {
            case "LOGOUT":
                if (input == 'l') {
                    this.state = "LOGIN";
                    return true;
                } else if (input == 'u') {
                    this.state = "UNLOCKED";
                    return true;
                }
                break;
            case "LOGIN":
                if (input == 'w') {
                    return this.withdraw();
                } else if (input == 'd') {
                    this.fill(1);
                    return true;
                } else if (input == 'o') {
                    this.state = "LOGOUT";
                    return true;
                }
                break;
            case "UNLOCKED":
                if (input == 'f') {
                    this.fill(1);
                    return true;
                } else if (input == 'l') {
                    this.state = "LOGOUT";
                    return true;
                }
                break;
        }
        return false;
    }
}
