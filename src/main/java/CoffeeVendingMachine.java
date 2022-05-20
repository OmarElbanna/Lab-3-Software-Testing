public class CoffeeVendingMachine extends CoffeeVendingStorage {
    public String state = "VENDING";

    public Boolean getinput(char input){
        switch (this.state) {
            case "VENDING":
                if (input == 'c') { //coffee
                    return (this.useWater() && this.useBeans());
                } else if (input == 'l') { //latte
                    return (this.useWater() && this.useBeans() && this.useMilk());
                } else if (input == 'm') { //mocha
                    return (this.useMilk() && this.useBeans() && this.useChocolate());
                } else if (input == 'r') {
                    this.state = "REFILL";
                    return true;
                }
                break;
            case "REFILL":
                if (input == 'b') { //beans
                    this.addBeans(1);
                    return true;
                } else if (input == 'w') { //water
                    this.addWater(1);
                    return true;
                } else if (input == 'm') { //milk
                    this.addMilk(1);
                    return true;
                } else if (input == 'c') { //choco
                    this.addChocolate(1);
                    return true;
                } else if (input == 'v') {
                    this.state = "VENDING";
                    return true;
                }
                break;
        }
        return false;
    }
}
