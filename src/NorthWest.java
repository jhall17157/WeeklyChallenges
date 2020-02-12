public enum NorthWest {
    THUNDER ("ok city", "okc"),
    NUGGETS ("Minnesota", "nugs"),
    TIMBERWOLVES ("Denver", "timber"),
    TRAILBLAZERS ("portland", "blazers"),
    JAZZ ("utah", "uj");
    private String abbrev;
    private String city;
    private NorthWest(String city, String abbrev) {
        this.city = city;
        this.abbrev = abbrev;
    }
    public String getCity() {
        return  city;
    }
    public String getAbbrev() {
        return abbrev;
    }
}