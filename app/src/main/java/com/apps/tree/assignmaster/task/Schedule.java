package com.apps.tree.assignmaster.task;

import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by zabie on 4/5/2016.
 */
public class Schedule extends SugarRecord{
    private ArrayList<Task> tasks;

    public void getTasks(){
        tasks = (ArrayList<Task>) Task.listAll(Task.class);
    }

    public void setTasks(ArrayList<Task> tasks){
        this.tasks = tasks;
    }

    //TODO
    public void getMonthTasks(Date date){

    }

    //TODO
    public ArrayList<Task> getDayTasks(Date date){
        //
        // Task.find(Task.class, )
        return null;
    }

    //TODO
    public void getWeekTasks(Date date){

    }

    //TODO
    public ArrayList<Task> order(){
        return null;
    }

    public ArrayList<Task> fetchTasks(){
        return this.tasks;
    }
}
