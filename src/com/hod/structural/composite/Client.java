package com.hod.structural.composite;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        Supervisor techDean = new Supervisor("Dr. Mike", "Dean of Tech");
        Supervisor chairOfMath = new Supervisor("Dr. John", "Chair of Math Dept.");
        Supervisor chairOfComSci = new Supervisor("Dr. Ian", "Chair of ComSci Dept.");

        Professor mathProf1 = new Professor("Math Prof 1", "Adjunct", 302);
        Professor mathProf2 = new Professor("Math Prof 2", "Associate", 303);

        Professor cscProf1 = new Professor("CS Prof 1", "Adjunct", 101);
        Professor cscProf2 = new Professor("CS Prof 2", "Professor", 102);
        Professor cscProf3 = new Professor("CS Prof 3", "Professor", 111);

        techDean.add(chairOfMath);
        techDean.add(chairOfComSci);

        //professors of math directly report to chair of math
        chairOfMath.add(mathProf1);
        chairOfMath.add(mathProf2);

        //professors of csc directly report to chair of csc
        chairOfComSci.add(cscProf1);
        chairOfComSci.add(cscProf2);
        chairOfComSci.add(cscProf3);

        System.out.println("College Structure");
        System.out.println(techDean.getDetails());

        List<Faculty> facultyForTechDean = techDean.getMyFaculty();
        for (Faculty chair : facultyForTechDean) {
            System.out.println("\t" + chair.getDetails());
        }

        List<Faculty> facultyForMathProfs = chairOfMath.getMyFaculty();
        for (Faculty prof : facultyForMathProfs) {
            System.out.println("\t\t" + prof.getDetails());
        }

        List<Faculty> facultyForCSCProfs = chairOfComSci.getMyFaculty();
        for (Faculty prof : facultyForCSCProfs) {
            System.out.println("\t\t" + prof.getDetails());
        }
    }

}
