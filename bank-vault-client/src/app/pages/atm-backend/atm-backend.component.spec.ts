import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AtmBackendComponent } from './atm-backend.component';

describe('AtmBackendComponent', () => {
  let component: AtmBackendComponent;
  let fixture: ComponentFixture<AtmBackendComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AtmBackendComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AtmBackendComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
