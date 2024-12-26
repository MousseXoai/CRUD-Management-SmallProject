package com.company.crudmanagement.view.clazz;

import com.company.crudmanagement.entity.Clazz;
import com.company.crudmanagement.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "clazzes", layout = MainView.class)
@ViewController("Clazz.list")
@ViewDescriptor("clazz-list-view.xml")
@LookupComponent("clazzesDataGrid")
@DialogMode(width = "64em")
public class ClazzListView extends StandardListView<Clazz> {
}