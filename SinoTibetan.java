class SinoTibetan extends Language {

   SinoTibetan(String lang_name, int speakers, String region, String wordOrder) {
    super(lang_name, speakers, region, wordOrder);
    if (lang_name.contains("Chinese")) {
      this.wordOrder = "subject-verb-object";
      this.regionsSpoken = "Asia";
    }
  }
  }
