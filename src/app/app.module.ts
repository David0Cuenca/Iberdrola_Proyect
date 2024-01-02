import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { ToastrModule } from "ngx-toastr";

import { SidebarModule } from './sidebar/sidebar.module';
import { FooterModule } from './shared/footer/footer.module';
import { NavbarModule} from './shared/navbar/navbar.module';
import { FixedPluginModule} from './shared/fixedplugin/fixedplugin.module';

import { AppComponent } from './app.component';
import { AppRoutes } from './app.routing';

import { AdminLayoutComponent } from './layouts/admin-layout/admin-layout.component';
import { ClienteService } from "./shared/service/cliente.service";
import { ShowClientComponent } from './components/show-client/show-client.component';
import { DeleteClientComponent } from './components/delete-client/delete-client.component';
import { EditClientComponent } from './components/edit-client/edit-client.component';
import { AddClientComponent } from "./components/add-client/add-client.component";



@NgModule({
  declarations: [
    AppComponent,
    AdminLayoutComponent,
    AddClientComponent,
    ShowClientComponent,
    DeleteClientComponent,
    EditClientComponent],
  imports: [
    BrowserAnimationsModule,
    RouterModule.forRoot(AppRoutes,{
      useHash: true
    }),
    SidebarModule,
    NavbarModule,
    ToastrModule.forRoot(),
    FooterModule,
    FixedPluginModule,
  ],
  providers: [ClienteService],
  bootstrap: [AppComponent]
})
export class AppModule { }
