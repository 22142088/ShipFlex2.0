 abstract class MenuItem {
     String name;
     public MenuItem(String name) {
          this.name = name;
     }
     public String getName() {
          return name;
     }
     public void execute(){};
}
class BootMenuItem extends MenuItem{
     public BootMenuItem(String name) {
          super(name);
     }
     @Override
     public void execute() {
          BootMenu bmenu = new BootMenu();
          bmenu.createMenu();
          bmenu.executeMenu(bmenu.printMenu());
     }
}
class OfferteMakenItem extends MenuItem {
     public OfferteMakenItem(String name) {
          super(name);
     }

     @Override
     public void execute() {
          double motorPrijs = Offerte.motorVragenLijst();


     }
}
class KlantenManagnementItem extends MenuItem {
     public KlantenManagnementItem(String name) {
          super(name);
     }

     @Override
     public void execute() {
     }
}

class TerugItem extends MenuItem {
     public TerugItem(String name) {
          super(name);
     }
     @Override
     public void execute() {
          //TODO FIX THIS
     }
}

 class PrijsIndicatieItem extends MenuItem {
      public PrijsIndicatieItem(String name) {
           super(name);
      }
      public void execute() {

      }
 }