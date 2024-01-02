import { Component, OnInit } from '@angular/core';

import { Cliente } from '../../interfaces/cliente';

@Component({
    selector: 'table-cmp',
    moduleId: module.id,
    templateUrl: 'table.component.html'
})

export class TableComponent implements OnInit{
    public tableData1: Cliente;
    ngOnInit(){
        this.tableData1 = {
            dni : '1' ,
            nombre: 'Juan',
            apellidos: 'Perez',
            domicilio: 'Calle falsa 123',
            nacimiento: new Date(2023,12,4)
        };
    }
}
