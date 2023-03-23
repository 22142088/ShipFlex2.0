abstract class MenuItem {
     String name;
     public MenuItem(String name) {
          this.name = name;
     }

     String getName(){return name;}

     public void execute(){};
}

// meerdere classes maken met verschillende functies aka -> lijstmenufunctie -> klantenMenuFunctie -> offerteMakenFunctie
//execute(input){}

class LijstMenuItem extends MenuItem{

     public LijstMenuItem(String name) {
          super(name);
     }

     @Override
     public void execute(){
          System.out.println("test");
     }

}

