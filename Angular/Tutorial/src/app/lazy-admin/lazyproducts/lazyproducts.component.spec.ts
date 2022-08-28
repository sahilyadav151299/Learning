import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LazyproductsComponent } from './lazyproducts.component';

describe('LazyproductsComponent', () => {
  let component: LazyproductsComponent;
  let fixture: ComponentFixture<LazyproductsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LazyproductsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LazyproductsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
