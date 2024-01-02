import { Component, Input, OnInit } from '@angular/core';
import {MatTabsModule} from '@angular/material/tabs';

@Component({
  selector: 'cliente',
  standalone: true,
  templateUrl: 'cliente.component.html',
  imports:[
    MatTabsModule
  ]
})



export class ClienteComponent implements OnInit {


  constructor() {}

  ngOnInit(): void {
  }
 
}
