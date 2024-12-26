package com.company.crudmanagement.view.student;

import com.company.crudmanagement.entity.Student;
import com.company.crudmanagement.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "students", layout = MainView.class)
@ViewController("Student.list")
@ViewDescriptor("student-list-view.xml")
@LookupComponent("studentsDataGrid")
@DialogMode(width = "64em")
public class StudentListView extends StandardListView<Student> {
}