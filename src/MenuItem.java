import java.util.ArrayList;

abstract class MenuItem {
     String name;
     public MenuItem(String name) {
          this.name = name;
     }
     public String getName() {
          return name;
     }
     public void execute(IO io) {};
}
class BootOptieLijstItem extends MenuItem {
     public BootOptieLijstItem(String name) {
          super(name);
     }
     @Override
     public void execute(IO io) {
          OptieLijst.printLijst(io, OptieLijst.getBootInput(io));
          new TerugMenu().createMenu(io);
     }
}
class OfferteMakenItem extends MenuItem {
     public OfferteMakenItem(String name) {
          super(name);
     }
     @Override
     public void execute(IO io) {
//          Offerte offerte = new Offerte();
//          Main.printer.printf("%d", offerte.test());
     }
}
class KlantenManagnementItem extends MenuItem {
     public KlantenManagnementItem(String name) {
          super(name);
     }
     @Override
     public void execute(IO io) {
          new KlantBeheerMenu().createMenu(io);
     }
}

class HoofdMenuItem extends MenuItem {
     public HoofdMenuItem(String name) {
          super(name);
     }
     @Override
     public void execute(IO io) {
          new HoofdMenu().createMenu(io);
     }
}

 class PrijsIndicatieItem extends MenuItem {
      public PrijsIndicatieItem(String name) {
           super(name);
      }
      @Override
      public void execute(IO io) {
           io.println("€" + OptieLijst.prijsIndicatie(io, OptieLijst.getBootInput(io)));
           new TerugMenu().createMenu(io);
      }
 }
 class OptieOptiesItem extends MenuItem {
     public OptieOptiesItem(String name) {
          super(name);
     }
     @Override
     public void execute(IO io) {
          new OptieKeuzeMenu().createMenu(io);
     }
}

class KlantToevoegenItem extends MenuItem {
     public KlantToevoegenItem(String name) {
          super(name);
     }
     @Override
     public void execute(IO io) {
          new KlantBeheer(io).addKlant();
     }
}

class KlantAanpassenItem extends MenuItem {
     public KlantAanpassenItem(String name) {
          super(name);
     }
     @Override
     public void execute(IO io) {
         new KlantBeheer(io).editKlant();
     }
}

class PrintKlantenItem extends MenuItem {
     public PrintKlantenItem(String name) {
          super(name);
     }
     @Override
     public void execute(IO io) {
          new KlantBeheer(io).printData();
          new TerugMenu().createMenu(io);
     }
}

class KlantVerwijderenItem extends MenuItem {
     public KlantVerwijderenItem(String name) {
          super(name);
     }
     @Override
     public void execute(IO io) {
          new KlantBeheer(io).deleteKlant();
     }
}

class ExitItem extends MenuItem {
     public ExitItem(String name) {
          super(name);
     }
}