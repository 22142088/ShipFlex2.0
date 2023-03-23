 abstract class MenuItem {
     String name;
     public MenuItem(String name) {
          this.name = name;
     }

     String getName() {
          return name;
     }

     public void execute(){};
}

//
//// meerdere classes maken met verschillende functies aka -> lijstmenufunctie -> klantenMenuFunctie -> offerteMakenFunctie
////execute(input){}

class OptieLijstItem extends MenuItem{

     public OptieLijstItem(String name) {
          super(name);
     }

     @Override
     public void execute() {
          BootMenu bmenu = new BootMenu();
          bmenu.createMenu();
          bmenu.execute(bmenu.printMenu());
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
class SpeedbootItem extends MenuItem {

     public SpeedbootItem(String name) {
          super(name);
     }
}
 class VrachtSchipItem extends MenuItem {

      public VrachtSchipItem(String name) {
           super(name);
      }
 }
 class ZeilbootItem extends MenuItem {

      public ZeilbootItem(String name) {
           super(name);
      }
 }
 class DinghyItem extends MenuItem {

      public DinghyItem(String name) {
           super(name);
      }
 }