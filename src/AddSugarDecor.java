public class AddSugarDecor extends CoffeDecorator {

    public AddSugarDecor (Coffe coffe){
        super(coffe);
    }
    @Override
    public String getAdditives (){
        return decorCoffe.getAdditives() + "+sugar";
    }
    @Override
    public double getCost() {
        return decorCoffe.getCost()+ 2;
    }
    @Override
    public String toString() {
        return "Coffe: " + getAdditives() +
                "\nCost: " + getCost();
    }
}
