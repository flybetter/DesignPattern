package bigtalkdesignpattern.templatepattern;

public  class TestPager {
    public void questionA(){

        System.out.println("questionA: the questions?");
        System.out.println("answerA:"+answerA());
    }

    public void questionB(){

        System.out.println("questionB: the questions?");
        System.out.println("answerB:"+answerB());
    }

    public void questionC(){

        System.out.println("questionC: the questions?");

        System.out.println("answerC:"+answerC());

    }

    public String answerA(){
        return "";
    }

    public String answerB(){
        return "";
    }

    public String answerC(){
        return "";
    }
}
