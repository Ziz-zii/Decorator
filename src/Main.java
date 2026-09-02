//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Coffe coffe = new BaseCoffe();

    Coffe sugar = new AddSugarDecor(coffe);

    System.out.println(sugar);


}
