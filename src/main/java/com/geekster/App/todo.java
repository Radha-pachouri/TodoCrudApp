package com.geekster.App;

public class todo {
    private Integer todoId;
    private String todoName;
    private boolean todoStatus;

    public todo(String todoName, Integer todoId, boolean todoStatus) {
        this.todoName = todoName;
        this.todoId = todoId;
        this.todoStatus = todoStatus;
    }

    public boolean isTodoStatus() {
        return todoStatus;
    }

    public void setTodoStatus(boolean todoStatus) {
        this.todoStatus = todoStatus;
    }

    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public Integer getTodoId() {
        return todoId;
    }

    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }
}
