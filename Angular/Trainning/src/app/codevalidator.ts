import { AbstractControl } from '@angular/forms';

export function validCode(control:AbstractControl){

    let validCodes = ['CODE12', 'CODE45', 'CODE54']

    if(validCodes.indexOf(control.value) >= 0){
        return null
    }
    else{
        return { invalidCode : true}
    }     

}