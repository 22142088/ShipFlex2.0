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
class BootOptieLijstItem extends MenuItem {
     public BootOptieLijstItem(String name) {
          super(name);
     }

     @Override
     public void execute() {
          OptieLijst.printLijst(OptieLijst.getBootInput());
          new TerugMenu().createMenu();
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
          new KlantBeheer().Menu();
     }
}

class HoofdMenuItem extends MenuItem {
     public HoofdMenuItem(String name) {
          super(name);
     }
     @Override
     public void execute() {
          new HoofdMenu().createMenu();
     }
}

 class PrijsIndicatieItem extends MenuItem {
      public PrijsIndicatieItem(String name) {
           super(name);
      }
      public void execute() {
           ConsolePrinter printer = new ConsolePrinter();
           printer.println("€" + OptieLijst.prijsIndicatie(OptieLijst.getBootInput()));
           new TerugMenu().createMenu();
      }
 }
 class OptieOptiesItem extends MenuItem {
     public OptieOptiesItem(String name) { super(name); }
     public void execute() {
          new OptieKeuzeMenu().createMenu();
     }
}