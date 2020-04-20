package bigtalkdesignpattern.templatepattern;

public class Context {
    public static void main(String[] args) {
        TestPager pager = new TestPageA();

        pager.questionA();
        pager.questionB();
        pager.questionC();

        pager=new TestPageB();
        pager.questionA();
        pager.questionB();
        pager.questionC();

    }
}
