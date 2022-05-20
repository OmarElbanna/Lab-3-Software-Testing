public class Watch extends Alarm{
    public String state = "TIME";

    public Boolean input(char c){
        switch (this.state) {
            case "TIME":
                if (c == 't') { //tell time
                    return true;
                } else if (c == 's') { //set time
                    this.state = "SET";
                    return true;
                } else if (c == 'a') { //enter alarm module
                    this.state = "ALARM";
                    return true;
                }
                break;
            case "SET":
                if (c == 's') { //set seconds
                    return true;
                } else if (c == 'm') { //set minutes
                    return true;
                } else if (c == 'h') { //set hours
                    return true;
                } else if (c == 'D') { //set Days
                    return true;
                } else if (c == 'M') { //set Months
                    return true;
                } else if (c == 'Y') { //set Years
                    return true;
                } else if (c == 't') {
                    this.state = "TIME";
                    return true;
                }
                break;
            case "ALARM":
                if (c == 's') { //set Alarm
                    return this.set();
                } else if (c == 'u') { //unset Alarm
                    return this.unset();
                } else if (c == 'c') { //ring Alarm
                    return this.check();
                } else if (c == 't') {
                    this.state = "TIME";
                    return true;
                }
                break;
        }
        return false;
    }
}
