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
          ConsolePrinter consolePrinter = new ConsolePrinter();
          Offerte offerte = new Offerte("Simon", "SimonDeSnelleBoot", , 100);
          consolePrinter.printf("%d", offerte.test());
     }
}
class KlantenManagnementItem extends MenuItem {
     public KlantenManagnementItem(String name) {
          super(name);
     }
     @Override
     public void execute() {
          new KlantBeheerMenu().createMenu();
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
      @Override
      public void execute() {
           ConsolePrinter printer = new ConsolePrinter();
           printer.println("€" + OptieLijst.prijsIndicatie(OptieLijst.getBootInput()));
           new TerugMenu().createMenu();
      }
 }
 class OptieOptiesItem extends MenuItem {
     public OptieOptiesItem(String name) {
          super(name);
     }
     @Override
     public void execute() {
          new OptieKeuzeMenu().createMenu();
     }
}

class KlantToevoegenItem extends MenuItem {
     public KlantToevoegenItem(String name) {
          super(name);
     }
     @Override
     public void execute() {
          new KlantBeheer().addKlant();
     }
}

class KlantAanpassenItem extends MenuItem {
     public KlantAanpassenItem(String name) {
          super(name);
     }
     @Override
     public void execute() {
         new KlantBeheer().editKlant();
     }
}

class PrintKlantenItem extends MenuItem {
     public PrintKlantenItem(String name) {
          super(name);
     }
     @Override
     public void execute() {
          new KlantBeheer().printData();
          new TerugMenu().createMenu();
     }
}

class KlantVerwijderenItem extends MenuItem {
     public KlantVerwijderenItem(String name) {
          super(name);
     }
     @Override
     public void execute() {
          new KlantBeheer().deleteKlant();
     }
}