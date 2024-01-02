import { Component, OnInit } from '@angular/core';

import { Cliente } from '../../interfaces/cliente';
import { ClienteService } from 'app/shared/service/cliente.service';
import { error } from 'console';

@Component({
    selector: 'table-cmp',
    moduleId: module.id,
    templateUrl: 'table.component.html'
})

export class TableComponent implements OnInit{
    
    public users: any[]=[];
    constructor(private clienteservice: ClienteService){}

    ngOnInit(): void {
        this.clienteservice.obtenerClientes().subscribe(
            (data) => {
                this.users = data;
            },
            (error) => {
                console.error('Error al obtener usuarios: ', error)
            }
        )
        
    }

}
