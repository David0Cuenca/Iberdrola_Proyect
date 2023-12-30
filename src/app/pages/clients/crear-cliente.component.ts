import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

import { ClienteService } from 'app/shared/service/cliente.service';

@Component({
  selector: 'crear-cliente',
  templateUrl: 'crear-cliente.component.html',
})

export class CrearClienteComponent implements OnInit {
  clienteForm: FormGroup;

  constructor(private fb: FormBuilder, private clienteservice: ClienteService) {}

  ngOnInit(): void {
    this.inicializarFormulario();
  }


  
  private inicializarFormulario(): void {
    this.clienteForm = this.fb.group({
      dni: ['', [Validators.required, Validators.pattern(/^\d{8,9}$/)]],
      nombre: ['', [Validators.required]],
      nacimiento: ['', [Validators.required]],
      domicilio: ['', [Validators.required]],
    });
  }

  enviarFormulario(): void {
    if (this.clienteForm.valid) {
      const nuevoCliente = this.clienteForm.value;
      this.clienteservice.crearCliente(nuevoCliente).subscribe(
        (cliente) => {
          console.log('Cliente creado exitosamente:', cliente);
          // Puedes redirigir a otra página o realizar otras acciones después de la creación.
        },
        (error) => {
          console.error('Error al crear el cliente:', error);
        }
      );
    }
  }
}