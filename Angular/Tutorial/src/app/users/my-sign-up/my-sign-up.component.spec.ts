import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MySignUpComponent } from './my-sign-up.component';

describe('MySignUpComponent', () => {
  let component: MySignUpComponent;
  let fixture: ComponentFixture<MySignUpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MySignUpComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MySignUpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
