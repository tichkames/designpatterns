package com.hod.behavioral.interpreter;

public class Client {

    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");

        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");

        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        Context ctx = new Context("John");
        System.out.println("John is male? " + isMale.interpret(ctx));

        Context ctx2 = new Context("Married Julie");
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret(ctx2));

        Context ctx3 = new Context("Lucy");
        System.out.println("Lucy is male? " + isMale.interpret(ctx3));
    }
}
