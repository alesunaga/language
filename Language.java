// language class
public class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

//constructor
public Language(String lang_name, int speakers, String region, String order){
  this.name = lang_name;
  this.numSpeakers = speakers;
  this.regionsSpoken = region;
  this.wordOrder = order;
}

//method
public void getInfo(){
System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
System.out.println("The language follows the ord order: " + this.wordOrder + ".");
}


//main
  public static void main(String[] args){
    Mayan kiche = new Mayan("Kʼicheʼ", 10550407, "Central America", "verb-object-subject");
    kiche.getInfo();
    SinoTibetan chinese = new SinoTibetan("Mandarin Chinese", 1500000000, "Asia", "Verb-subject-object");
    SinoTibetan burmese = new SinoTibetan("Burmese", 15000, "Asia", "verb-object-subject");
    chinese.getInfo();
    burmese.getInfo();


    
  }
}
