/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { ProductsdataService } from './productsdata.service';

describe('Service: Productsdata', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ProductsdataService]
    });
  });

  it('should ...', inject([ProductsdataService], (service: ProductsdataService) => {
    expect(service).toBeTruthy();
  }));
});
