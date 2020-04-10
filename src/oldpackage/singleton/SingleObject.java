package oldpackage.singleton;

 class SingleObject {
    private static SingleObject singleObject = new SingleObject();

     static SingleObject getSingleObject() {
        return singleObject;
    }

     void showMessage() {
        System.out.println("show message");
    }

}
