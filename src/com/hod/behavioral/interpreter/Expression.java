package com.hod.behavioral.interpreter;

public interface Expression {
    boolean interpret(Context ctx);
}

//Terminal Concrete
class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(Context ctx){
        return ctx.getResult(data);
    }
}

class OrExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(Context ctx){
        return expr1.interpret(ctx) || expr2.interpret(ctx);
    }
}

class AndExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(Context ctx){
        return expr1.interpret(ctx) && expr2.interpret(ctx);
    }
}