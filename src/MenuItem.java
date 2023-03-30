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
class OptieLijstItem extends MenuItem{
     public OptieLijstItem(String name) {
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
}
class KlantenManagnementItem extends MenuItem {
     public KlantenManagnementItem(String name) {
          super(name);
     }
}

class TerugItem extends MenuItem {
     public TerugItem(String name) {
          super(name);
     }
     @Override
     public void execute() {
          // FIX THIS
     }
}

//sub menu
class SpeedbootItem extends MenuItem {
     public SpeedbootItem(String name) {
          super(name);
     }
     @Override
     public void execute() {
          OptieLijst.printLijst(OptieLijst.getLijst(),0);
     }
}
 class VrachtSchipItem extends MenuItem {
      public VrachtSchipItem(String name) {
           super(name);
      }
      @Override
      public void execute() {
           OptieLijst.printLijst(OptieLijst.getLijst(),1);
      }
 }
 class ZeilbootItem extends MenuItem {
      public ZeilbootItem(String name) {
           super(name);
      }
      @Override
      public void execute() {
           OptieLijst.printLijst(OptieLijst.getLijst(),2);
      }
 }
 class DinghyItem extends MenuItem {
      public DinghyItem(String name) {
           super(name);
      }
      @Override
      public void execute() {
           OptieLijst.printLijst(OptieLijst.getLijst(),3);
      }
 }