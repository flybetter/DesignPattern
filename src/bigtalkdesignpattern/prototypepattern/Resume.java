package bigtalkdesignpattern.prototypepattern;

public class Resume implements Cloneable {

    private String name;

    private Integer age;

    private String sex;

    private WorkExperience workExperience;


    public Resume(String name) {
        this.name = name;
        this.workExperience=new WorkExperience();
    }

    public Resume(WorkExperience workExperience)throws CloneNotSupportedException{
        workExperience=(WorkExperience) workExperience.clone();
    }


    public void setPersonInfo(Integer age,String sex){
        this.age=age;
        this.sex=sex;
    }



    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
         Resume resume=new Resume(this.workExperience);
         resume.sex=this.sex;
         resume.age=this.age;
         resume.name=this.name;
         return resume;
    }
}
