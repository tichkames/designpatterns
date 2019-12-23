package com.hod.structural.composite;

import java.util.ArrayList;
import java.util.List;

//component
interface Faculty{
    String getDetails();
}

//leaf
class Professor implements Faculty {
    private String name;
    private String position;
    private int officeNumber;

    public Professor(String name, String position, int officeNumber){
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;
    }

    public String getDetails(){
        return String.format("name %s, position %s", this.name, this.position);
    }
}

//composite
class Supervisor implements Faculty{
    private String name;
    private String departmentName;

    private List<Faculty> facultyList;

    public Supervisor(String name, String departmentName){
        this.name = name;
        this.departmentName = departmentName;

        this.facultyList = new ArrayList<>();
    }

    public void add(Faculty professor){
        facultyList.add(professor);
    }

    public void remove(Faculty professor){
        facultyList.remove(professor);
    }

    public List<Faculty> getMyFaculty(){
        return facultyList;
    }

    @Override
    public String getDetails(){
        return String.format("name %s, departmentName %s", this.name, this.departmentName);
    }
}