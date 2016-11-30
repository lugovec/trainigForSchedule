package sample;

import javafx.beans.property.SimpleSetProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableSet;

import java.util.Set;


/**
 * Created by andrey on 30.11.16.
 */
public class Class {

    private ObservableSet<String> lessons = FXCollections.observableSet("math", "literature", "history", "english");

    public void print() {

        for (int i = 0; i < lessons.toArray().length; i++) // перебор всех элементов  в цикле for
            System.out.print( (lessons.toArray()[i]) + " " );
    }



}
