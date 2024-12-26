package com.company.crudmanagement.view.scoretable;

import com.company.crudmanagement.entity.ScoreTable;
import com.company.crudmanagement.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "scoreTables/:id", layout = MainView.class)
@ViewController("ScoreTable.detail")
@ViewDescriptor("score-table-detail-view.xml")
@EditedEntityContainer("scoreTableDc")
public class ScoreTableDetailView extends StandardDetailView<ScoreTable> {
}