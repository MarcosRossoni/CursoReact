import {AfterViewInit, Component} from '@angular/core';
// @ts-ignore
import jQuery from 'jquery'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements AfterViewInit{
  title = 'CursoSpringBootAngularFrontend';

  ngAfterViewInit() {
    (function($) {
      "use strict";
      var path = window.location.href; // because the 'href' property of the DOM element is the absolute path
      $("#layoutSidenav_nav .sb-sidenav a.nav-link").each(function() {
        // @ts-ignore
        if (path === this.href) {
          // @ts-ignore
          $(this).addClass("active");
        } else {
          return;
        }
      });

      // @ts-ignore
      $("#sidebarToggle").on("click", function (e) {
        e.preventDefault();
        $("body").toggleClass("sb-sidenav-toggled");
      });
    })(jQuery);
  }
}
