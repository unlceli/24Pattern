package com.example.li.lll.a24patternproject.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.PublicKey;

/**
 * 简历类
 */
public class Resume implements Cloneable,Serializable {
    private static final long serialVersionUID = -4410449301166191440L;

    private String name;
    private String gender;
    private int age;

    private WorkExperience workExperience;

    public Resume(){
        this.workExperience =  new WorkExperience();
    }
    public String getGender() {
        return gender;
    }

    public Resume setGender(String gender) {
        this.gender = gender;

        return this;
    }
    public void display(){
        System.out.println(this.getName() + " " + this.getGender() + " "
                + this.getAge() + "\n工作经历： "
                + this.getWorkExperience().getWorkDate() + " "
                + this.getWorkExperience().getWorkCompany());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() throws IOException,ClassNotFoundException{
        //将对象写入流
        ByteArrayOutputStream bos =new ByteArrayOutputStream();
        ObjectOutputStream oss= new ObjectOutputStream(bos);
        oss.writeObject(this);

        //从流读出来，
        ObjectInputStream ois =new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        return ois.readObject();
    }

    public String getName(){
        return name;
    }
    public Resume setName(String name){
        this.name= name;
        return this;
    }

    public int getAge() {
        return age;
    }
    public Resume setAge(int age){
        this.age = age;
        return this;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }
    public void setWorkExperience(String worDate,String workCompany){
        workExperience.setWorkCompany(workCompany);
        workExperience.setWorkDate(worDate);
    }
}
