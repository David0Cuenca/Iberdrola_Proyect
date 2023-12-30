import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { CrearClienteComponent } from './crear-cliente.component';
import {MatTabsModule} from '@angular/material/tabs';

@NgModule({
  declarations: [
    CrearClienteComponent
],
  imports: [
    CommonModule, 
    ReactiveFormsModule,
    MatTabsModule
],
  exports: [
    CrearClienteComponent
]
})
export class CrearClienteModule {}