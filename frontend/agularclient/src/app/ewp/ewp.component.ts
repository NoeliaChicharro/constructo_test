import {Component, OnInit, ViewChild} from '@angular/core';
import {ColDef} from "ag-grid-community";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {AgGridAngular} from "ag-grid-angular";

@Component({
  selector: 'app-ewp',
  templateUrl: './ewp.component.html',
  styleUrls: ['./ewp.component.scss']
})
export class EwpComponent implements OnInit {
  @ViewChild('agGrid') agGrid!: AgGridAngular;

  columnDefs: ColDef[] = [
    {field: "make", sortable: true, filter: true, checkboxSelection: true},
    {field: "model", sortable: true, filter: true},
    {field: "price", sortable: true, filter: true}
  ];

  rowData = new Observable<any[]>();

  constructor(private http: HttpClient) {
    this.rowData = this.http.get<any[]>('https://www.ag-grid.com/example-assets/small-row-data.json');
  }

  ngOnInit(): void {
  }

  getSelectedRows(): void{
    const selectedNodes = this.agGrid.api.getSelectedNodes(); // api is undefined
    const selectedData = selectedNodes.map(node => node.data);
    const selectedDataStringPresentation = selectedData.map(node => `${node.make} ${node.model}`).join(", ");

    alert(`Selected node: ${selectedDataStringPresentation}`);
  }

}
