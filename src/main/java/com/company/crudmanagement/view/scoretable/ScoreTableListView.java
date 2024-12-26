package com.company.crudmanagement.view.scoretable;

import com.company.crudmanagement.entity.ScoreTable;
import com.company.crudmanagement.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "scoreTables", layout = MainView.class)
@ViewController("ScoreTable.list")
@ViewDescriptor("score-table-list-view.xml")
@LookupComponent("scoreTablesDataGrid")
@DialogMode(width = "64em")
public class ScoreTableListView extends StandardListView<ScoreTable> {
}