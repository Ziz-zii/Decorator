abstract class CoffeDecorator implements Coffe{

    protected Coffe decorCoffe;

    public CoffeDecorator(Coffe coffe){
        this.decorCoffe = coffe;
    }

    @Override
    public String getAdditives (){
        return decorCoffe.getAdditives();
    }
    @Override
    public double getCost (){
        return decorCoffe.getCost();

    }
}
