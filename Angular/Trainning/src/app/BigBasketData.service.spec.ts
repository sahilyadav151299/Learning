/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { BigBasketDataService } from './BigBasketData.service';

describe('Service: BigBasketData', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [BigBasketDataService]
    });
  });

  it('should ...', inject([BigBasketDataService], (service: BigBasketDataService) => {
    expect(service).toBeTruthy();
  }));
});
