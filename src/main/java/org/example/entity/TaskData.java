package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> unassignedTasks,
                    Set<Task> bobsTasks, Set<Task> carolTasks) {
        this.annsTasks = annsTasks ;
        this.unassignedTasks = unassignedTasks ;
        this.bobsTasks = bobsTasks ;
        this.carolsTasks = carolTasks ;
    }

    public Set<Task> getUnion(Set<Task>... sets){
        Set<Task> unionSet = new HashSet<>();
    for(Set<Task> set : sets){
    unionSet.addAll(set);
}
return unionSet;
    }

    public Set<Task> getIntersection(Set<Task> set1 , Set<Task> set2){
        Set<Task> intersectionArray = new HashSet<>(set1) ;
        intersectionArray.retainAll(set2);
        return intersectionArray;
    }
//removeAll ile aralarındaki farkı buluyoruz . new HashSet<>(set1) -> set1 in kopyasını differenceArray a atar.
    public Set<Task> getDifferences(Set<Task> set1,Set<Task>set2){
        Set<Task> differenceArray = new HashSet<>(set1);
        differenceArray.removeAll(set2);
    return differenceArray;
    }




    public Set<Task> getTasks(String name){
      switch (name){
          case "ann":
              return annsTasks;
          case "bob":
              return bobsTasks;
         case "carol":
           return carolsTasks;
          case "all" :
              Set<Task> newSet = new HashSet<>();
              newSet.addAll(annsTasks);
              newSet.addAll(bobsTasks);
              newSet.addAll(carolsTasks);
              newSet.addAll(unassignedTasks);
              return newSet;
          default:
              return null;
      }
    }

    @Override
    public String toString() {
        return "TaskData{" +
                "annsTasks=" + annsTasks +
                ", bobsTasks=" + bobsTasks +
                ", carolTasks=" + carolsTasks +
                ", unassignedTasks=" + unassignedTasks +
                '}';
    }
}
