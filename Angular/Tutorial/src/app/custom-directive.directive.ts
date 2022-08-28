import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appCustomDirective]'
})

export class CustomDirectiveDirective {

  constructor(private er : ElementRef) { 

    er.nativeElement.style.color = 'red'
  }

}
