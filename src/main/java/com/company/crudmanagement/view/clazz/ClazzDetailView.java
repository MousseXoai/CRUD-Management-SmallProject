package com.company.crudmanagement.view.clazz;

import com.company.crudmanagement.entity.Clazz;
import com.company.crudmanagement.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "clazzes/:id", layout = MainView.class)
@ViewController("Clazz.detail")
@ViewDescriptor("clazz-detail-view.xml")
@EditedEntityContainer("clazzDc")
public class ClazzDetailView extends StandardDetailView<Clazz> {
}