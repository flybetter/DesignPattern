package oldpackage.demo;

public enum Days2 {

    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURSDAY("星期六"),SUNDAY("星期天");

    private String description;

    private Days2(String description){
        this.description=description;
    }

    public String getDescription(){
        return this.description;
    }

    public static void main(String[] args) {

        for (Days2 days2:Days2.values()){
            System.out.println(days2.name()+days2.getDescription());
        }
    }

}
